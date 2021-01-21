// Time Complexity : O(n)
// Space Complexity : O(h)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        //base case
        if(head == null) return null;
        return helper(head);
    }

    public ListNode helper(ListNode curr){
        //base
        if(curr == null || curr.next == null) return curr;

        //logic
        //flip next point so points to previous node
        //code will go to last element and reverse whole list starting from there
        ListNode rev = helper(curr.next);
        curr.next.next = curr;
        curr.next = null;

        return rev;
    }
}