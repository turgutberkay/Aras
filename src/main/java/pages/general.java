package pages;

import util.DriverFactory;
import util.ElementHelper;

public class general extends DriverFactory {

    ElementHelper elementHelper = new ElementHelper();


    public void goToUrlHomePage(){
        elementHelper.goToUrl("https://useinsider.com/");
    }

    public void goToUrlQA(){
        elementHelper.goToUrl("https://useinsider.com/careers/quality-assurance/,");
    }

}
