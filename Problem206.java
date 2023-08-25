
// Using 3 Pointers

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next=head;
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
}


// Using recursion

// Time Complexity : O(n)
// Space Complexity : O(h)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
public ListNode reverseList(ListNode head) {
    // base
    if( head==null || head.next== null ) return head;

    ListNode reversed = reverseList(head.next);
    //head= st.pop();

    head.next.next = head;
    head.next = null;


    return reversed;

}
}