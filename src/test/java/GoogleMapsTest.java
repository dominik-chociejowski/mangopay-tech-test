import com.mangopay.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class GoogleMapsTest extends TestBase {

    @Test(dataProvider = "language + Paris")
    public void searchBoxTestMultilanguage(String language, String city) {
        startChrome(language);
        startApp();
        googleMapsPage.typeIntoSearchBox(city);
        googleMapsPage.clickSearchButton();
        Assert.assertEquals(googleMapsPage.getHeadlineText(), city);
    }

    @Test(dataProvider = "language + London")
    public void destinationFieldTest(String language, String city) {
        startChrome(language);
        startApp();
        googleMapsPage.typeIntoSearchBox(city);
        googleMapsPage.clickSearchButton();
        Assert.assertEquals(googleMapsPage.getHeadlineText(), city);
        googleMapsPage.clickDirectionsButton();
        Assert.assertTrue(googleMapsPage.getDestinationFieldText().contains(city));
    }

    @DataProvider(name = "language + Paris")
    public Object[][] getData() {
        Object[][] myData = {{"en-GB", "Paris"}, {"pl", "Paryż"}, {"nl", "Parijs"}};
        return myData;
    }

    @DataProvider(name = "language + London")
    public Object[][] getData1() {
        Object[][] myData = {{"en-GB", "London"}, {"pl", "Londyn"}};
        return myData;
    }
}
