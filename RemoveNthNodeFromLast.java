/**
 * The time complexity is O(N) and the space complexity is O(1)
 *
 * The solution has a fast node which goes to nth element from the head. Now, move the the fast till the last node and also move slow
 * and dummy with each step. This brings slow to the nth node from the last. dummy node before that. So make dummy.next = slow.next
 * to remove slow.
 *
 * if(slow==head) is used if we want to remove the head
 *
 * Yes, the code passed all the test cases.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head;
        ListNode fast = head;

        for(int i=1;i<n;i++){
            fast = fast.next;
        }

        ListNode dummy = new ListNode(head.val); dummy.next = head;
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
            dummy = dummy.next;
        }

        if(slow == head){
            head = slow.next;
        }

        dummy.next = slow.next;
        return head;
    }
}