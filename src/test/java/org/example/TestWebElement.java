package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestWebElement extends DriverSetup{

    @Test
    public void TestElement() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app/");
//        System.out.println(browser.getTitle());
//        getting the header
        WebElement header = browser.findElement(By.tagName("h1"));
        System.out.println(header.getText());

//        writing in the input field
        WebElement firstname = browser.findElement(By.id("fname"));
        firstname.sendKeys("Saraban Tasnim");
        Thread.sleep(2000);

        WebElement lastname = browser.findElement(By.name("lname"));
        lastname.sendKeys("Sharin");
        Thread.sleep(5000);

//        getting another browser
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
    }

}
