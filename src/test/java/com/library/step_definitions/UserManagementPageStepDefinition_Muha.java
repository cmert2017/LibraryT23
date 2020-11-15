package com.library.step_definitions;

import com.library.pages.UserManagementPage_Muha;
import com.library.utils.BrowserUtils_Muha;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserManagementPageStepDefinition_Muha {

    UserManagementPage_Muha userManagementPage_muha = new UserManagementPage_Muha();
    Select select;

    @When("user click on {string} link")
    public void i_click_on_link(String link) {
        BrowserUtils_Muha.waitForVisibility(userManagementPage_muha.dashboardPageLink, 5);

        switch (link.toLowerCase()){
            case "dashboard":
                userManagementPage_muha.dashboardPageLink.click();
                break;
            case "users":
                userManagementPage_muha.usersPageLink.click();
                break;
            case "books":
                userManagementPage_muha.booksPageLink.click();
                break;
        }
    }


    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer expected) {
        BrowserUtils_Muha.waitForVisibility(userManagementPage_muha.showRecordsDropdown, 5);
        select = new Select(userManagementPage_muha.showRecordsDropdown);
        String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected+"", actual);

    }



    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> options) {

        select = new Select(userManagementPage_muha.showRecordsDropdown);
        List<WebElement> webElements = select.getOptions();
        List<String> actualTexts = BrowserUtils_Muha.getElementsText(webElements);

        Assert.assertEquals(options, actualTexts);


    }






}
