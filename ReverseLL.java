// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: We are using three pointer approach.
//We need 3 or else we loose the pointer to the next node after the head. Prev points to the curr and 
//pointer of curr points to prev and fast will be iterating.


//Approach 1 - Iterative approach
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode curr = head;
        ListNode fast = head.next;
        ListNode prev = null;
        
        while(fast != null)
        {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        
        curr.next = prev;
        return curr;
    }
}

//Approach 2 - Recursive approach
/*
 * Recurse until the 2nd last node and recursive stack gets filled. Then st.pop() happens and you reverse 
 * the list.
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return reversed;
    }
}