package task1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class userDataSteps {
    private WebDriver driver;
    private userData ddgPage;

    @Given("^Page (.*) opened in browser$")
    public void openPageInBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get(url);
        ddgPage = new userData(driver); }
    @When("^User click SignIn$")
    public void userClickSignIn() {
        ddgPage.clickSignInButton2();
    }
    @When("^fill Email$")
    public void fillEmail() {
        ddgPage.enterEmail2();
    }
    @And("^User fill Password$")
    public void enterPassword() {
        ddgPage.enterPassword2();
    }
    @And("^Submit Sign In button$")
    public void submitSignInButton() {
        ddgPage.submitButton2();}
    @Then ("^User see accountPage$")
    public void accountPage(){
        ddgPage.visiblePage();}
    @When ("^User click Addresses$")
    public void clickAddressesButton(){
        ddgPage.addressesButton2();   }
    @And ("^enter parametr1(.*)$")
    public void enterAlias(String alias){
        ddgPage.enterAlias(alias);}
    @And ("^enter parametr2(.*)$")
    public void enterAddress(String address){
        ddgPage.enterAddress(address);}
    @And ("^enter parametr3(.*)$")
    public void enterCity(String city){
        ddgPage.enterCity(city);}
    @And ("^enter parametr4(.*)$")
    public void enterPostcode(String postcode){
        ddgPage.enterPostcode(postcode);}
    @And ("^enter parametr5(.*)$")
    public void enterCountry(String country){
        ddgPage.enterCountry(country);}
    @And ("^enter parametr6(.*)$")
    public void enterPhoneNumber(String phone){
        ddgPage.enterPhoneNumber(phone);}
    @And ("^submit AddressData$")
    public void submitAddressData(){
        ddgPage.setSubmitAddressesButton();}
    @Then ("^address data are added$")
    public void addressBodyPage(){
        ddgPage.setAddressBody2();
        File screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        String fileName;
        try {
            FileUtils.copyFile(screenshot, new File("Pulpit.checkAddressDataAdded.jpg"));
        } catch (
                IOException e) {
            e.printStackTrace();}}
    @And ("^address data are deleted$")
    public void deleteAddressData(){
        ddgPage.deleteAddressData2();
    File screenshot = ((TakesScreenshot) driver)
            .getScreenshotAs(OutputType.FILE);
    String fileName;
        try {
        FileUtils.copyFile(screenshot, new File("Pulpit.checkAddressDataDeleted.jpg"));
    } catch (
    IOException e) {
        e.printStackTrace();}}
    @And("^Close browser$")
    public void closeBrowser() {
        driver.close();
    }}

