import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PruebaUnitaria {
    String url = "https://www.latamairlines.com/cl/es";

    WebDriver driver ;

    System.setProperty ("webdriver.chrome.driver","src\main\java\chromedriver.exe");
    driver = new ChromeDriver();

    driver.get("url");

    //@FindBy
    driver.FindElement



















}
