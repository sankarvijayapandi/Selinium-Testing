package org.inm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
		

	

public static WebDriver driver;		
	
	public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	}
	
	public static void WindowMaximize() {
	 driver.manage().window().maximize();
	}
	
	public static void launchUrl(String url) {
	driver.get(url);
	}
	
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}
	public static String PageUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static void passText( String string, WebElement ele) {
	   ele.sendKeys();
	}
	
	public static void closeEntireBrowser() {
		driver.quit();
	}
	public static void clickBtn(WebElement ele) {
	  ele.click();
	}
	
	public static void screenShot(String imgName)throws IOException{
	TakesScreenshot ts = (TakesScreenshot) driver;
	File image = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("location+ imgName.png");
	FileUtils.copyFile(image, f);
	}
	
	public static Actions a;
	
	public static void moveTheCurser(WebElement targetWebElement) {
    a = new Actions(driver);
	a.moveToElement(targetWebElement).perform();
	}
	
	public static void dragDrop(WebElement DragWebElement, WebElement dropElement) {
    a = new Actions(driver);
	a.dragAndDrop(DragWebElement, dropElement).perform();
	}
	
	public static JavascriptExecutor js;
	private static Workbook W;
	private static Object element;
	
	public static void ScrollThePage(WebElement tarwebele) {
	js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].ScrollIntoView(false)", element);
	
	}
	
	public static void excelRead(String sheetName,int rowNum,int cellNmae)throws IOException{
	File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Mavanproject\\Excel\\newfile.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb =newXSSFWorkbook(fis);
	Sheet mySheet = wb.getSheet("Data");
	Row r = mySheet.getRow(rowNum);
	Cell c = r.getCell(cellNmae);
	int cellType = c.getCellType();
	
	String value =" ";
	if (cellType==1) {
		String value2 = c.getStringCellValue();
	}
	
	else if (DateUtil.isCellDateFormatted(c)) {
		Date dd = c.getDateCellValue();
		SimpleDateFormat s = new SimpleDateFormat(value);
		String value1 = s.format(dd);
	} 
	
	else {
		double d = c.getNumericCellValue();
		long l = (long) d;
		String valueOf = String.valueOf(l);
	}

	}
	
	
	

	
	

	
	

	private static Workbook newXSSFWorkbook(FileInputStream fis) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void createNewExcelFile(int rowNum, int cellNum, String writeData)throws IOException{
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Mavanproject\\Excel\\newfile.xlsx");
        Workbook w = new XSSFWorkbook();
        Sheet newSheet = w.createSheet("Datas");
        Row newRow = newSheet.createRow(rowNum);
		Cell newCell = newRow.createCell(cellNum);
		newCell.setCellValue(writeData);
		FileOutputStream fos = new FileOutputStream(f);
        w.write(fos);
        
		
				
	}
	
	public static void createCell(int getRow,int createCell,String newData)throws IOException{
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Mavanproject\\Excel\\newfile.xlsx");
	    FileInputStream fis = new FileInputStream(f);
	    Workbook wb = new XSSFWorkbook(fis);
	    Sheet s = wb.getSheet("Datas");
	    Row r = s.getRow(getRow);
	    Cell c = r.createCell(createCell);
	    c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
        W.write(fos);
				
	}
	
	public static void CreateRow(int creRow, int creCell, String newData)throws IOException{
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Mavanproject\\Excel\\newfile.xlsx");
	    FileInputStream fis = new FileInputStream(f);
	    Workbook wb = new XSSFWorkbook(fis);
	    Sheet s = wb.getSheet("Datas");
	    Row r = s.getRow(creRow);
	    Cell c = r.createCell(creCell);
	    c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		W.write(fos);
	
	}
	
	public static void updateDataToParticularCell(int getTheRow, int getTheCell, String exisitingData, String writeNewData) throws IOException {
	    File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Mavanproject\\Excel\\newfile.xlsx");
        FileInputStream fis = new FileInputStream(f);
         Workbook wb = new XSSFWorkbook(fis); 
        Sheet s = wb.getSheet("Datas");
        Row r = s.getRow(getTheRow);
        Cell c = r.createCell(getTheCell);
	    String str = c.getStringCellValue();
	    if (str.equals(exisitingData)) {
			c.setCellValue(writeNewData);
		}
	
	   FileOutputStream fos = new FileOutputStream(f);
	   wb.write(fos);
	
	
	
	
	
	
	
	}	
	
}	

	

