/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baza.element;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wolsk
 */
public class osobaTest {
   
    @Test 
    public void toStringTest(){
        System.out.println(" toString test");
        osoba o = new  osoba(10);
        String odpowiedz = "osoba: name=unk, surname=unk, data=null, idOsoby=10}";
        assertEquals(odpowiedz,o.toString());
        
        o.setName("JohnyZArizony");
        odpowiedz = "osoba: name=JohnyZArizony, surname=unk, data=null, idOsoby=10}";
        assertEquals(odpowiedz,o.toString());
    }
    
}
