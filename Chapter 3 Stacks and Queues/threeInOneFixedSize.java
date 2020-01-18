import java.util.*;

public class threeInOneFixedSize{
    public static void main(String[] args){
        Solution soln = new Solution(10);
        try{
            soln.push(0,10);
            soln.push(0,30);
            soln.push(0,54);
            soln.push(0,44);
            soln.pop(0);
            soln.push(1,1);
            soln.push(1,3);
            soln.push(1,4);
            soln.pop(1);
            soln.push(2,8);
            soln.push(2,7);
            soln.push(2,9);
            soln.pop(2);
        }
        catch(Exception e){
            System.out.println("too bad error haha");
        }
        for(Integer num : soln.values){
            System.out.print(num + " ");
        }
    }
}

class Solution{
    Integer[] values;
    int[] sizes = new int[3];
    int capacity;

    Solution(int capacity){
        this.capacity = capacity;
        values = new Integer[3*capacity];
    }

    public void push(int stackNum, int val) throws Exception{
        if(isFull(stackNum)){
            throw new Exception();
        }
        this.sizes[stackNum] += 1;
        values[topOfStack(stackNum)] = val;
    }

    public boolean isFull(int stackNum){
        return sizes[stackNum] == capacity;
    }

    public boolean isEmpty(int stackNum){
        return sizes[stackNum] == 0;
    }

    public int peek(int stackNum) throws Exception{
        if(isEmpty(stackNum)){
            throw new Exception();
        }
        return values[topOfStack(stackNum)];
    }

    public int topOfStack(int stackNum){
        return stackNum*capacity + (sizes[stackNum]-1);
    }

    public int pop(int stackNum) throws Exception{
        if(isEmpty(stackNum)){
            throw new Exception();
        }
        int poppy = values[topOfStack(stackNum)];
        values[topOfStack(stackNum)] = null;
        sizes[stackNum] -= 1;
        return poppy;
    }

}