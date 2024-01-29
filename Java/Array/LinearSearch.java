import java.util.*;
public class Solution {
    public static int linearSearch(int n, int num, int []arr){
        int index = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == num){
                index = i;
                break;
            }
        }

        return index;
    }
}