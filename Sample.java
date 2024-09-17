// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public ListNode reverseList(ListNode head) {
    	//initialise two listnodes prev and current
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
        	//pointing backwards
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
        
    }
}