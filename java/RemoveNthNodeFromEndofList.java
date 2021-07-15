// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
2-pass solution
Get the length of the ListNode and subtract the n from it. Traverse until then and change the pointer to next next.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = head;
        int count = 0;
        while(slow!=null){
            count= count+1;
            slow = slow.next;
        }
        slow = dummy;
        System.out.println(count);
        count = count-n;
        while(count>0){
            count--;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}