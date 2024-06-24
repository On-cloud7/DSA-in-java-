import java.util.Scanner;
public class program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the size");
        int n = sc.nextInt();
        int []arr = new int [n];

        for(int i =0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
    for(int i =0;i<n;i++){
        if(arr[i]>max){
            max = arr[i];
        }


    }
    System.out.print(max);   
    
    }
}