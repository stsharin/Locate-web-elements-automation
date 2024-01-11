package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestAdvancedWebElements extends DriverSetup {
    @Test
    public void TestAdvancedElements() throws InterruptedException {
//        WA Part - 3
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

//        more examples of xpath and css selector
        WebElement firstName = browser.findElement(By.xpath("//*[@id='fname']"));
        firstName.sendKeys("Hello World xpath");
        Thread.sleep(500);
        firstName.clear();
        firstName = browser.findElement(By.cssSelector("#fname"));
        firstName.sendKeys("Hello World cssSelector");
        Thread.sleep(500);

//       12. table elements
        System.out.println(browser.findElement(By.xpath("//tr /th[1]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[3]")).getText());
        System.out.println(browser.findElement(By.xpath("//tr /th[last()]")).getText());

        System.out.println(browser.findElement(By.cssSelector("tr > th:first-child")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr > th:nth-child(3)")).getText());
        System.out.println(browser.findElement(By.cssSelector("tr > th:last-child")).getText());

//        table elements with text (only xpath)
        System.out.println(browser.findElement(By.xpath("//td[text()='Personal Shopper']")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(),'ersonal Sh')]")).getText());
//        preceding and following sibling
        System.out.println(browser.findElement(By.xpath("//td[contains(text(),'Bong')] /preceding-sibling::td")).getText());
        System.out.println(browser.findElement(By.xpath("//td[contains(text(),'Bong')] /following-sibling::td[last()]")).getText());

    }

    @Test
    public void testEX() throws InterruptedException {
        browser.get("https://www.ebl.com.bd/");
        browser.findElement(By.xpath("//i[@class='fa fa-times']")).click();
        browser.findElement(By.xpath("//a[normalize-space()='Career']")).click();
        Thread.sleep(5000);

    }

}
