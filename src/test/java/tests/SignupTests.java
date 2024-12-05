package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SignupTests {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); 
		Thread.sleep(5000);
	    driver.get("https://chubb-uat.coupahost.com/sessions/support_login");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.findElement(By.id("user_login")).sendKeys("vishal.c.saini@accenture.com");
	    driver.findElement(By.id("user_password")).sendKeys("slowAl@rm85");
	    driver.findElement(By.id("login_button")).click();
	    driver.wait(5000);
	    
	    driver.quit();
	}
	
}
