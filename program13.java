
public static class  program13 {

    
public static int removeduplicate(int arr[]){
       for(int j=0;j<arr.length-1;j++){
        if(arr[j]==arr[j+1]){
            System.out.println("i"+arr[j]);

        }
        
       }

    }
}
public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
public static void main(String[]args){
    int arr[] ={1,1,1,2,2,3,3,3,3,4,4};
    printarr(arr);
    

}
