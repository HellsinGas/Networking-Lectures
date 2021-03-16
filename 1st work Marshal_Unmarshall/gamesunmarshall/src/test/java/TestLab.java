
import Models.Game;
import Models.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Class for Writing tests
 * @author HellsinGas
 * Version 1.0
 * Since 1.0
 */
public class TestLab {
    
    @Test
    public void test1()
    {
        Game testItem = new Game();
        testItem.setTitle("Gandons");
//        SeleneseTestCase.assertEquals("Gandons",testItem.getTitle());
         assertEquals("Gandons", testItem.getTitle());
              
    }
    @Test
    public void test2(){
    MinimumReq testiMinimumReq = new MinimumReq();
    testiMinimumReq.setDirectx("Directx2077");
    testiMinimumReq.setInternet("Potato");
    testiMinimumReq.setHardDrive("BBZ");
        assertAll(()-> assertEquals("Directx2077",testiMinimumReq.getDirectx()),
             ()->assertEquals("BBZ",testiMinimumReq.getHardDrive()),
             ()->assertEquals("Potato",testiMinimumReq.getInternet()));
   
    
    }
    
}
