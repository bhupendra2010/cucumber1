package org.argos.com.PageObjectPackage;

import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.argos.com.BaseClassPackage.DriverFactory;
import org.argos.com.BaseClassPackage.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Homepage extends DriverFactory {
    public void baseurl(){

        driver.getCurrentUrl();
    }
    public void  searchproduct(){
        driver.findElement(By.id("searchTerm")).sendKeys("nike");
        driver.findElement(By.className("_1gqeQ")).click();

        driver.findElement(By.className("findability-facet__filter-count")).click();
        List<WebElement> productlist=driver.findElements(By.cssSelector("div[data-test='component-product-card']"));
        int product=productlist.size();
        System.out.println(product);
        Random random=new Random();
        int randomno;
        randomno = random.nextInt(product-1);
        WebElement productElement=productlist.get(randomno);
        String selectedproduct=productElement.getText();
        productElement.click();

//        List<WebElement>productstar=driver.findElements(By.cssSelector("span[class='findability-facet__rating-label']"));
//        productstar.size();
//
//        for (WebElement productelement:productstar){
//            String pr=productelement.getText();
//            int i=0;
//
//        }


    }

}
