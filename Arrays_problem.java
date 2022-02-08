import org.xml.sax.ext.Attributes2Impl;
import java.util.Arrays;

public class Arrays_problem {

    public static void sum_of_array(float[] arr){
        float sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum= sum + arr[i];
        }
        System.out.println("Sum of given array is:"+sum);
    }
    public static void main(String[] args){


        float[] arr2 = new float[(int)(Math.random()*10)];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=((float)(Math.random()*100));
        }
        
        System.out.println(Arrays.toString(arr2));
        System.out.print("\n");
        sum_of_array(arr2);
    }
    
}
