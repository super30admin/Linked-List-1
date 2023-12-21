/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

/*
BF approach : take a stack
push all nodes
when popping, just assign the next popping node
tc: O(n)
sc: O(n)*/

/*
optimized approach -1 with temp outside while
take three pointer,
prev = null
curr = head
fwd = curr.next

and move pointer as programmed
*/


/*
optimized approach -2 with temp inside while
take three pointer,
prev = null
curr = head
fwd = curr.next

and move pointer as programmed
*/

public class Solution {
    public ListNode ReverseList(ListNode head) {
        //base case
        if(head == null) return null;
        
        ListNode prev= null;
        ListNode curr= head;
        ListNode temp = curr.next;
        
        
        while(temp != null)
        {
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = temp.next;
        }
        
        //last check is remained
        curr.next = prev;
        return curr;
    }
}
public class Solution {
    public ListNode ReverseList(ListNode head) {
        //base case
        if(head == null) return null;
        
        ListNode prev= null;
        ListNode curr= head;
        
        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
}