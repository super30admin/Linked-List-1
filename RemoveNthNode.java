//Problem 50: Remove Nth Node From End of List
// Time Complexity : O(L), l stands for length of the linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* 
  Steps: 
     Bruteforce : 2 Pass : Get the length of the linked list by traversing over the whole list. Then calculate position of the node to be removed from the start by subtracting n from the length of the linked list. Create a dummy head/start node and point it towards the head, because there can be a case where head node to be removed. Then iterate over the head with a "prev" node till the position is greater than or equal to 0 so that curr pointer will be at the position to be removed and prev pointer will be at 1 node previous to the current node. Here, prev pointer will help in removing the next node. Once above traversal is stopped, just update prev.next to prev.next.next and return dummy node.next.   

     Optimized : 1 Pass : Use concept of slow and fast pointers. In addition, create a dummy head/start node and point it towards the head, because there can be a case where head node to be removed. Initialise slow and fast pointer to the dummy/start node that you created earlier.
     First move the fast pointer "n" steps ahead at a constant(1) pace, then start traversing from head and move slow and fast at a constant(1) pace until fast reaches the end of the linked list that is fast!=null or fast.next!=null. Once this step is completed just update slow.next = slow.next.next because slow will be pointing to the previous node of the node to be removed. Finally, return the dummy node.next;
*/

class Solution50 {

    class ListNode{
        ListNode next;
        int val;

        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null) return null;
        
        //TC: O(L),SC:O(1)
        //1 pass
        //because there is a possibility that I have to remove the head node
        ListNode start = new ListNode(-1);
        start.next = head;
        ListNode slow = start;
        ListNode fast = start;
        
        int i=0;
        while(i<n){
            fast = fast.next;
            i++;
        }
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return start.next;
        
        //Using Two Pass

        /* TC:O(L),SC:O(1)
        ListNode start = new ListNode(-1);
        start.next = head;
        
        ListNode curr = head;
        
        int len = 0;
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        
        curr = start;
        
        ListNode prev = start;
        
        len -= n;
        
        while(len>=0){
            prev = curr;
            len--;
            curr = curr.next;
        }
        
        prev.next = prev.next.next;
        
        return start.next;*/
    }
    
}