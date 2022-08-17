package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	public WebDriver wd;
	
	public void intialization() throws IOException {
		File fi = new File("C:\\Users\\jaf95\\eclipse-workspace\\Amazon\\src\\test\\java\\Base\\BaseClass.java");
	FileInputStream fis = new FileInputStream("fi");
	Properties pi = new Properties();
	pi.load(fis);
String Bro =	pi.getProperty("browser");
		
if(Bro.equalsIgnoreCase("chorme")) {
	WebDriverManager.chromedriver().setup();
	wd = new ChromeDriver();
}
else if (Bro.equalsIgnoreCase("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	wd = new FirefoxDriver();
	}
else if (Bro.equalsIgnoreCase("edge")) {
	WebDriverManager.edgedriver().setup();
	wd=new EdgeDriver();}


wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
wd.get(pi.getProperty("testingURL"));	

	
	
	
	
	
	}





	
	


		
	}
	
	
	
	
	

