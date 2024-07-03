public class program9 {
    public static int Secondsmallest(int arr[], int n ){
        if (n<2){
            return -1;

        }
        int small = Integer.MAX_VALUE;
        int Second_small = Integer.MAX_VALUE;
        for(int i =0;i<n ;i++){
            if(arr[i]<small){
                Second_small = small;
                small = arr[i];
            }
            else if (arr[i]<Second_small && arr[i] != small){
                Second_small = arr[i];
            }



        }
        return Second_small;
    }
    
    public static int Largest(int arr[], int n){
        if(n<2){
            return -1;
        }
        int Second_largest = Integer.MIN_VALUE;
        int large = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]>large){
                Second_largest = large;
                large = arr[i];


            }
            else if (arr[i]>Second_largest && arr[i]!= large){
                Second_largest = arr[i];
            }
        }

        return Second_largest;
    }
    public static void main(String[]args){
        int [] arr = {1,2,4,7,7,5};
        int n = arr.length;
        int SS = Secondsmallest(arr, n);
        int SL =Largest(arr, n);
        System.out.println(" second smallest "+ SS);
        System.out.println("Second largest element "+ SL);
    }
}
