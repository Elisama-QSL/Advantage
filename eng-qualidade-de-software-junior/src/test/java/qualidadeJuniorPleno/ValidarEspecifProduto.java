package qualidadeJuniorPleno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.Dimension;




public class ValidarEspecifProduto {
    @Test
    public void acessandoPagina() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\elisama.lima\\Documents\\Lisa\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://advantageonlineshopping.com/#/");

        Dimension d = new Dimension(1300,720);
        //Resize current window to the set dimension
        driver.manage().window().setSize(d);

        //To Delay execution for 10 sec
        Thread.sleep(10000);

        driver.findElement(By.xpath("/html/body/header/nav/ul/li[7]/a")).click();

        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"see_offer_btn\"]")).click();

        Thread.sleep(10000);

        WebElement customization = driver.findElement(By.xpath("/html/body/div[3]/section/article[2]/div[1]/label[1]"));
        String value = customization.getText();
        assertEquals("CUSTOMIZATION", value);

        WebElement nome = driver.findElement(By.xpath("/html/body/div[3]/section/article[2]/div[1]/label[2]"));
        String name = nome.getText();
        assertEquals("Simplicity", name);
        
        driver.quit();



    }

    private void assertEquals(String s, String value) {
    }

}
