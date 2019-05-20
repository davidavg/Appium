package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class UIselectorAndroid {

	public static void main(String[] args) {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "TA98908XSY"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0");
		caps.setCapability("appPackage", "com.whatsapp");
		caps.setCapability("appActivity", "com.whatsapp.HomeActivity");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
			AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"Hay doctor que dolor\")").click();
			//driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Hay doctor que dolor')]")).click();
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Escribe un mensaje\")").sendKeys("[LoveBot: Cuchareenle a la nieve <3]");
			//driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("[LoveBot: Dense amor <3]");
			driver.findElementByAndroidUIAutomator("new UiSelector().description(\"Enviar\")").click();
			//driver.findElement(By.id("com.whatsapp:id/send")).click();
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}	
	}
	
}
