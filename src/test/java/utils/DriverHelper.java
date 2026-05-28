package utils;

import com.microsoft.playwright.*;

public class DriverHelper {

    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    private static Page page;

    // ✅ Get Page Instance
    public static Page getPage() {

        if (page == null) {

            playwright = Playwright.create();

            browser = playwright.chromium()
                    .launch(
                            new BrowserType.LaunchOptions()
                                    .setHeadless(false)
                    );

            context = browser.newContext(
                    new Browser.NewContextOptions()
                            .setViewportSize(1920, 1080)
            );

            page = context.newPage();
        }

        return page;
    }

    // ✅ Close Browser Properly
    public static void quitDriver() {

        if (page != null) {
            page.close();
            page = null;
        }

        if (context != null) {
            context.close();
            context = null;
        }

        if (browser != null) {
            browser.close();
            browser = null;
        }

        if (playwright != null) {
            playwright.close();
            playwright = null;
        }
    }
}