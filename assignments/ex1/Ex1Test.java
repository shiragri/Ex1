package assignments.ex1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
        @Test
        void computeNumberTest() {
            String s2 = "1011b2";
            int v = Ex1.number2Int(s2);
            assertEquals(v,11);
            String s10 = "1011bA";
            v = Ex1.number2Int(s10);
            s2 = Ex1.int2Number(v,2);
            int v2 = Ex1.number2Int(s2);
            assertEquals(v,v2);
            assertTrue(Ex1.equals(s10,s2));
        }

        @Test
        void isBasisNumberTest() {
            String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
        }
        @Test
        void int2NumberTest() {
            int a = 11;
            String s= Ex1.int2Number(a,2);
            assertEquals(s,"1011b2");
            a= 1024;
            s= Ex1.int2Number(a,16);
            assertEquals(s,"400bG");
            a=256;
            s= Ex1.int2Number(a,8);
            assertEquals(s,"400b8");
            a=654;
            s= Ex1.int2Number(a,10);
            assertEquals(s,"654");


        }

        @Test
        void number2Int() {
            String s2 = "1011b2";
            int v = Ex1.number2Int(s2);
            assertEquals(v,11);
            s2 = "0b2";
            v = Ex1.number2Int(s2);
            assertEquals(v,0);
            s2 = "50";
            v = Ex1.number2Int(s2);
            assertEquals(v,50);
            s2 = "FbG";
            v = Ex1.number2Int(s2);
            assertEquals(v,15);
        }


        @Test
        void maxIndexTest() {
            String[] arr= {"1DbG","AAbB","10010101b2","110110011000b2"};
            int max=Ex1.maxIndex(arr);
            assertEquals(max,3);
            String[] arr1= {"1","0b2","1b2","0b2"};
            max=Ex1.maxIndex(arr1);
            assertEquals(max,0);
            String[] arr2= {"12","10011b2","1FbG","E4bG"};
            max=Ex1.maxIndex(arr2);
            assertEquals(max,3);
            String[] arr3= { "1","0","1","0"};
            max=Ex1.maxIndex(arr3);
            assertEquals(max,0);
            String[] arr4= {"1001b2","11b3","13","36"};
            max=Ex1.maxIndex(arr4);
            assertEquals(max,3);
        }





}
