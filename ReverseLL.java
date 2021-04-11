// Time Complexity : O(N)
// Space Complexity : Iterative : O(1), recursive : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
//         ListNode prev = null;
//         ListNode curr = head;
        
//         while(curr != null){
//             ListNode nextTemp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nextTemp;
                
//         }
//         return prev;
    }
}

