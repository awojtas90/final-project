package task2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class Order {
    public static void main(String[] args) {
        //przypisanie lokatorów zmiennym
        String signIn = "//*[@id=\"_desktop_user_info\"]/div/a";
        String email = "email";
        String password = "password";
        String submitLogin = "submit-login";
        String searchProduct = "//*[@id=\"search_widget\"]/form/input[2]";
        String searchSubmit = "//*[@id=\"search_widget\"]/form/button";
        String product = "//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2/a";
        String sizeOption = "//*[@id=\"group_1\"]/option[2]";
        String quantity = "//*[@id=\"quantity_wanted\"]";
        String addToCart = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button";
        String proceedToCheckout = "//*[contains(text(),'Proceed to checkout')]";
        String address = "address1";
        String postcode = "postcode";
        String city = "city";
        String country = "id_country";
        String phone = "phone";
        String submitAddress = "//*[@id=\"checkout-delivery-step\"]/h1";
        String deliveryOption = "//*[@id=\"js-delivery\"]/div/div[1]/div[1]/label";
        String paymentOption = " //*[@id=\"checkout-payment-step\"]/h1";
        String choosePaymentOption = "//*[@id=\"payment-option-1-container\"]/label/span";
        String acceptCondition = "//*[@id=\"conditions-to-approve\"]/ul/li/div[2]/label";
        String submitPayment = "//*[@id=\"payment-confirmation\"]/div[1]/button";
        String account = ".account";
        String history = "history-link";
        String orderNumber = "//*[@id=\"content\"]/div/div[1]/div/div[1]/a/h3";
        String orderTotal = "//*[contains(text(), '143.60')]";
        String orderStatus = "//*[contains(text(), 'Awaiting check payment')]";
        //łączenie z przeglądarką
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
        //logowanie
        driver.findElement(By.xpath(signIn)).click();
        driver.findElement(By.name(email)).sendKeys("aga13421367@o2.pl");
        driver.findElement(By.name(password)).sendKeys("aga1234");
        driver.findElement(By.id(submitLogin)).click();
        //wyszukanie produktu
        driver.findElement(By.xpath(searchProduct)).sendKeys("Hummingbird Printed Sweater");
        driver.findElement(By.xpath(searchSubmit)).click();
        driver.findElement(By.xpath(product)).click();
        //opcja dodatkowa - sprawdzenie wysokości rabatu
        String regularPrice = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[1]/span")).getText();;
        String a = regularPrice.substring(1, regularPrice.length());
        String discountPrice = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[2]/div/span[1]")).getText();
        String b = discountPrice.substring(1, discountPrice.length());
        System.out.println("Regular price is: " + a);
        System.out.println("Discounted price is: " + b);
        Double d = Double.parseDouble(a);
        Double e = Double.parseDouble(b);
        double result = e / d;
        double result2 = (1 - result) * 100;
        System.out.print("Discount is: ");
        System.out.format("%.0f%n", result2);
        //wybranie rozmiaru i ilości
        driver.findElement(By.xpath(sizeOption)).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement quantityM = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(quantity)));
        quantityM.click();
        driver.findElement(By.xpath(quantity)).clear();
        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        WebElement quantityM2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(quantity)));
        quantityM2.click();
        driver.findElement(By.xpath(quantity)).clear();
        driver.findElement(By.xpath(quantity)).sendKeys("5");
        //dodanie produktów do koszyka
        driver.findElement(By.xpath(addToCart)).click();
        WebDriverWait wait3 = new WebDriverWait(driver, 10);
        WebElement confirmInputBox = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(proceedToCheckout)));
        confirmInputBox.click();
        WebDriverWait wait4 = new WebDriverWait(driver, 10);
        WebElement confirmInputBox2 = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(proceedToCheckout)));
        confirmInputBox2.click();
        //dodawanie adresu
        driver.findElement(By.name(address)).sendKeys("Wiosenna 13");
        driver.findElement((By.name(postcode))).sendKeys("54-550");
        driver.findElement(By.name(city)).sendKeys("Poznań");
        driver.findElement(By.name(country)).click();
        driver.findElement(By.name(country)).sendKeys("United Kingdom");
        driver.findElement(By.name(phone)).sendKeys("897456799");
        //przejście do metody dostawy
        driver.findElement(By.xpath(submitAddress)).click();
        driver.findElement(By.xpath(deliveryOption)).click();
        //przejście do metody płatności
        driver.findElement(By.xpath(paymentOption)).click();
        driver.findElement(By.xpath(choosePaymentOption)).click();
        driver.findElement(By.xpath(acceptCondition)).click();
        driver.findElement(By.xpath(submitPayment)).click();
        //screenshot z potwierdzeniem zamówienia
        File screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        String fileName;
        try {
            FileUtils.copyFile(screenshot, new File("Pulpit.checkOrder.jpg"));
        } catch (
                IOException y) {
            y.printStackTrace();
            driver.close();}
        //część dodatkowa - sprawdzenie statusu zamówienia
        driver.findElement(By.cssSelector(account)).click();
        driver.findElement(By.id(history)).click();
        assertTrue(
                driver.findElement(
                        By.xpath(orderNumber)
                ).isEnabled());
        if (driver.findElement(
                By.xpath((orderTotal))).isEnabled()) {
            System.out.println("Total price is correct");
        } else {
            System.out.println("Total price is incorrect");}
        if (driver.findElement(
                By.xpath((orderStatus))).isEnabled()) {
            System.out.println("Status is correct");
        } else System.out.println("Status is incorrect");}}
