/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// Time Complexity: O(n)
// Space Complexity: O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow = head, fast = head, intersect=null;
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                intersect = slow;
                break;
            }
        }


        if(intersect == null){
            return null;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while(ptr1!=ptr2){
            ptr1= ptr1.next;
            ptr2=ptr2.next;
        }

        return ptr1;

    }
}