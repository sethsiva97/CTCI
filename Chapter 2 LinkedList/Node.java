import java.util.*;

public class Node{
    public int val;
    public Node next = null;

    Node(int val){
        this.val = val;
    }

    public void appendToTail(Node n){
        Node currNode = this;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = n;
    }

}