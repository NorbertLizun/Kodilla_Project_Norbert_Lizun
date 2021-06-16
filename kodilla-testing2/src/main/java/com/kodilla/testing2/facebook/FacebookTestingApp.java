package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIE_ACCEPT = "//button[@class=\"_42ft _4jy0 _9o-t _4jy3 _4jy1 selected _51sy\"]";
    public static final String XPATH_CREATE_ACCOUNT = "//div[@class=\"_6ltg\"][2]/a";



    public static void main(String[] args) throws InterruptedException {
         //
        // CreateAccount button

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement cookieAccept = driver.findElement(By.xpath(XPATH_COOKIE_ACCEPT));
        cookieAccept.click();

        WebElement createAccountButton = driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT));
        createAccountButton.click();

        Thread.sleep(1000);

        WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
        Select selectDay = new Select(day);
        selectDay.selectByValue("30");

        WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(10);

        WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1996");




    }
}
