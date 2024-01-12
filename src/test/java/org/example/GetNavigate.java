package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class GetNavigate extends DriverSetup{
    @Test
    public void testGetNav() throws InterruptedException {
//        get
        browser.get("https://trytestingthis.netlify.app");
        System.out.println(browser.getTitle());
        Thread.sleep(3000);
//        navigate
        browser.navigate().to ("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(browser.getTitle());
        Thread.sleep(3000);
//        back arrow
        browser.navigate().back();
        System.out.println(browser.getTitle());
        Thread.sleep(3000);
//        forward arrow
        browser.navigate().forward();
        System.out.println(browser.getTitle());
        Thread.sleep(5000);
//        refresh
        browser.navigate().refresh();
        Thread.sleep(5000);
    }
    @Test
    public void testBrowserWindow() throws InterruptedException {
        browser.get("https://trytestingthis.netlify.app");
        System.out.println(browser.getTitle());
        Thread.sleep(1000);
//        new Tab
        browser.switchTo().newWindow(WindowType.TAB);
        browser.navigate().to ("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(browser.getTitle());
        Thread.sleep(1000);
//        new Window
        browser.switchTo().newWindow(WindowType.WINDOW);
        browser.navigate().to("https://facebook.com");
        System.out.println(browser.getTitle());
        Thread.sleep(1000);

//        minimize
        browser.manage().window().minimize();
        Thread.sleep(3000);
//        maximize
        browser.manage().window().maximize();
        Thread.sleep(3000);
//        full screen
        browser.manage().window().fullscreen();
        Thread.sleep(3000);
//        current site url
        System.out.println(browser.getCurrentUrl());
//        particular one tab close
        browser.close();
//        all close
        browser.quit();
    }
    @Test
    public void testBrowserWindowHandle() throws InterruptedException {
//        Part - 5
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(browser.getTitle());

//        unique window identification number
        System.out.println(browser.getWindowHandle());
        Thread.sleep(1000);

        browser.findElement(By.id("openwindow")).click();
        Thread.sleep(1000);
        System.out.println(browser.getTitle());
        browser.findElement(By.id("opentab")).click();
        Thread.sleep(1000);
        System.out.println(browser.getTitle());

//        identification number in List
        List<String> browserWindowHandles = new ArrayList<>(browser.getWindowHandles());

        System.out.println(browserWindowHandles.get(0));
        System.out.println(browserWindowHandles.get(1));
        System.out.println(browserWindowHandles.get(2));

//        each window title
        browser.switchTo().window(browserWindowHandles.get(1));
        System.out.println(browser.getTitle());
        browser.switchTo().window(browserWindowHandles.get(0));
        System.out.println(browser.getTitle());
        browser.switchTo().window(browserWindowHandles.get(2));
        System.out.println(browser.getTitle());
    }

}
