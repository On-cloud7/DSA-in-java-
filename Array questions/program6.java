public class program6 { // find max second method
    public static int binarySearch(int num[], int key){
        int start=0; int end =num.length-1; 
        while (start<=end) {
            int mid =(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                return mid+1;
            }
            else{
                if(num[mid]>key){
                    return mid-1;
                }
            }
            return -1;
        }
        return end; 
    }
    public static void main(String[] args) {
    int num []={2,4,6,8,10,12,14,16,18,20};
    int key =10;
    System.out.println("index for the num is"+binarySearch(num,key));
    }
    
}
