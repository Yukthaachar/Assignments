package assignment1;
import java.util.Arrays;

public class assignment3 {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};
        for (int i = array.length - 1; i > 0; i--) {
            int res=(int)Math.random();
            int index = (res * (i + 1));
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        
        System.out.println(Arrays.toString(array));
    }
}
    
