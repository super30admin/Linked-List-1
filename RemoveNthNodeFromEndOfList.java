// Time Complexity : O(n), O(n) to calculate length + O(n) to go to the index and update reference of prev.next to cur.next
// Space Complexity : O(1), need two pointers to update reference, remove node at index i
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : needed to write test cases, account for the case where we need to remove the 1st element/head of the list

// Your code here along with comments explaining your approach
// Calculate length of the list
// then get index of element to remove
// traverse to that point and update reference
// needs two passes


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode cur = head;
        
        while(cur!=null){
            length++;
            cur = cur.next;
        }
        
        int idx = length - n;
        
        if(idx==0){
            head = head.next;
            return head;
        }
        
        cur = head;
        ListNode prev = null;
        int counter = 0;
        while(counter<idx){
            prev = cur;
            cur = cur.next;
            counter++;
        }
        
        prev.next = cur.next;
        
        return head;
    }
}