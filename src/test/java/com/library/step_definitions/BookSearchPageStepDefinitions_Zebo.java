package com.library.step_definitions;

import com.library.pages.BookSearchPage_Zebo;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookSearchPageStepDefinitions_Zebo {
BookSearchPage_Zebo bookSearchPage_zebo=new BookSearchPage_Zebo();

    @Given("The librarian is on the Home page")
    public void the_librarian_is_on_the_home_page() {
        String url = ConfigurationReader.getProperty("qa2_url");
        Driver.getDriver().get(url);
    }

    @When("librarian click Books module")
    public void librarian_click_module(String string) {
    bookSearchPage_zebo.booksModule.click();
    }

    @When("librarian search for books  Borrowed by  option")
    public void librarian_search_for_books_by_option(String string) {
        bookSearchPage_zebo.searchBox.sendKeys("Test Student 93");
    }
    @Then("System should display all the books in the {string} table.")
    public void system_should_display_all_the_books_in_the_table(String string) {

    }

//hello

}
