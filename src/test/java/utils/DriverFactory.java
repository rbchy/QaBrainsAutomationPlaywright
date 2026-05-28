package utils;

import com.microsoft.playwright.*;

public class DriverFactory {

    private static ThreadLocal<Playwright> playwright = new ThreadLocal<>();
    private static ThreadLocal<Browser> browser = new ThreadLocal<>();
    private static ThreadLocal<BrowserContext> context = new ThreadLocal<>();
    private static ThreadLocal<Page> page = new ThreadLocal<>();

    public static Page getPage() {
        return page.get();
    }

    public static void initDriver() {

        playwright.set(Playwright.create());

        browser.set(
                playwright.get()
                        .chromium()
                        .launch(new BrowserType.LaunchOptions()
                                .setHeadless(false))
        );

        context.set(browser.get().newContext());

        page.set(context.get().newPage());

        getPage().navigate("https://practice.qabrains.com/");
    }

    public static void quitDriver() {

        if (page.get() != null) {
            page.get().close();
            page.remove();
        }

        if (context.get() != null) {
            context.get().close();
            context.remove();
        }

        if (browser.get() != null) {
            browser.get().close();
            browser.remove();
        }

        if (playwright.get() != null) {
            playwright.get().close();
            playwright.remove();
        }
    }
}