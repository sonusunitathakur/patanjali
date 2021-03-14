package pt;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pat1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver d=new ChromeDriver(opt);
		
		d.get("https://www.patanjaliayurved.net/");
		 
       String s=d.getTitle();
      System.out.println("The title of the page" +s);
      
       
        d.manage().window().maximize();
        Alert alt=d.switchTo().alert();
        alt.dismiss();
        
        WebElement Register=d.findElement(By.xpath("//*[@id='lang']/a"));
        Register.click();
        
        

	}

}
