package week3;

//import com.sun.org.apache.xpath.internal.operations.Equals;
import static org.junit.Assert.*;
import week3.Week3;
import org.junit.Test;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
      public  void testMax(){
          Week3 tm = new Week3();
          
         // int a = tm.max(10, 5);
//          int b = tm.max(12, 15);
//          int c = tm.max(15, 13);
//          int d = tm.max(16, 13);
//          int e = tm.max(15, 12);
          assertEquals(10, tm.max(10, 5));
          assertEquals(15, tm.max(12, 15));
          assertEquals(15, tm.max(15, 13));
          assertEquals(16,  tm.max(16, 13));
          assertEquals(15, tm.max(15, 12));
      }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
      @Test
      public void testMinOfArray(){
          Week3 tm = new Week3();
          int a[] = {1, 2, 3, 4, 5};
          int b[] = {1, 0, 4, 6, 7, 8, 9};
          int c[] = {4, 5, 6, 2, 8, 9};
          int d[] = {17, 18, 12, 3, 7, 13};
          int e[] = {34, 35, 13, 45, 23, 45};
//          int x = tm.minOfArray(a);
//          int y = tm.minOfArray(b);
//          int z = tm.minOfArray(c);
//          int t = tm.minOfArray(d);
//          int v = tm.minOfArray(e);
          assertEquals(1, tm.minOfArray(a));
          assertEquals(0, tm.minOfArray(b));
          assertEquals(2, tm.minOfArray(c));
          assertEquals(3, tm.minOfArray(d));
         assertEquals(13, tm.minOfArray(e));
      }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
      @Test
    public void testCalculateBMI(){
          Week3 tm = new Week3();
          assertEquals("Thua can", tm.calculateBMI(72, 1.70));
          assertEquals("Binh thuong", tm.calculateBMI(62, 1.67));
          assertEquals("Beo phi", tm.calculateBMI(83, 1.50));
          assertEquals("Thieu can", tm.calculateBMI(45, 1.70));
          assertEquals("Binh thuong", tm.calculateBMI(65, 1.75));
    }

}
