import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;

public class Google {
    public static void main(String[] args) throws InterruptedException {
        //Setam locatia ChromeDriverului
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        //Initializam un obiect de tip ChromeDriver
        WebDriver driver = new ChromeDriver();
        //Navigam spre un URL
        driver.get("https://google.ro");
        //pauza ChromeDriver
        //sleep(5000);
        //Swich to pop-up
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//span[text()='Sunt de acord']")).click();
        // cautare pe google
        driver.findElement(By.name("q")).sendKeys("Romania");
        // click pe Cautare Google
        //Thread.sleep(2000);//VARIANTA SIMPLA (functioneaza!!!)
        // explicit wait -> VARIANTA RECOMANDATA (atata timp cat merge !!)
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        //driver.findElement(By.xpath("//img[@alt='Google']")).click();
        driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
        /*driver.findElement(By.name("q")).sendKeys(Keys.RETURN); */
        //Thread.sleep(5000);
        //Inchidere ChromeDriver
        driver.quit();
    }
}