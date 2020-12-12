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
 /* Time Complexity - O(N)
 /* Space Complexity - O(1)
 Idea - Floyds Tortoise hair algorithm which runs on the fact that one moving with fast speed will catch up slow at some
 point then the slow is moved one point and fast is move point after resetting fast to head. The point
 where they become equal is the starting point of circle.
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == head){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        fast = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}