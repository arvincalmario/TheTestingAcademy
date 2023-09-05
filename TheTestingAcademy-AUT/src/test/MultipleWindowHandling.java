package test;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arvin Almario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver( );
        driver.get("https://the-internet.herokuapp.com/windows");
        
        driver.findElement(By.cssSelector("#content > div > a")).click();
        String currentwindow = driver.getWindowHandle();
        
        
        Set<String> tabs =  driver.getWindowHandles();
        System.out.println(tabs);
        
        Iterator<String> i = tabs.iterator();
        while(i.hasNext()){
            String childwindow = i.next();
            if(!childwindow.equalsIgnoreCase(currentwindow)){
                driver.switchTo().window(childwindow);
                System.out.println("The child window is "+childwindow);
            	}
        	}
        driver.quit();
	}
}
	
	
