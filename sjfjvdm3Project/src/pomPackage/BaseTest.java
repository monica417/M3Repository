package pomPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant{
	
	static WebDriver driver;
	public void browserSetup() throws IOException
	{
		
		Flib flib=new Flib();
		String browserValue=flib.readPropertyData(Prop_Path, "chrome");
		String url=flib.readPropertyData(Prop_Path, URL);
		
		if(browserValue.equalsIgnoreCase("chrome")) {
			driver=new EdgeDriver();
		}
		
		else if(browserValue.equalsIgnoreCase("firefox")) {
			
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Enter vvalid Browser !!!");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}

}
