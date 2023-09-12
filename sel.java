import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class sel {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver","C:/Users/rsrah/OneDrive/Documents/chrome-win64/chrome.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.linkedin.com/");
		d.findElement(By.id("session_key")).sendKeys("jonh04624@gmail.com");
		d.findElement(By.id("session_password")).sendKeys("JonhDoe@04624");
		d.findElement(By.cssSelector("button.btn-md")).click();
		d.get("https://www.linkedin.com/in/shital-jagtap-aa53a0118");
		//<h1 class="text-heading-xlarge inline t-24 v-align-middle break-words">Shital Jagtap</h1>
		System.out.println(d.findElement(By.className("text-heading-xlarge")).getText());
		
//		d.findElement(By.xpath("//span@[class='artdeco-button__text']")).click();
		
		WebElement about = d.findElement(By.xpath("//span[normalize-space()='Show all comments']"));
        new Actions(d)
                .scrollToElement(about)
                .perform();
        
        d.findElement(By.xpath("//span[normalize-space()='Show all comments']")).click();
        d.findElement(By.xpath("//span[normalize-space()='Posts']")).click();
        WebElement post = d.findElement(By.xpath("//h2[@id='ember1190']"));
        new Actions(d)
                .scrollToElement(post)
                .perform();
        System.out.println(d.findElement(By.xpath("//h2[@id='ember1190']")).getText());
        
	}

}
