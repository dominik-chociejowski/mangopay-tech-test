import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDefinitions extends GoogleMapsTest {

    @Given("^a user is on \"([^\"]*)\" Google Maps page$")
    public void a_user_is_on_the_google_maps_page(String language) {
        startChrome(language);
        startApp();
    }

    @When("^the user enters \"([^\"]*)\" in the search box")
    public void the_user_enters_paris_in_the_search_box(String city) {
        googleMapsPage.typeIntoSearchBox(city);
        System.out.println(city);
    }

    @When("clicks “Search”")
    public void clicks_search() {
        googleMapsPage.clickSearchButton();
    }

    @Then("^the left panel should have \"([^\"]*)\" as the headline text")
    public void the_left_panel_should_have_as_the_headline_text(String city) {
        Assert.assertEquals(googleMapsPage.getHeadlineText(), city);
    }

    @When("the user clicks the “Directions” button")
    public void the_user_clicks_the_directions_button() {
        googleMapsPage.clickDirectionsButton();
    }

    @Then("the destination field should contain {string}")
    public void the_destination_field_should_contain(String city) {
        Assert.assertTrue(googleMapsPage.getDestinationFieldText().contains(city));
    }

    @After("Teardown")
    public void terdown (){
        stopChrome();
    }
}
