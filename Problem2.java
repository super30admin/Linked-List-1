// 19. Remove Nth Node From End of List

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
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode slow = dummy; 
        ListNode fast = dummy; 
        
        int count = 0;
        
        while(count <= n ){
            fast = fast.next;
            count++;
        }
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return dummy.next;
    }
}

/*
Complexity Analysis

Time complexity : 
O(L) The algorithm makes one traversal of the list of L nodes. Therefore time complexity is O(L).

Space complexity : 
O(1).We only used constant extra space.
*/