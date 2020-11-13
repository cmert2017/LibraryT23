package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_StepDefinitions_Bat {
LoginPage login = new LoginPage();
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        String url = ConfigurationReader.getProperty("libraryURL");
        Driver.getDriver().get(url);
    }



    @Then("I login as a {string}")
    public void i_login_as_a(String string) throws InterruptedException {
        Thread.sleep(3000);
        login.login(string );
        Thread.sleep(3000);


    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {


        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual.contains("dashboard"));





    }

}
