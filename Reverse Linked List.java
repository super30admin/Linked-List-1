
 // Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
//Using Recursion : Here we will recurse until we reach the end of the list and add the last node to the result and the recursive stack will have the second last element as the head. 
//So the next value of head will be the last node. So we need to point it back to the head, hence we do head.next.next=head. This way the last two nodes are reversed, and we will point the head node to null adn return the result.

class Solution {
    ListNode result;
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        // This will keep executing until head.next==null, when head will be the last element in the result variable
        result=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return result;

    }
}



//We will use three pointers. Prev, Curr and temp. We will point prev at null, curr at the head(first node) and temp at head. next which is the second node. Every node should be pointing to its previous node for the list to be reversed. So we will point curr to the prev node and keep incrementing each pointer.
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode prev=null;
        ListNode curr=head;
        ListNode temp=head.next;

        while(temp!=null)
        {
            curr.next=prev; //connecting curr to its previous node
            prev=curr;
            curr=temp;
            temp=temp.next;
        }
curr.next=prev;
return curr;
    }
}