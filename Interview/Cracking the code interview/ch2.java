import java.util.HashSet;

class Node{
    int data;
    Node next;
    public Node(int data,Node next) {
        this.data=data;
        this.next=next;
    }

    public static void printList(Node head) {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

}


public class Ch2 {

    //1
    //Write code to remove duplicates from an unsorted linked list. 
    //How would you solve this problem if a temporary buffer is not allowed.
    public static void removeDup(Node node) {
        HashSet<Integer> hs=new HashSet<Integer>();
        Node temp=node;
        Node prev = null;
        while(temp!=null) {
            if(hs.contains(temp.data)) {
                prev.next=temp.next;
            }
            else {
                hs.add(temp.data);
                prev=temp;
            }

            temp=temp.next;  
        }
        Node.printList(node);
    }

    //2
    //Implement an algorithm to find the kth to last element of a singly linked list (Length - K elements)
    public static void kToLast(Node node,int k) { //O(n) & O(1) space
        Node slow=node;
        Node fast=node;
        for(int i=0;i<k;i++) {
            if(fast==null)
                return;
            fast=fast.next;
        }

        while(fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }

        Node.printList(slow);
    }

    //3
    /*
     * Implement an algorithm to delete a node in the middle (i.e., any node but
    the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
    that node.
     */
    public static void deleteMiddle(Node node) {
        if(node==null || node.next==null) //last
            return;
        node.data=node.next.data;
        node.next=node.next.next;
    }

    //4
    /*
     * Write code to partition a linked list around a value x, such that all nodes less than x come
    before all nodes greater than or equal to x. lf x is contained within the list, the values of x only need
    to be after the elements less than x (see below). The partition element x can appear anywhere in the
    "right partition"; it does not need to appear between the left and right partitions.
     */
    public static void partitionList(Node node,int x) {
        Node lessStart=null;
        Node lessEnd=null;
        Node moreStart=null;
        Node moreEnd=null;

        while(node!=null) {
            if(node.data<x) {
                if(lessStart==null) {
                    lessStart=node;
                    lessEnd=node;
                }
                else {
                    lessEnd.next=node;
                    lessEnd=node;
                }
            }else {
                if(moreStart==null) {
                    moreStart=node;
                    moreEnd=node;
                }
                else {
                    moreEnd.next=node;
                    moreEnd=node;
                }
            }
            node=node.next;
        }
        lessEnd.next=moreStart;
        moreEnd.next=null;
        Node.printList(lessStart);
    }

    //5
    /**
     * You have two numbers represented by a linked list, where each node contains a single
    digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
    function that adds the two numbers and returns the sum as a linked list.
     * @param args
     */
    public static Node sumListOne(Node n1,Node n2,int carry) {
        if(n1==null && n2==null && carry==0) {
            return null;
        }
        int value=carry;
        Node result=new Node(0,null);
        if(n1!=null) {
            value+=n1.data;
        }
        if(n2!=null) {
            value+=n2.data;
        }
        result.data=value%10;
        if(n1!=null || n2!=null) {
            result.next=sumListOne(n1==null?null:n1.next,n2==null?null:n2.next,value>=10?value/10:0);
        }

        return result;
    }


    public static Node reverseList(Node head) {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        curr=prev;
        return curr;
    }

    //6
    public static boolean checkPalindrome(Node head) {
        Node fp=head;
        Node sp=head;
        Node prev=null;
        while(fp.next!=null && fp!=null) {
            fp=fp.next.next;
            prev=sp;
            sp=sp.next;
        }
        if(fp!=null) { //Skips the middle element in case of odd number of nodes.
            sp=sp.next;
        }
        sp=reverseList(sp);
        fp=head;
        prev.next=null;
        while(fp!=null && sp!=null) {
            if(fp.data==sp.data) {
                fp=fp.next;
                sp=sp.next;
                continue;
            }
            else
                return false;
        }
        return true;
    }

    public static int calculateLength(Node curr) {
        int length=0;
        while(curr!=null) {
            length++;
            curr=curr.next;
        }
        return length;
    }

    public static void advanceHead(Node curr,int length1,int length2) {
        for(int i=0;i<length1-length2;i++)
            curr=curr.next;
    }
    
    //7
    /*
     * Given two singly linked list, determine if two lists intersect. Return the intersecting node.
     * Hint: Intersecting nodes have the same last node
     */
    public static Node checkIntersection(Node head1,Node head2) {
        Node tail1=head1;
        int length1=calculateLength(tail1);
        
        Node tail2=head2;
        int length2=calculateLength(tail2);
        
        if(tail1!=tail2)
            return null;
        
        advanceHead(length1>length2?head1:head2,length1>length2?length1:length2,length1<length2?length2:length1);
        
        for(int i=0;i<Math.abs(length1-length2);i++) {
            if(head1==head2)
                return head1;
            else {
                head1=head1.next;
                head2=head2.next;
            }
        }
       

        return null;
    }
    
    //8
    //Loop Detection: Given a circular Linked List, return the node at the beginning of the loop.
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if(head==null || head.next==null)
                return false;
            ListNode fp=head;
            ListNode sp=head;
            while(fp!=null && fp.next!=null){
                    fp=fp.next.next;
                    sp=sp.next;
                if(fp!=sp){
                    continue;
                }
                else{
                    return true;
                }
                
            }
            
            return false;
        }
    }

    public static void main(String args[]) {
        Node head=new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,new Node(4,new Node(3,new Node(2,new Node(1,null)))))))));
        Node head3=new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,null)))));
        //Node head2=new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,new Node(4,new Node(3,new Node(2,new Node(1,null)))))))));
        //removeDup(head);
        //kToLast(head,5);
        //partitionList(head,5);
        // Node.printList(sumListOne(head,head2,0));
        System.out.println(checkPalindrome(head3));

    }
}
