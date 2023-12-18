package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import util.DriverFactory;
import util.ElementHelper;

public class careerPage extends DriverFactory {

    ElementHelper elementHelper = new ElementHelper();


    private By findYourDreamJobButton = By.className("btn btn-info rounded mr-0 mr-md-4 py-3");
    private By seeAllTeamsButton = By.className("btn btn-outline-secondary rounded text-medium mt-5 mx-auto py-3 loadmore");
    private By ourLocationsTitle = By.className("category-title-media ml-0");
    private By lifeAtInsider = By.className("elementor-heading-title elementor-size-default");



    public void checkFindYourDreamJobButton(){
        elementHelper.checkElementVisible(findYourDreamJobButton);
    }

    public void checkSeeAllTeamsButton(){
        elementHelper.checkElementVisible(seeAllTeamsButton);
    }

    public void checkOurLocationsTitle(){
        elementHelper.checkElementVisible(ourLocationsTitle);
    }

    public void checkTextOurLocationsTitle(){
        elementHelper.checkElementText(ourLocationsTitle,"Our Locations");
    }

    public void checkLifeAtInsider(){
        Assert.assertEquals(elementHelper.elementGetText(lifeAtInsider),"Life at Insider");
    }








}

