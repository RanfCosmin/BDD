import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OldStyle {
    public static void main(String[] args) throws InterruptedException {
        //Setam locatia ChromeDriver-ului
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

        //Initializam un obiect de tip ChromeDriver
        WebDriver driver = new ChromeDriver();

        //Navigam spre un URL
        driver.get("https://formy-project.herokuapp.com/form");

        //Refresh page
        driver.navigate().refresh(); //Aici avem si back si forward

        //Delete cookies
        driver.manage().deleteAllCookies();

        //Maximizam Fereastra
        driver.manage().window().fullscreen();

        //Setam implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Setam page load timeout
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //Identificam dupa Id si completam un imput field
        driver.findElement(By.id("first-name")).sendKeys("Cosmin");
        //Last Name + clear
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.clear();
        lastName.sendKeys("Ranf");
        //sau:  driver.findElement(By.id("last-name")).sendKeys("Ranf");
        //Job title
        driver.findElement(By.xpath("//input[@placeholder='Enter your job title']")).sendKeys("Software Engenier");

        //Education ca lista

        List<WebElement> educationList = driver.findElements(By.xpath("//input[@aria-label='Radio button']"));
        educationList.get(1).click();

        //Identificam cu xPath dupa atribut si dam click
        WebElement male_checkbox = driver.findElement(By.xpath("//input[@value='checkbox-1']"));
        male_checkbox.click();

        //Dropdown
        driver.findElement(By.xpath("//select[@id='select-menu']")).click();
        driver.findElement(By.xpath("//option[text()='10+']")).click();

        //Data
        driver.findElement(By.xpath("//input[@data-provide]")).sendKeys("02/02/2021");

        Thread.sleep(3000);

        //Identificam cu xPath dupa text si dam Submit
        //driver.findElement(By.xpath("//a[text()='Submit']")).click();
        WebElement submit = driver.findElement(By.xpath("//a[text()='Submit']"));

        //Verificam numele butonului
        Assert.assertEquals(submit.getText(), "Submit", "Nume gresit");
        submit.click();

        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("/thanks"), "Wrong URL: " + url);

        //Pauza chrome
        Thread.sleep(3000);

        //Inchidem Chromedriver
        driver.close();

        //Actions!!!!
        //Robot!!!!
    }
}
