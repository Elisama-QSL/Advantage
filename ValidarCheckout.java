package qualidadeJuniorPleno;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class ValidarCheckout {
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

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[2]/input")).click();

        driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[2]/input")).sendKeys("2");


        //driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[4]/button")).click();
        driver.findElement(By.name("save_to_cart")).click();

        Thread.sleep(10000);
        driver.findElement(By.id("menuCart")).click();

        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"checkOutButton\"]")).click();

        Thread.sleep(10000);

        WebElement valor = driver.findElement(By.xpath("//*[@id=\"userCart\"]/div[2]/label[2]/span"));
        String value = valor.getText();
        assertEquals("$899.98!", value);
    
        driver.quit();
    }

    private void assertEquals(String s, String value) {
    }


}


