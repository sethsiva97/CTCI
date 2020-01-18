import java.util.*;

public class StackMin{
    public static void main(String[] args){
        Soln soln = new Soln();
        try{
            soln.push(7);
            soln.push(8);
            soln.push(6);
            soln.push(5);
            System.out.println("the min is " + soln.getMin());
            System.out.println("the popped value is " + soln.pop());
            System.out.println("the min is " + soln.getMin());
            System.out.println("the popped values is " + soln.pop());
            System.out.println("the min is " + soln.getMin());
        }
        catch(EmptyStackException e){
            System.out.println("fuck we have an empty stack");
        }
    }

    private static class Soln{
        Stack<Integer> realStack = new Stack<Integer>();
        Stack<Integer> minStack = new Stack<Integer>();

        private int getMin() throws EmptyStackException{
            if(minStack.empty()){
                throw new EmptyStackException();
            }
            return minStack.peek();
        }

        private boolean isEmpty(){
            return realStack.empty();
        }

        private void push(Integer val){
            realStack.push(val);
            if(minStack.empty() || minStack.peek() >= val){
                minStack.push(val);
            }
        }

        private int pop() throws EmptyStackException{
            if(realStack.empty()){
                throw new EmptyStackException();
            }
            int poppy = realStack.pop();
            if(poppy == minStack.peek()){
                minStack.pop();
            }
            return poppy;
        }

    }
}