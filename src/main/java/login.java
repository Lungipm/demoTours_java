import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\maseko\\Desktop\\Test Automation\\projects\\DemoToursJ\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch the website
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();

//capture login details
        driver.findElement(By.xpath("//a[@href='login.php'][contains(.,'SIGN-ON')]")).click();
        driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("test");
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("test");
        driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();


    }

}
