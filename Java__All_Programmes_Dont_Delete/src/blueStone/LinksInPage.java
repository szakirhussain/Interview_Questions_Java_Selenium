/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package blueStone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInPage {
	public static void main(String[] args) throws InterruptedException {
		
	Links_in_Page();

	}

	/**
	 * @throws InterruptedException 
	 * 
	 */
	private static void Links_in_Page() throws InterruptedException {
	
		//Settting the System properties and Creating Driver web elemnet
		System.setProperty("webdriver.chrome.driver","D:\\Java_Intallation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Targer Url
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement targetSection = driver.findElement(By.xpath("//div[@id='pageFooter']"));
		
		//Count of links in target section 
		int count_targelinks = targetSection.findElements(By.tagName("a")).size();
		System.out.println("Cout of links in TargetArea "+count_targelinks);
		driver.close();

		
		
		
		

}
}
