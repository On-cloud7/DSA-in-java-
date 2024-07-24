import java.util.*;
public class program8 {
    public static int max(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
       

    }
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,0};
       System.out.println("maximum number is " + max(arr));

    }
    
}
