package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.DriverFactory;
import util.ElementHelper;

public class qualityAssurancePage extends DriverFactory {

    ElementHelper elementHelper = new ElementHelper();


    private By seeAllQAJobs = By.className("btn btn-outline-secondary rounded text-medium mt-2 py-3 px-lg-5 w-100 w-md-50");
    private By filterByLocationTitle = By.cssSelector("#top-filter-form > div:nth-child(1) > label");
    private By location = By.cssSelector("#top-filter-form > div:nth-child(1) > span");
    private By locationIstanbulOptions = By.className("select2-filter-by-location-result-5b82-Istanbul, Turkey");
    private By department = By.id("select2-filter-by-department-container");
    private By departmentQAOptions = By.className("select2-filter-by-department-result-24m0-Quality Assurance");
    private By jobsList = By.id("jobs-list");
    private By positions = By.className("position-title font-weight-bold");
    private By viewRoles = By.className("btn btn-navy rounded pt-2 pr-5 pb-2 pl-5");
    private By applyForJobButton = By.className("postings-btn template-btn-submit shamrock");


    public void checkSeeAllQAJobs(){
        elementHelper.checkElementVisible(seeAllQAJobs);
    }

    public void clickSeeAllQAJobs(){
        elementHelper.click(seeAllQAJobs);
    }

    public void checkFilterByLocationTitle(){
        elementHelper.checkElementVisible(filterByLocationTitle);
    }

    public void clickLocation(){
        elementHelper.click(location);
    }

    public void clickLocationIstanbul(){
        elementHelper.click(locationIstanbulOptions);
    }

    public void clickDepartment(){
        elementHelper.click(department);
    }

    public void clickDepartmentQAOptions(){
        elementHelper.click(departmentQAOptions);
    }

    public void checkJobList(){
        elementHelper.checkElementVisible(jobsList);
    }

    // 3. case
    public void checkElementsContainsPositionQA(){
        elementHelper.checkElementsWithText(positions,"Quality Assurance");
    }

    // 4.case
    public void moveToMouseFirstPosition(){
        WebElement element = elementHelper.findElement(positions);
        elementHelper.moveToElement(element);
    }

    public void clickFirstPositionViewRole(){
        elementHelper.click(viewRoles);
    }

    public void checkApplyForJobButton(){
        elementHelper.checkElementVisible(applyForJobButton);
    }









}
