package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestWebElement extends DriverSetup{

    @Test
    public void TestElement() throws InterruptedException {
//        browser.get("https://trytestingthis.netlify.app/");

//        System.out.println(browser.getTitle());

//        WebElement header = browser.findElement(By.tagName("h1"));
//        System.out.println(header.getText());
//
//        WebElement firstname = browser.findElement(By.id("fname"));
//        firstname.sendKeys("Saraban Tasnim");
//        Thread.sleep(1000);
//
//        WebElement lastname = browser.findElement(By.name("lname"));
//        lastname.sendKeys("Sharin");
//        Thread.sleep(1000);

//        getting another browser
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement text = browser.findElement(By.className("ui-autocomplete-input"));
        text.sendKeys("Bangladesh");
        Thread.sleep(1000);

//        WebElement freeAccessLinkText = browser.findElement(By.partialLinkText("Free Access to InterviewQues"));
//        freeAccessLinkText.click();
//        Thread.sleep(5000);

//        WebElement openTab = browser.findElement(By.linkText("Open Tab"));
//        openTab.click();
//        Thread.sleep(1000);

        WebElement radioButton = browser.findElement(By.cssSelector("input[value=\"radio2\"]"));
        radioButton.click();
        Thread.sleep(1000);

        WebElement selectDropdown = browser.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
        selectDropdown.click();
        Thread.sleep(5000);

    }

}
