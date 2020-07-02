// Time Complexity : O(n), n is number of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :



//without dummy node :
//2pass
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        int len = 0;
        ListNode dup = head; 
        while(head.next!= null) {
            len++;
            head = head.next;           
        }
        
        if(len == n-1) {
            return dup.next; 
        }
        
        int node = len - n;
        
        ListNode temp = dup;
        while(node > 0) {
            node --;
            temp = temp.next;
        }
        
        temp.next = temp.next.next; 
        
        return dup;         
               
    }
}




//using dummy node 
//2 pass
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        //creat dummy node with 0
        ListNode dummy = new ListNode(0); 
        //point dummy to head
        dummy.next = head; 
        //since head is on first node initialize len = 1
        int len = 1; 
        
        //find length of LL
        while(head != null && head.next != null) {
            head = head.next;
            len ++; 
        }
        
        //point head to dummy as we want to go node prev to node we want to remove
        //so start one node behind
        head = dummy;
        
        //find which node to delete
        len -= n;
        
        //move head to one node prev of node to remove
        while(len > 0) {
            head = head.next;
            len--; 
            
        }
        
        //remove the node
        head.next = head.next.next; 
        
        //return dummy.next (to avoid returning the extra node create)
        return dummy.next; 
        
    }
}



//1 pass
//using dummy node
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        //create dummy node
        ListNode dummy = new ListNode(0);
        //point it to head
        dummy.next = head;
        
        //create two nodes/pointers slow and fast and point it to dummy
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        //initialize count = n, to move fast pointer to n position from head
        int count = n; 
        
        //since we start from dummy (one node before head) condition is count >= 0 and not count > 0
        while(count >= 0) {
            fast = fast.next;
            count--;
        }
        //fast pointer is moved to nth node from start
        
        
        //now move slow and fast until fast reaches null
        //when fast is null (crossed last node), 
        //slow pointer reaches prev node of node to be deleted as it starts one node before head
        while(fast != null) {
            slow = slow.next; 
            fast = fast.next; 
        }
        
        //delete the node
        slow.next = slow.next.next; 
        
        //return the list
        //return dummy.next and not head (in case of one node and deleting that node)
        return dummy.next; 
        
    }
}
