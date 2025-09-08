package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class PortfolioTitleTest extends BaseTest {

    @Test
    public void verifyPortfolioTitle(){
        page.navigate("https://www.ahmed-hasan.wuaze.com");
        System.out.println("Portfolio Website Launched Successfully");
        System.out.println("The Page Title is : " + page.title());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
