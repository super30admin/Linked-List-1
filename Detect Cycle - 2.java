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

//Time Complexity = O(2N);
//Space Complexity = O(1);
//Method: write mathematical equation for distance travelled by slow pointer and fast pointer, inorder to reach the cycle head, it takes equivalent distance from slow and head pointer.
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //base
        if(head == null)return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode slower = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) break;
        }
        if(fast == null || fast.next == null) return null;


        while(slower != slow){
            slow = slow.next;
            slower = slower.next;
        }
        return slow;
    }
}