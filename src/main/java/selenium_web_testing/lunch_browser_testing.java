package selenium_web_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lunch_browser_testing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver test_driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIIT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    test_driver = new ChromeDriver();
	    test_driver.manage().window().maximize();
	    test_driver.get("https://www.makemytrip.com/railways/");
	    Thread.sleep(2000);
		String url = test_driver.getCurrentUrl();
		System.out.println("URL: "+url);
		System.out.println("Title of page: "+test_driver.getTitle());
		test_driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[1]/label/span")).click();
		test_driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		Thread.sleep(2000);
		test_driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).click();
		test_driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("DELHI");
		Thread.sleep(2000);
		test_driver.findElement(By.xpath("//*/li[@data-suggestion-index=\"0\"]")).click();
		test_driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).click();
		Thread.sleep(2000);
		test_driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("LKO");
		Thread.sleep(2000);
		test_driver.findElement(By.xpath("//*/li[@data-suggestion-index=\"0\"]")).click();
		Thread.sleep(2000);
		test_driver.findElement(By.xpath("//*[@id=\"travelDate\"]")).click();
		Thread.sleep(2000);
		 String flag = "False";
	
		  while(flag=="False") {
		   
		   if(test_driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'May 20 2024')]")).size()>0) {
		    
		   test_driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'May 20 2024')]")).click(); 
		   flag="True";
		   Thread.sleep(5000);
		   }
		   
		   else {
		    Thread.sleep(5000);
		    test_driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		   }
		      
		  }
		test_driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/label/span")).click();
		Thread.sleep(2000);
		test_driver.findElement(By.xpath("//*/li[@data-cy=\"3A\"]")).click();
		Thread.sleep(2000);
		test_driver.findElement(By.xpath("//*/a[@data-cy=\"submit\"]")).click();
		Thread.sleep(5000);
		System.out.println("Testcase passed...");
		test_driver.quit();
	}

}
