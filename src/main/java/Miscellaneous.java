import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


public class Miscellaneous {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

//		WindowsUtils.killByName("excel.exe");

        driver.manage().deleteCookieNamed("sessionKey");

        // click on any link
        // login page- verify login url

        /*
         * driver.get("http://google.com");
         *
         * File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         * FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));
         */

    }

}