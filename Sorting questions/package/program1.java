

public class program1 {
    public static int linearsearch(int nums[], int key){
        for(int i =0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }

    

public static void main(String[]args){
    int nums[] ={2,4,6,8,10,12,13,14};
    int key = 12;
    int index =linearsearch(nums, key);
    if (index==-1){
        System.out.println("key not found");
    }
    else{
        System.out.println(" key found at index "+ index);
    }
}
}