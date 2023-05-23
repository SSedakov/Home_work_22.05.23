package org.example;

import jdk.jfr.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToolsTest {

    @Nested
    @DisplayName("Change firstSymbol to UppCase")
    class ChangeFirstSymbolToUppCase {

         @Test
    public void changeSymbol_FirstToUppCase_ReturnStringApple(){

    assertEquals("Apple",StringTools.FirstToUpperCase("apple"));
}
         @Test
    public void changeSymbol_FirstToUppCase_ReturnStringStop(){

        assertEquals("Stop",StringTools.FirstToUpperCase("stop"));
    }
    }
    @Nested
    @DisplayName("Check First Symbol")
    class CheckFirstSymbol{


    @Test

        public void check_FirstSybmol_ReturnTrueIfUppCase(){
            assertTrue(StringTools.isStartingFromCapital("Break"));
        }
        @Test
        public void check_FirstSybmol_ReturnTrueIfUppCase2(){
            assertFalse(StringTools.isStartingFromCapital("pause"));
        }
    }


}