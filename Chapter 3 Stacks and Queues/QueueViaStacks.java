import java.util.*;

public class QueueViaStacks{

    public static void main(String[] args){
        QueueViaStacks.myQueue queue = new QueueViaStacks.myQueue();
        queue.enque(1);
        queue.enque(3);
        queue.enque(2);
        System.out.println("expected result is 1, true result is " + queue.deque());
        queue.enque(4);
        queue.enque(5);
        System.out.println("expected result is 3, true result is " + queue.deque());
        queue.enque(6);
        System.out.println("expected result is 2, true result is " + queue.deque());
        System.out.println("expected result is 4, true result is " + queue.deque());
        System.out.println("expected result is 5, true result is " + queue.deque());
        System.out.println("expected result is 5, true result is " + queue.deque());
        System.out.println("expected result is -1, true result is " + queue.deque());
    }

    private static class myQueue extends Stack<Integer>{
        Stack<Integer> s2 = new Stack<Integer>();

        public void enque(int e){
            super.push(e);
        }

        public int deque(){
            reshuffle();
            return emptiness() ? -1 : s2.pop();
        }

        public boolean emptiness(){
            return super.isEmpty() && s2.isEmpty();
        }

        public int peeky(){
            reshuffle();
            return emptiness() ? -1 : s2.peek();
        }

        public void reshuffle(){
            if(s2.isEmpty()){
                while(!super.isEmpty()){
                    s2.push(super.pop());
                }
            }
        }
    }

}