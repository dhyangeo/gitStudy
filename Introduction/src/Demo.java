import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		//driver.wait();
		driver.navigate().to("https://www.udemy.com");
		System.out.println(driver.getTitle());
		//driver.wait();
		driver.navigate().refresh();
		driver.navigate().wait();
		driver.findElement(By.xpath("//div[@class='header--gap-auth-button--7KoL0']//a[@data-purpose='header-login']")).click();
		driver.quit();
	}

}
