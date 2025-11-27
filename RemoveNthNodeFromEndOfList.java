// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
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
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        while(count < n){//move fast by n places
            fast = fast.next;
            count++;
        }
        if(fast == null)
        {//remove head
            return head.next;
        }
        while(fast.next!=null){//move until fast reaches last node
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;//remove next node of slow
        return head;
    }
}