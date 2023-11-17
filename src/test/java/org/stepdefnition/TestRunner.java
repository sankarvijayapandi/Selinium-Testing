package org.stepdefnition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
 glue = "org.stepdefinition",
monochrome = true,
snippets = SnippetType.UNDERSCORE,
tags = "@Sanity"
)
public class TestRunner {

}
