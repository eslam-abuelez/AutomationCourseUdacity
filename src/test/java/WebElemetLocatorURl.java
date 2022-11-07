import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemetLocatorURl {

    private String chrome;


    public static void main(String[] args) throws InterruptedException {
        //1- Create Bridge between testScripts and web driver
          String ChromePathe = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
          System.setProperty("webdriver.chrome.driver",ChromePathe);

       //2-   create new webdriver object
        WebDriver driver = new ChromeDriver();

        //3- Navigate to https://the-internet.herokuapp.com/login
        driver.navigate().to("https://the-internet.herokuapp.com/login");

        //4- Maximize window
        driver.manage().window().maximize();

        //5- Enter username
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        driver.findElement(By.linkText("Elemental Selenium")).click();





        //5- wait 3 sec
       //Thread.sleep(3000);


      //driver.close();
        Thread.sleep(3000);
      driver.quit();



    }
}
