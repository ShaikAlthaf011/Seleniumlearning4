package CodingPractice5;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class LibrayRegustrationformTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://libraryregtest.ccbp.tech");
        driver.manage().window().maximize();
        WebElement element1 = driver.findElement(By.xpath("//input[@id='fullName']"));
        element1.sendKeys("ShaikAlthaf");
        WebElement element2 = driver.findElement(By.xpath("//input[@id='male']"));
        element2.click();
        WebElement element3 = driver.findElement(By.xpath("//input[@id='contactNumber']"));
        element3.sendKeys("7032618224");
        WebElement element4 = driver.findElement(By.xpath("//input[@id='email']"));
        element4.sendKeys("alltushaik@gmail.com");
        WebElement element5 = driver.findElement(By.xpath("//select[@id='membershipType']"));
        Select sc = new Select(element5);
        sc.selectByValue("individual");

        WebElement element6 = driver.findElement(By.xpath("//input[@id='fiction']"));
        element6.click();
        WebElement element7 = driver.findElement(By.xpath("//input[@id='science']"));
        element6.click();
        WebElement element8 = driver.findElement(By.xpath("//input[@id='agreement']"));
        element8.click();
        WebElement element9 = driver.findElement(By.xpath("//input[@class='submit-btn']"));
        element9.submit();
       //driver.quit();
    }


}
