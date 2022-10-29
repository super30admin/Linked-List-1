// Approach : have a fast point and slow pointer starting from head and traversing the linked list. If there is a cycle in the linked list the two pointers would meet at some point. Now have a pointer starting to traverse from begining of the linkedlist and another from the meeting point at same pace, the new pointers would meet again at the start of the cycle.
// Time Complexity : O(n) where n is the number of items in the linked list
// Space Complexity : O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode DetectCycle(ListNode head) {
        ListNode fast = head, slow =head;
        
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast)
                break;
        }
        
        if(fast == null || fast.next == null) return null;
        
        ListNode x = head, y = slow;
        while(x!=y){
            x = x.next;
            y = y.next;
        }
        return x;
    }
}