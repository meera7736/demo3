package drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\webdriver\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	driver.manage().window().maximize();
	WebElement dd=driver.findElement(By.id("course"));
	Select select=new Select(dd);
	select.selectByValue("select");
	select.selectByVisibleText("python");
	select.selectByIndex(0);
	

	}
}
