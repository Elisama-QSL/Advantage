package qualidadeJuniorPleno;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.Dimension;


public class AlterarCorProduto {
    @Test
    public void acessandoPagina() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\elisama.lima\\Documents\\Lisa\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://advantageonlineshopping.com/#/");

        Dimension d = new Dimension(1300, 720);
        //Resize current window to the set dimension
        driver.manage().window().setSize(d);

        //To Delay execution for 10 sec
        Thread.sleep(10000);

        driver.findElement(By.xpath("/html/body/header/nav/ul/li[7]/a")).click();

        Thread.sleep(10000);


        driver.findElement(By.xpath("//*[@id=\"see_offer_btn\"]")).click();

        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"bunny\"]")).click();

        Thread.sleep(10000);
        driver.findElement(By.name("save_to_cart")).click();

        Thread.sleep(10000);
        driver.findElement(By.id("menuCart")).click();

        driver.quit();

    }
}
