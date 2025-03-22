package testNgExecution2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
@Parameters("Bname")
  @Test
  public void parameterMethod(@Optional("edge") String browserValue) {
	  WebDriver driver=null;
	  if(browserValue.equalsIgnoreCase("chrome")) {
		  
		  driver=new ChromeDriver();
	  }
	  else if(browserValue.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
	  }
	  else if(browserValue.equalsIgnoreCase("edge")) {
		  driver=new EdgeDriver();
	  }
	  else {
		  System.out.println("Invalid Browser Name");
	  }
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://demowebshop.tricentis.com/");
  }
}
