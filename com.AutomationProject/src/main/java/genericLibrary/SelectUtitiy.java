package genericLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtitiy {
	public void selectByVisibleTextMethod(WebElement dropDown,String text) {
		
		Select select=new Select(dropDown);
		select.selectByVisibleText(text);
		
	}

}
