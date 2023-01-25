import java.util.Arrays;
import java.util.Random;

public class Main {
    public  static void random(int array[], int a){
        Random rd = new Random();
        for (int i=a-1; i>0;i--){
            int j = rd.nextInt(i+1);

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
   int [] tab = {1,2,3,4,5,6,7};
   int b = args.length;
   random(tab, b);
    }
}