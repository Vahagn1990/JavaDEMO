package tests.searchappartments;

import org.junit.Test;
import tests.base.BaseTest;

import static constants.Constant.URLs.REALT_HOME_PAGE;

public class SearchApparmentsTest extends BaseTest {

    @Test
    public void checkIsRedirectToListing() {
        basePage.open(REALT_HOME_PAGE);
        realtHomePage
                .enterCountRooms()
                .clickToFind();

        realtListingPage.checkCountCards();
    }


}
