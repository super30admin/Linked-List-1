// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Easy to understand


// Your code here along with comments explaining your approach

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        //Create 3 pointers so that you can go forward but link nodes backwards
	ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        
        while(curr.next != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = curr.next;
        }
        curr.next = prev;
        return curr;
        
    }
}