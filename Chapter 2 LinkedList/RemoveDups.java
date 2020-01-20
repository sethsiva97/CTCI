//Write code to remove duplicates from an unsorted linked list
import java.util.*;

public class RemoveDups{
    public static void main(String[] args){
        Node one = new Node(1);
        Node two = new Node(1);
        Node three = new Node(1);
        Node four = new Node(4);
        Node five = new Node(4);
        Node six = new Node(10);
        Node seven = new Node(-34);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        Node curr = one;
        Soln soln = new Soln();
        soln.noDups(curr);
        while(curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public static class Soln{
        private void noDups(Node head){
            if(head == null){
                return;
            }
            HashSet<Integer> seen = new HashSet<Integer>();
            seen.add(head.val);
            while(head.next != null){
                if(seen.contains(head.next.val)){
                    head.next = head.next.next;
                }
                else{
                    seen.add(head.next.val);
                    head = head.next;
                }
            }
        }
    }
}