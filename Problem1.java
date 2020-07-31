// There are two approaches
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// Approach 1: Iterative 
// Time Complexity : O(n)
//      n: number of elements in LinkedList
// Space Complexity : O(1)
//      Only three extra pointers
class Problem1S1 {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /** returns reversed linked list */
    public ListNode reverseList(ListNode head) {
        
        /// edge case
        if(head==null || head.next==null)
            return head;
        // pointers
        ListNode previous = null;
        ListNode current = head;
        ListNode adjacent = head.next;
       
        // till we reach end of list
        while(adjacent != null){   
            current.next = previous;
            previous = current;
            current = adjacent;
            adjacent = adjacent.next;
        }
        
        // last element to be linked
        current.next = previous;
        // changing head pointer
        head = current;
        return head;  
    }
}

// Your code here along with comments explaining your approach
// 1. Reach the last element and return as new head.
// 2. In the recursive call local head is previous element.
// 3. Now make  Current's next point to previous element.
// 4. Now unlink previous's next.
// Approach 1: Recursive 
// Time Complexity : O(n)
//      n: number of elements in LinkedList
// Space Complexity : O(n)
//      Considering recursive stack space otherwise O(1)
class Problem1S2 {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /** returns reversed linked list */
    public ListNode reverseList(ListNode head) {
        
        return helper(head);
    }
    
    /** helper function */
    private ListNode helper(ListNode head){

        // base case
        if(head==null || head.next==null)
            return head;
        // new head is last element
        ListNode newHead = helper(head.next);

        // linking adjacent to the previous
        head.next.next= head;

        // unlinking 
        head.next = null;

        // return new Head
        return newHead;
        
    }
}