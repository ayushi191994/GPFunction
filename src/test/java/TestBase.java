import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TestBase
{
    public static WebDriver driver=null;
    int n;

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
           System.out.println("Browser quit");
           driver.quit();
           driver=null;
       }
    public static void close()
    {
        System.out.println("Browser is closed");
        driver.close();

    }

}
