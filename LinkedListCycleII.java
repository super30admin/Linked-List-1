// Time Complexity : O(N) as we have to visit all the nodes in the linkedList.
// Space Complexity : O(1) as we are just using two nodes as pointers.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Not really

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null) {            
            slow = slow.next;
            
            if(fast.next == null) {
                fast = null;
            } else {
                fast = fast.next.next;
            }
            
            if(slow != null && slow == fast) {
                while(slow != head) {
                    slow = slow.next;
                    head = head.next;
                }
                
                return slow;
            }
        }
    
        return null;
    }

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
