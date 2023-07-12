import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SeleniumDemo {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        openPage();
        clickHomeLoginButton();
        loginPageCreds();
        addContacts();
    }

    static void openPage() {
        driver.manage().window().maximize();
        driver.get("https://cogmento.com/");
    }

    static void clickHomeLoginButton() {
        WebElement homeLoginButton = driver.findElement(By.xpath(
                "//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left'][normalize-space()='Log In']"));
        homeLoginButton.click();
    }

    static void loginPageCreds() {
        WebElement emailText = driver.findElement(By.name("email"));
        emailText.sendKeys("swapnil.s@simformsolutions.com");
        WebElement passText = driver.findElement(By.name("password"));
        passText.sendKeys("Swapnilshah@99");
        WebElement button = driver
                .findElement(By.xpath("//div[@class='ui fluid large blue submit button'][normalize-space()='Login']"));
        button.click();
    }

    static void addContacts() {
        WebElement contactsButton = driver.findElement(By.cssSelector(".users.icon"));
        Actions actions = new Actions(driver);
        actions.moveToElement(contactsButton);
        WebElement addContact = driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/button"));
        addContact.click();
    }

}
