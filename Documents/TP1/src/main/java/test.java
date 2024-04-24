import static org.junit.Assert.*;  
import org.junit.Test;  

public class test {  

    @Test  
    public void testFindMin(){  
        assertEquals(1, calcule.findMin(new int[]{1, 3, 4, 2}));  
        assertEquals(-12, calcule.findMin(new int[]{-12, -1, -3, -4, -2}));  
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testFindMinEmptyArray(){
        int r[] = new int[0];
        calcule.findMin(r);  
    }  
}
