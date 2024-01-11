package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElements extends DriverSetup{
    @Test
    public void testInteractionOfWebElement() throws InterruptedException {
//        Part-4
        browser.get("https://trytestingthis.netlify.app");

        WebElement firstNameInputBox = browser.findElement(By.xpath("//input[@id='fname']"));
        firstNameInputBox.sendKeys("John Doe");
        browser.findElement(By.xpath("//label[@for='male']")).click();
        Thread.sleep(5000);

//        clearing the text box
        firstNameInputBox.clear();
        Thread.sleep(5000);

//        attribute value
        String value =  browser.findElement(By.xpath("//input[@id='male']")).getAttribute("type");
        System.out.println(value);

//        css value
        String cssValue =  browser.findElement(By.xpath("//label[@for='male']")).getCssValue("font-size");
        System.out.println(cssValue);

//        text
        String elementText =  browser.findElement(By.xpath("//label[@for='male']")).getText();
        System.out.println(elementText);

//        displays true or false
        Boolean displayed = browser.findElement(By.xpath("//label[@for='male']")).isDisplayed();
        System.out.println(displayed);

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

//        before and after clicking Hide button
        displayed = browser.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println("Before clicking on the hide button:  " + displayed );
        browser.findElement(By.xpath("//input[@id='hide-textbox']")).click();
        displayed = browser.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println("After clicking on the hide button:  " + displayed );

//        enable or disable
        Boolean enable = browser.findElement(By.xpath("//input[@id='displayed-text']")).isEnabled();
        System.out.println( enable );

//        before and after selecting an element
        Boolean select = browser.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
        System.out.println("Before select: " + select);
        browser.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        select = browser.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
        System.out.println("After select: " + select);
    }

}
