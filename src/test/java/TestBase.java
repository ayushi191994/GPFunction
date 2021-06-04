import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TestBase
{
    public static WebDriver driver=null;

    public static void initialization()
    {
       if(driver==null)
       {
          System.setProperty("webdriver.chrome.driver", "D:\\Faberwork1\\chromedriver_win32 (1)\\chromedriver.exe");
             driver = new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(30, SECONDS);
           driver.manage().timeouts().pageLoadTimeout(30,SECONDS);
           driver.manage().window().maximize();
         }
       }
       public static void quit()
       {
           System.out.println("Browser is closed");
           driver.quit();
           driver=null;
       }

}