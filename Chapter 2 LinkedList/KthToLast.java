//implement an algorithm to find the kth to last element of a singly linked list
import java.util.*;

public class KthToLast{
    public static void main(String[] args){
        Soln soln = new Soln();
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        Node curr = one;
        while(curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("the 2nd last is " + soln.findKth(one,2).val);
        System.out.println("the 3rd last is " + soln.findKth(one,3).val);
        System.out.println("the 1st last is " + soln.findKth(one,1).val);
        System.out.println("the 6th last is " + soln.findKth(one,6).val);
        System.out.println("the 10th last is " + soln.findKth(one,10).val);
    }

    public static class Soln{
        public Node findKth(Node head, int k){
            if(head == null){
                return null;
            }
            Stack<Node> stack = new Stack<Node>();
            while(head != null){
                stack.push(head);
                head = head.next;
            }
            Node kth = null;
            try{
                for(int i = 0; i < k; i++){
                    kth = stack.pop();
                }
            } 
            catch(Exception e){
                return null;
            }
            return kth;
        }
    }
}