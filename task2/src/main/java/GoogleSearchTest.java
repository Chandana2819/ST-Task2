
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String[] args) {
        // Set the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open Google
            driver.get("https://www.google.com");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Find the search bar element
            WebElement searchBox = driver.findElement(By.name("q"));

            // Enter a search query
            searchBox.sendKeys("Selenium WebDriver");

            // Submit the search form
            searchBox.submit();

            // Wait for results to load (simple sleep for demo purposes)
            Thread.sleep(3000);

            // Print the title of the page
            System.out.println("Page title is: " + driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
