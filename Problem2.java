// Leetcode 19: Remove Nth Node from end of list
// Time - O(n)
// Space - O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        head = dummy;
        
        int count = 1;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(count <= n){
            
            fast = fast.next;
            count++;
        }
        
        while(fast.next != null){
            
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        
        return head.next;
    }
}