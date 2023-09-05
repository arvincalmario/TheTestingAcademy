package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;                                                                        
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arvin Almario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver( );
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //JS Alert
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click( );
        Alert alert = wait.until(ExpectedConditions.alertIsPresent( ));
        String text = alert.getText( );
        System.out.println(text);
        alert.accept( );


        // Confirm Box
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click( );
        wait.until(ExpectedConditions.alertIsPresent( ));
        Alert alert2 = driver.switchTo( ).alert( );
        String text2 = alert.getText( );
        System.out.println(text2);
        alert.accept( );

        // PromptBox
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click( );
        wait.until(ExpectedConditions.alertIsPresent( ));
        Alert alert3 = driver.switchTo( ).alert( );
        alert.sendKeys("ARvin");
        alert.accept( );
        System.out.println(driver.findElement(By.id("result")).getText());

        Thread.sleep(5000);
        driver.quit();

	}

}
