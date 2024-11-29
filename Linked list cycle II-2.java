// time complexity 0(n)
// space complexity 0(n)
// Code successfully executed in leetcode

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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        // If no cycle in the linkedlist return null.
        if(!flag) return null;
// when slow and fast meets at a node. going to reset the slow pointer to head and increment slow and fast pointer by one node.
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;   
        }
        return slow;
    }
}