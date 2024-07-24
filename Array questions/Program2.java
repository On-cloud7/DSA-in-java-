public class Program2 { // find the max and min in the array
    public static void main(String[] args) {
        int [] arr = {6,2,3,4,1,9};
        findMinAndMax(arr);
    }
        static void findMinAndMax (int[] arr){
            if(arr == null || arr.length == 0)
            return;
            
        int min =arr[0];
        int max = arr[0];
        for(int i =0;i<arr.length;i++){

            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
            }
            System.out.println("maximum value :" +max);
            System.out.println("minimum value :" + min);

        }
       
}
    

