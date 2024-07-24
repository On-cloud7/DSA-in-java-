

public class basicsort3 {
    public static void Insertionsort(int arr[]){
       for(int i=0;i<arr.length-1;i++){
        int curr = arr[i];
        int prev = i-1;
        while(prev>=0 && arr[prev]> arr[curr]){
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev+1] = arr[curr];
       }


    }
    public static void print(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
      int arr[] = {5,4,1,3,2};
        Insertionsort(arr);
        print(arr);
    }
    
}
