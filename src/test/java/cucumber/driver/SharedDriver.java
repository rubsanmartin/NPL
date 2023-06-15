package cucumber.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

public class SharedDriver {
    public ChromeDriverService service;
    public WebDriver driver;
    public SharedDriver() throws IOException {
        if(DriverFactory.getDriver()== null){
            WebDriverManager.chromedriver().setup();
            service = new ChromeDriverService.Builder()
                    .usingAnyFreePort()
                    .build();
            service.start();

            ChromeOptions opt = new ChromeOptions();
            opt.addArguments("start-maximized"); // open Browser in maximized mode
            /*opt.addArguments("disable-infobars"); // disabling infobars
            opt.addArguments("--disable-extensions"); // disabling extensions
            opt.addArguments("--disable-gpu"); // applicable to Windows os only
            opt.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
            opt.addArguments("--no-sandbox"); // Bypass OS security model
            opt.addArguments("--disable-in-process-stack-traces");
            opt.addArguments("--disable-logging");
            opt.addArguments("--log-level=3");
            opt.addArguments("--remote-allow-origins=*");*/
            //opt.addArguments("--incognito");

            //opt.addArguments("--whitelisted-ips");
            //opt.addArguments("--remote-allow-origins=*");
            //opt.addArguments("--headless=new");
            //opt.addArguments("--allowed-ips");
            //opt.addArguments("--user-data-dir=C:\\Users\\ACL-Rúben San Martín\\AppData\\Local\\Google\\Chrome\\User Data\\Default");

            driver = new RemoteWebDriver(service.getUrl(), opt);
            DriverFactory.addDriver(driver);
            //opt.addArguments("--whitelisted-ips");


        }
    }
}
