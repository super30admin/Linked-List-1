
class Sample {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Time Complexity : O(N) N is size of the linked list
    // Space Complexity : O(1) 
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No


    // Problem 1
    1. Take a previous dummy node and change the links between every two nodes.
    2. Change the link between two nodes and assign second nodes's next as first node.
    3. Make second node as first node and second node's next as second node and continue.
    */



    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode current = head;
        ListNode next = head;
        
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
        
        // if(head == null || head.next == null) return head;
        
        // ListNode r = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;
        
        // return r;
        
    }

    // Time Complexity : O(N) N is size of the linked list
    // Space Complexity : O(1) 
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No


    // Problem 2
    /*
    1. Take two pointers. To remove the node from nth position from end, we have to move these poiners such
    that when second pointer reaches the end, first pointer is at the (n-1)th position.
    2. For this, at the start we need second pointer at (n+1)th position from start and first pointer at the start.
    3. We also need a dummy pointer to pointing at head, as if head is the only node and it has to be removed
    we can return dummy pointer's next.
    */

    public ListNode removeNthFromEnd(ListNode head, int n) {
                
                ListNode temp = new ListNode(0);
                temp.next = head;
                ListNode slow = temp, fast = temp;
                
                int i = 0;
                
                while(i <= n) {
                    fast = fast.next;
                    i++;
                }
                
                while(fast != null) {
                    fast = fast.next;
                    slow = slow.next;
                }
                slow.next = slow.next.next;
                
                return temp.next;
                
            }
        

    // Time Complexity : O(N) N is size of the linked list
    // Space Complexity : O(1) 
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No


    // Problem 3
    /*
    1. 
    */

    public ListNode detectCycle(ListNode head) {
        
        if(head == null || head.next == null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        
        if(!isCycle)
            return null;
        
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}