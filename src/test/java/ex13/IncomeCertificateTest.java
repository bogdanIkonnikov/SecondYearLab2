package ex13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncomeCertificateTest {
    IncomeCertificate incomeCertificate = new IncomeCertificate(2024,
            "Иконников Богдан Константинович",
            "ООО 1Win",
            new int[] {
                    1000,   //1000
                    2000,   //3000
                    4000,   //7000
                    10000,  //17000
                    40000,  //57000
                    500000, //557000
                    1000000 //1557000
            });
    @Test
    public void getYear(){
        Assertions.assertEquals(2024, incomeCertificate.getYear());
    }
    @Test
    public void getFio(){
        Assertions.assertEquals("Иконников Богдан Константинович", incomeCertificate.getFio());
    }
    @Test
    public void getCompany(){
        Assertions.assertEquals("ООО 1Win", incomeCertificate.getCompany());
    }
    @Test
    public void getIncome(){
        Assertions.assertEquals(new int[] {

        }, incomeCertificate.getIncome());
    }

}
