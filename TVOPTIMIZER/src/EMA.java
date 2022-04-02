import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EMA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

       	//System.setProperty("webdriver.gecko.driver","C:\\Users\\Vamsi\\Downloads\\Selenium\\chromedriver.exe");
       	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Vamsi\\Downloads\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tradingview.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("tv-header__user-menu-button tv-header__user-menu-button--anonymous js-header-user-menu-button")).click();
        //driver.findElement(By.xpath("/html/body/div[6]/div/span/div[1]/div/div/div[1]/div[1]")).click();
        //driver.findElement(By.xpath("//*[@id=\"email-signin__user-name-input__600bf2bc-a1ef-4b3c-8197-db9885c51d09\"]")).clear();

        //driver.findElement(By.xpath("//*[@id=\"email-signin__user-name-input__600bf2bc-a1ef-4b3c-8197-db9885c51d09\"]")).sendKeys("narayanammm.vamsikrishna@gmail.com");
       // driver.findElement(By.xpath("//*[@id=\"email-signin__password-input__600bf2bc-a1ef-4b3c-8197-db9885c51d09\"]")).clear();
       // driver.findElement(By.xpath("//*[@id=\"email-signin__password-input__600bf2bc-a1ef-4b3c-8197-db9885c51d09\"]")).sendKeys("password");
        //driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/div/div/form/div[5]/div[2]/button/span[2]")).click();
        //driver.findElement(By.xpath("//*[@id=\"email-signin__user-name-input__600bf2bc-a1ef-4b3c-8197-db9885c51d09\"]")).clear();
        
        //driver.findElement(By.cssSelector("button.tv-header__user-menu-button.tv-header__user-menu-button--anonymous.js-header-user-menu-button > svg > path")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='More'])[1]/following::*[name()='svg'][1]")).click();
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).clear();

        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("narayanam.vamsikrishna@gmail.com");
        Thread.sleep(30000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[3]")).click();
        driver.findElement(By.id("email-signin__user-name-input__f32b48e9-d2a6-4e7b-bc99-66e4c22e5ac8")).clear();
        driver.findElement(By.id("email-signin__user-name-input__f32b48e9-d2a6-4e7b-bc99-66e4c22e5ac8")).sendKeys("abc");
        driver.findElement(By.id("email-signin__password-input__f32b48e9-d2a6-4e7b-bc99-66e4c22e5ac8")).clear();
        driver.findElement(By.id("email-signin__password-input__f32b48e9-d2a6-4e7b-bc99-66e4c22e5ac8")).sendKeys("def");
        driver.findElement(By.xpath("//button[@id='email-signin__submit-button__f32b48e9-d2a6-4e7b-bc99-66e4c22e5ac8']/span[2]")).click();
      }
        

	}


