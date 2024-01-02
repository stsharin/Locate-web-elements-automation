package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAWebPage extends DriverSetup{

    @Test
    public void openAPageAndTestTitle() {
//        WebDriver browser = new ChromeDriver();

        browser.get("https://mvnrepository.com/");
        // System.out.println(browser.getTitle());
        // comparing two titles
        Assert.assertEquals(browser.getTitle(), "Maven Repository: Search/Browse/Explore");

    }
    @Test
    public void openGooglePageAndTestTitle(){
        browser.get("https://google.com/");
        Assert.assertEquals(browser.getTitle(), "Google");
    }

}
