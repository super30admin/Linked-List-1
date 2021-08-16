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
//Time: O(n)
//Space:O(1)
//Did it run successfully on leetcode: yes
class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if head is null
        if(head==null) return null;
        //dummy node to keep track of start of node
        ListNode dummy = new ListNode(-1);
        //pointing next of dummy to head
        dummy.next = head;
        //initializing slow and fast pointer
        ListNode slow=dummy, fast=dummy;

        int m = 0;
        //move fast pointer untill it is n distance from slow
        while(m<n){
            fast = fast.next;
            m++;
        }
        ////untill next node of fast is not null
        while(fast.next!=null){
            //move slow pointer
            slow = slow.next;
            //move fast pointer
            fast = fast.next;
        }
        //when slow pointer is in (n+1)th position from last
        //remove nth node i.e. next node  of slow pointer
        slow.next = slow.next.next;

        return dummy.next;
    }
}