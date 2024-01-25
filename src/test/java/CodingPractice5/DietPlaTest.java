package CodingPractice5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DietPlaTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dietplantest.ccbp.tech");
        driver.manage().window().maximize();
        WebElement element1 = driver.findElement(By.xpath("//input[@id='oatmeal']"));
        element1.click();
        WebElement element2 = driver.findElement(By.xpath("//input[@id='yogurt']"));
        element2.click();
        WebElement element3 = driver.findElement(By.xpath("//input[@id='chicken']"));
        element3.click();
        WebElement element4 = driver.findElement(By.xpath("//input[@id='salmon']"));
        element4.click();
        WebElement element5 = driver.findElement(By.xpath("//input[@id='fruits']"));
        element5.click();
       driver.quit();

    }
}