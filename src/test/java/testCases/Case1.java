package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.careerPage;
import pages.general;
import pages.homePage;
import pages.qualityAssurancePage;
import util.DriverFactory;

import java.util.concurrent.TimeUnit;

public class Case1 extends DriverFactory {
    pages.careerPage careerPage;
    pages.general general;
    pages.homePage homePage;
    pages.qualityAssurancePage qualityAssurancePage;


    @BeforeMethod
    public void setUp(){
        getDriver();
    }

    @Test(priority=1)
    public void Test1(){
        general.goToUrlHomePage();
        homePage.checkHomePage();
        homePage.clickCompany();
        homePage.checkCompanyDropdown();
        homePage.clickCareer();
        careerPage.checkFindYourDreamJobButton();
        careerPage.checkSeeAllTeamsButton();
        careerPage.checkOurLocationsTitle();
        careerPage.checkTextOurLocationsTitle();
        careerPage.checkLifeAtInsider();
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
