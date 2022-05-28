/**
 * https://leetcode.com/problems/linked-list-cycle-ii
 * 
 * time: O(n)
 * space: O(1)
 * 
 * Leetcode run: yes
 * 
 * Approach:
 * Flyod's Algorithm
 * Distance covered by the slow ptr = distance covered by the fast pointer
 * 
 * 1. have a slow pointer which moves at 1x
 * 2. have a fast pointer which moves at 2x
 * 3. traverse the LL till they meet
 * 4. Once they meet, start the slow from head at 1x and fast at 1x
 * 5. The node which they meet again will be the cycle
 * 
 */
class LinkedListCycle2{
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        if(head.next == null){
            head.next = new ListNode(-1);
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // find the intersection / if the cycle exists
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        
        if(slow != fast) return null;
        
        slow = head;

        while(slow != fast){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}