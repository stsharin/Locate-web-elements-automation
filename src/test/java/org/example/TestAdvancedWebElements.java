package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestAdvancedWebElements extends DriverSetup {
    @Test
    public void TestAdvancedElements() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app/");
        System.out.println(browser.findElement(By.cssSelector("h1[style=\"font-family:Arial;\"]")).getText());

//       9. parent child
        System.out.println(browser.findElement(By.cssSelector("div>h2")).getText());
        System.out.println(browser.findElement(By.xpath("//fieldset/label")).getText());

//       10. multiple attribute
        System.out.println(browser.findElement(By.xpath("//a[@class=\"button bar-item\" and @href=\"/contact\"]")).getText());

//       11. sub-string
//        starts-with
        System.out.println(browser.findElement(By.xpath("//button[starts-with(@onclick, \" window.open('http://google\")]")).getText());

//        contains
        System.out.println(browser.findElement(By.xpath("//button[contains(@onclick, \"//google.com\")]")).getText());

//        using ^
        System.out.println(browser.findElement(By.cssSelector("button[onclick^=\" window.open('http://google\"]")).getText());
    }

}
