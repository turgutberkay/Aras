package pages;

import org.openqa.selenium.By;
import util.DriverFactory;
import util.ElementHelper;

public class homePage extends DriverFactory {

    ElementHelper elementHelper = new ElementHelper();

    private By homePage = By.className("home page-template page-template-layouts page-template-layout-home-23_g2 page-template-layoutslayout-home-23_g2-php page page-id-2815 wp-embed-responsive home-page has-announce e-lazyload elementor-default elementor-kit-960 elementor-page elementor-page-2815 scrolled nav-active");
    private By company = By.id("navbarDropdownMenuLink");
    private By companyDropdown = By.className("dropdown-menu new-menu-dropdown-layout-6 show");
    private By career = By.className("dropdown-sub");


    public void checkHomePage(){
        elementHelper.checkElementVisible(homePage);
    }

    public void clickCompany(){
        elementHelper.clickElementWithText(company,"Company");
    }

    public void checkCompanyDropdown(){
        elementHelper.checkElementVisible(companyDropdown);
    }
    public void clickCareer(){
        elementHelper.clickElementWithText(career,"Careers");
    }

}
