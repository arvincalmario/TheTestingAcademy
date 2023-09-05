package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformMouseClickKeyboardEventswithActionClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arvin Almario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver( );
        driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
        
        Actions action = new Actions(driver);

        
        WebElement drag = driver.findElement(By.id("draggable"));
      
        WebElement drop = driver.findElement(By.id("droppable"));


        action.dragAndDrop(drag, drop).build( ).perform();

        String actualText = driver.findElement(By.cssSelector("#droppable p")).getText( );

        System.out.println(actualText);

	}

}
