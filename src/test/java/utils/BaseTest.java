package utils;

import com.microsoft.playwright.*;

public class BaseTest {

    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    private static Page page;

    // 🚀 START BROWSER
    public static void initBrowser() {

        playwright = Playwright.create();

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
        );

        context = browser.newContext();

        page = context.newPage();

        page.navigate("https://practice.qabrains.com/");
    }

    // 📌 GET PAGE
    public static Page getPage() {
        return page;
    }

    // ❌ CLOSE BROWSER
    public static void quitBrowser() {

        if (page != null)       { page.close();       page = null;       }
        if (context != null)    { context.close();    context = null;    }
        if (browser != null)    { browser.close();    browser = null;    }
        if (playwright != null) { playwright.close(); playwright = null; }

        // ✅ Nulling out after close is critical:
        //    Without this, static fields hold references to *closed* objects.
        //    The next scenario's initBrowser() creates fresh objects correctly,
        //    but any accidental getPage() call between quit and init would return
        //    a closed Page instead of null, producing confusing Playwright errors.
    }
}