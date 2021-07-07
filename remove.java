// Time Complexity :O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : got confused with the implementation

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        if(head.next == null) return null;
        ListNode curr = head;
        ListNode prev;
        int count = 0;
        
        //get the total count of the nodes
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        
        //check if it's trying to remove head, if it is advance pointer and return
        if(count == n){
            head = head.next;
            return head;
        }
        
        curr = head;
        prev = head;
        //get prev and curr into the correct position to perform the cut
        for(int i=0; i<count-n; i++){
            prev = curr;
            curr = curr.next;
        }
        //perform the cut
        prev.next = curr.next;
        curr.next = null;
        
        //return the remaining list
        return head;
    }
}