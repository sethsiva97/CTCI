import java.util.*;

public class IsUnique{
    public static void main(String[] args){
        Solution soln = new Solution();
        String[] tests = {"hello","hi","gge","gert"};
        for(String test : tests){
            System.out.println("String:" + test + " result:" + soln.Unique(test));
        }
    }
}

class Solution{
    public boolean Unique(String str){
        HashSet<Character> map = new HashSet<Character>(); 
        for(int i = 0; i < str.length(); i++){
            if(!map.add(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}