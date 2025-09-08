package tests;

import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;

public class PortfolioTitleTest {

    public static void main(String[] args) {


        try(Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://www.ahmed-hasan.wuaze.com");
            System.out.println("The Page Title is : "+page.title());
            Thread.sleep(3000); // Just to see the browser before it closes
            browser.close();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
    }
 }

}
