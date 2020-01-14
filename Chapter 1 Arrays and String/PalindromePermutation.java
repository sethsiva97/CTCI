import java.util.*;

public class PalindromePermutation{
    public static void main(String[] args){
        Solution soln = new Solution();
        String[] tests = {"racecar","tacocat","gg","hello"};
        for(String test : tests){
            System.out.println("the test is " + test + " with result:" + soln.checkPerm(test));
        }
    }
}

class Solution{
    public boolean checkPerm(String str){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        boolean odd = false;
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(Integer val : map.values()){
            if(val%2 != 0 && odd){
                return false;
            }
            else if(val%2 != 0){
                odd = true;
            }
        }
        return true;
    }
}