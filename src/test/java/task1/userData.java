package task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userData {
    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a")
    public WebElement logInButton;
    @FindBy(name = "email")
    public WebElement enterEmail;
    @FindBy(name = "password")
    public WebElement enterPassword;
    @FindBy(id = "submit-login")
    public WebElement submitButton;
    @FindBy(xpath = "//*[contains(text(),'Your account')]")
    public WebElement accountPage;
    @FindBy(xpath = "//*[contains(text(),'Delete')]")
    public WebElement deleteData;

    public userData(WebDriver driver) {
        PageFactory.initElements(driver, this); }
//    public userData() {
//    }
    public void clickSignInButton2(){
        logInButton.click();
    }
    public void enterEmail2(){
        enterEmail.sendKeys("aga13421367@o2.pl");
    }
    public void enterPassword2() {
        enterPassword.sendKeys("aga1234");
    }
    public void submitButton2(){
        submitButton.click();}
    public void visiblePage() {
        accountPage.isEnabled(); }
    @FindBy(xpath = "//*[@id=\"address-link\"]/span")
    private WebElement addressesButton;
    @FindBy(name = "alias")
    private WebElement enterAlias;
    @FindBy(name = "address1")
    private WebElement enterAddress;
    @FindBy(name = "postcode")
    private WebElement enterPostcode;
    @FindBy(name = "city")
    private WebElement enterCity;
    @FindBy(name = "phone")
    private WebElement enterPhoneNumber;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select")
    private WebElement enterCountry;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/footer/button")
    private WebElement submitAddressesButton;
    @FindBy (css = ".address-body")
    private WebElement addressBody;

    public void addressesButton2() {
        addressesButton.click(); }
    public void enterAlias(String alias){
        enterAlias.sendKeys(alias);}
    public void enterAddress(String address) {
        enterAddress.sendKeys(address);}
    public void enterCity(String city) {
        enterCity.sendKeys(city);}
    public void enterPostcode(String postcode) {
        enterPostcode.sendKeys(postcode);}
    public void enterCountry(String country){
        enterCountry.sendKeys(country); }
    public void enterPhoneNumber(String phone) {
        enterPhoneNumber.sendKeys(phone);}
    public void setSubmitAddressesButton() {
        submitAddressesButton.click();}
    public void setAddressBody2() {
        addressBody.isEnabled(); }
        public void deleteAddressData2(){
            deleteData.click(); }}

