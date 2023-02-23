/*
 * Time Complexity : O(n)
 * Space Complexity :  O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - For this question we consider 2 pointers, slow and fast. We initially start slow and fast to a dummy node. We then keep increasing the fast pointer until the the count becomes 
 * n where n is the nth node to be removed. After this we increment the fast and slow pointer by one until fast becomes null. The slow+1th element is the element that needs to be removed, hence
 * we point slow.next to slow.next.next.
 */

//https://leetcode.com/problems/remove-nth-node-from-end-of-list

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
class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(count<=n){
            fast=fast.next;
            count++;
        }

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}