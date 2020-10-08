// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes, 0ms
// Any problem you faced while coding this : No, I had solved this problem before


// Your code here along with comments explaining your approach

// Basic Idea is to have 2 pointers slow and fast at a distance that when, fast is at the end of the list, slow is at the (n-1) node, so that next can be set as the next's next node

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode slow = head;
        
        ListNode fast = head;
        
        int i = 0;
        
        while(i < n){
            fast = fast.next;
            i++; 
        }
        
        if (fast == null) {  // Single Case Handle
			head = head.next;
			return head;
		}
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;   
        }
        
        slow.next = slow.next.next;
        
        return head;
        
        
    }
}