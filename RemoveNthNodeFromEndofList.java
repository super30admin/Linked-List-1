////Time complexity:O(n)
//Space Complexity:O(1)
//Amazon, Google Interview
//consider to linkedlist a dummy node and consider two pointers to dummy node as slow and fast pointer traversing through linked list.conside 1 element as given linked list and advanced pointer of fast it points to null.
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
      if(head == null || n == 0) return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count=0;
        
        while(count <=n){
            count++;
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}