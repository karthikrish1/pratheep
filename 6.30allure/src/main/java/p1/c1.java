package p1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class c1 {
	@Description("facebook page ")
	@Feature("gettng title")
	@Severity(SeverityLevel.NORMAL)

	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("http://www.facebook.com");
	    System.out.println(ob.getTitle());
	    ob.quit();
	}

}
