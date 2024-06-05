package Question3;

public class Solution3 {
    public static void main(String [] args){
        int[] arr1 = {0, -1, 2, -3, 1};
        int t1 = -2;
        System.out.println(isThereASum(arr1, t1));   

        int[] arr2 = {1, -2, 1, 0, 5};
        int t2 = 0;
        System.out.println(isThereASum(arr2, t2));   
    }
    public static boolean isThereASum(int[] arr, int t) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == t) {
                    return true;
                }
            }
        }
        return false;
    }
}
    
 
