// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Notes : Have two pointers, slow pointer moves 1 node ahead and fast pointer moves 2 nodes ahead. If a cycle is present, then eventually both slow and fast pointers meet at a node(let call it k). The distance from the start of the linked list to the start of the cycle will be equal to the distance from k to the start of the cycle. 

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        boolean cycle;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                break;
            }
        }

        if(fast == null || fast.next == null) return null;
        
        slow = head;
        
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast;
    }
}
