
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Testes {

	@Test
	public void testeExe() throws MalformedURLException, InterruptedException {

		System.setProperty("webdriver.winium.desktop.driver", "src\\test\\resources\\Winium.Desktop.Driver.exe");
		
		Runtime rt = Runtime.getRuntime();
		try {
			Process pr = rt.exec("src\\test\\resources\\Winium.Desktop.Driver.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		WiniumDriver driver;
		DesktopOptions desiredCapabilities = new DesktopOptions();
		desiredCapabilities.setApplicationPath("C:/windows/system32/calc.exe");	
		desiredCapabilities.setLaunchDelay(2);	
		driver = new WiniumDriver(new URL("http://localhost:9999"), desiredCapabilities);
					
		driver.findElement(By.name("Um")).click();
		driver.findElement(By.name("Dois")).click();
		driver.findElement(By.name("Três")).click();
		
	}
}
