public class program22 {
   
    static boolean checkDuplicates(int[] arr) {
		int n = arr.length;
      	
        // Outer loop to pick each element one by one
        for (int i = 0; i < n - 1; i++) {
          
            // Inner loop to compare the current element 
          	// with the rest of the elements
            for (int j = i + 1; j < n; j++) {
              
                // If a duplicate is found Return true
                if (arr[i] == arr[j])
                    return true;
            }
        }

        // If no duplicates are found, return false
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(checkDuplicates(arr));
    }
}