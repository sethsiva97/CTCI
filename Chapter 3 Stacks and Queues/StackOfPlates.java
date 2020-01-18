import java.util.*;

public class StackOfPlates{

    public static void main(String[] args){
        StackOfPlates.Soln stack = new StackOfPlates.Soln(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    private static class Soln extends ArrayList<Stack<Integer>>{
        int capacity;
        int pointer;

        Soln(int capacity){
            this.capacity = capacity;
            this.pointer = -1;
        }

        private void push(int val){
            if(pointer == -1 || super.get(pointer).size() == this.capacity){
                super.add(new Stack<Integer>());
                this.pointer += 1;
            }
            super.get(pointer).push(val);
        }

        private Integer pop(){
            if(pointer == -1){
                return -1;
            }
            int poppy = super.get(pointer).pop();
            if(super.get(pointer).empty()){
                this.pointer -= 1;
            }
            return poppy;
        }

        public boolean isEmpty(){
            return this.pointer == -1;
        }

        private Integer peek(){
            if(pointer == -1){
                return -1;
            }
            return super.get(pointer).peek();
        }
    }

}