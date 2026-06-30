package ru.education_services.qa_scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final String URL = "https://qa-scooter.education-services.ru/";

    private final String disclaimerXpath = "//div[@class='Header_Disclaimer__3VEni']";

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(URL);
    }

    public String getTextDisclaimer() {
        return driver.findElement(By.xpath(disclaimerXpath)).getText();
    }
}
