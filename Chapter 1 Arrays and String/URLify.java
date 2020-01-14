public class URLify{
    public static void main(String[] args){
        Solution soln = new Solution();
        char[][] tests = {{'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' '}};
        for(char[] test : tests){
            soln.Url(test,13);
            String s = new String(test);
            System.out.println(s);
        }
    }
}

class Solution{
    public void Url(char[] str,int trueSize){
        int trueIndex = trueSize-1;
        int index = str.length-1;
        while(trueIndex >= 0){
            if(str[trueIndex] != ' '){
                str[index] = str[trueIndex];
                index -= 1;
            }
            else{
                str[index] = '0';
                str[index-1] = '2';
                str[index-2] = '%';
                index -= 3;
            }
            trueIndex -= 1;
        }
    }
}