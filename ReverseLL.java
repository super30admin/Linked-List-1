// Approach 1 - Using pointers
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// We keep track of prev, cur and fast pointers so that we can reverse the direction of prev and cur and not lose reference to fast pointer
// We do this till we reach end of LL and then return cur
// Initally prev is null because last node of the LL will point to null
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null)
            return head;
        ListNode prev = null;
        ListNode cur = head;
        ListNode fast = cur.next;
        while(cur.next!=null){
            cur.next = prev;
            prev = cur;
            cur = fast;
            fast = fast.next;
        }
        cur.next = prev;
        return cur;
    }
}

// Approach 2 - Using recursion
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// We can insert all elements in the recursion stack and then process them to build a reversed linked list
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null)
            return head;
        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }
}