import java.util.*;

public class CheckPermutation{
    public static void main(String[] args){
        Solution soln = new Solution();
        System.out.println("testeing hello and lloeh result:" + soln.isPerm("hello","lloeh"));
        System.out.println("testing testie and gggggg result:" + soln.isPerm("testie","gggggg"));
    }
}

class Solution{
    public boolean isPerm(String sOne, String sTwo){
        if(sOne.length() != sTwo.length()){
            return false;
        }
        int[] counts = new int[26];
        for(int i = 0; i < sOne.length(); i++){
            counts[sOne.charAt(i)-'a'] += 1;
        }
        for(int i = 0; i < sTwo.length(); i++){
            counts[sTwo.charAt(i)-'a'] -= 1;
        }
        for(int count : counts){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}