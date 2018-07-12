//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.annotations.Test; 

public class katalonTestScript {
	
  private WebDriver driver;
  private String Chromedriverpath;
  private String baseUrl;
  //private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  
	Chromedriverpath = "C:\\Users\\fchautem\\chromedriver.exe";
    baseUrl = "https://www.google.ch/";
	System.setProperty("webdriver.chrome.driver", Chromedriverpath);
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    //System.out.println("_UN_");
  }

  @Test
  public void test() throws Exception {
	  
	/*Chromedriverpath = "C:\\Users\\fchautem\\chromedriver.exe";
    baseUrl = "https://www.google.ch/";
	System.setProperty("webdriver.chrome.driver", Chromedriverpath);
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
	
	  //System.out.println("_DEUX_");
	  
    driver.get(baseUrl);
    driver.findElement(By.id("lst-ib")).click();
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("asdf");
    driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
   
    /*driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }*/
    
  }

  @After
  public void tearDown() throws Exception {
	  //System.out.println("_TROIS_");
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  /*private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }*/
  
  /*public static void main(String args[]) {
      org.junit.runner.JUnitCore.main();
  }*/
}
