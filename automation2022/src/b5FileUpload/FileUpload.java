package b5FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {


	        String path= System.getProperty("user.dir");            //get property return project path. 
		
	    	String actual_path= path+"\\driver\\chromedriver.exe";  //take from driver properties 
		
	    	System.setProperty("webdriver.chrome.driver", actual_path );
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
             
             driver.get("https://demo.guru99.com/test/upload");
	
             Thread.sleep(6000);
             driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\sunil\\Desktop\\PRACTICE.txt");   //shift+right click and copy path of file
             
                Thread.sleep(6000);
            	driver.findElement(By.id("terms")).click();
            	
            	 Thread.sleep(6000);
            	driver.findElement(By.id("submitbutton")).click();
            	
            		 
            		 
	}

}
