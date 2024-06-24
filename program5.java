public class program5 {
    static int  findpeak(int arr[], int n ){
          if (n==1)
          return 0;
          if(arr[0]>=arr[1])
          return 0;
          if(arr[n-1]>=arr[n-2])
          return n-1;
          for(int i =1;i<n-1;i++){
            if (arr[i]>=arr[i-1]&&arr[i]>=arr[i+1])
            return i;
          }
          return 0;
    }
    public static void main(String[]args){
        int [] arr = {1, 300, 20, 4, 1, 0};
        int n =arr.length;
        System.out.println("index is "+ findpeak(arr, n)); 
    }
    
}
