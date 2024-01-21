package tests.day14_testNG;

import org.testng.annotations.Test;

public class C01_Priority {
    /*
        TestNG test method'larini default olarak
        natural order ile calistirir

        Ama testlerimizi istedigimiz sirada calistirmak istersek
        priority ile siralama yapabiliriz

        - priority degeri kucuk olan once calisir
        - priority degeri ayni olanlar varsa, ayni olanlar natural order'a gore calisir
        - herhangi bir method'a priority atamazsak, priority degeri default olarak 0 olur

     */

    @Test(priority = 4)
    public void amazonTesti(){
        System.out.println("Amazon testi PASSED");
    }

    @Test(priority = 2)
    public void testOtomasyonuTesti(){
        System.out.println("Test Otomasyonu testi PASSED");
    }

    @Test(priority = 3)
    public void wiseQuarterTest(){
        System.out.println("Wise Quarter testi PASSED");
    }

}
