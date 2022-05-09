import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class seleniumTestClass {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/login.html");

        //find the area to enter the text
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));

        WebElement submitButton = driver.findElement(By.id("submit-button"));
        //enter values
        email.sendKeys("HaraldHarfager850@koungen.no");

        //remove the entered text
        //email.clear();

        password.sendKeys("Norge1337");
        //click submit button
        submitButton.click();

        System.out.println("Selenium is now done.");

        driver.close();





    }

}
