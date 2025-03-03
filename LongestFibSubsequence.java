import java.util.*;
public class LongestFibSubsequence {
    public static int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Set<Integer> numSet = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            numSet.add(num);
        }
        
        int maxLen = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int prev = arr[j], curr = arr[i] + arr[j];
                int length = 2;
                
                while (numSet.contains(curr)) {
                    int temp = curr;
                    curr += prev;
                    prev = temp;
                    length++;
                }
                
                maxLen = Math.max(maxLen, length);
            }
        }
        
        return maxLen >= 3 ? maxLen : 0;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8};
        System.out.println(lenLongestFibSubseq(arr1)); // 5
        
        int[] arr2 = {1,3,7,11,12,14,18};
        System.out.println(lenLongestFibSubseq(arr2)); //3
    }
}
