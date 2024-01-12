package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleJSAlert extends DriverSetup {
//    Part-5
    @Test
    public void testDifferentAlerts() throws InterruptedException {
        browser.get("https://the-internet.herokuapp.com/javascript_alerts");

//        for 1st button
//        OK
        browser.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(5000);
//        switching to alert window
        Alert alertWindow = browser.switchTo().alert();
//        alert window text
        System.out.println(alertWindow.getText());
//        pressing OK
        alertWindow.accept();
//        Result text
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(), "You successfully clicked an alert");

//        for 2nd button
//        OK
        browser.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(), "You clicked: Ok");

//        CANCEL
        browser.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(), "You clicked: Cancel");

//        for 3rd button
//        text + OK
        browser.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Hello");
        alert.accept();
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(), "You entered: Hello");
//        text + cancel
        browser.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Hello");
        alert.dismiss();
        Assert.assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(), "You entered: null");
    }

}
