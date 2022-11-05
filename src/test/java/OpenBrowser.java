import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {




    public static void main(String[] args) throws InterruptedException {



        // 1-Bridge between test scripts and browsers
       String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver",chromePath);


        // 2-New Object
        WebDriver driver = new ChromeDriver();

        //3-Navigate to google websSite
        driver.navigate().to("https://www.google.com/");
        // 4-Maximize Window
        driver.manage().window().maximize();
        // 5- Wait 5 seconds(Sleep)
        Thread.sleep(3000);

        // 6- search for Selenium
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).click();
        Thread.sleep(3000);

        //4-Close Driver
        driver.close();
    }
}
