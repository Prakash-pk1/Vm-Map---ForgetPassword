package org.path;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prakash\\eclipse-workspace\\practice\\Vm-ForgetPassword\\src\\test\\resources\\for.feature\\forget.feature",
                 glue="org.path",
                 dryRun=false)

public class RunPath {

}
