import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverDemo 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","F:\\Tests\\SeleniumDemo\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	// Launch Application
		driver.get("https://www.google.com/");
	}
}

