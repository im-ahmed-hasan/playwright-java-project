package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.MouseButton;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void test() {
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		page.getByText("Username : AdminPassword :").click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("Admin");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("Tab");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin123");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Time")).click();
		assertTrue(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Performance")).isVisible(),"Performance link should be visible");
        String sidepanelText = page.getByLabel("Sidepanel").getByRole(AriaRole.LIST).textContent();
        assertTrue(sidepanelText.contains("Leave"), "Side Panel should contain 'Leave'");
    }


}
