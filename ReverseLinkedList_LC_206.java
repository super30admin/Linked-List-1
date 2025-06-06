/*
Did this code successfully run on Leetcode :  Yes
Any problem you faced while coding this :  No
Time Complexity - O(N)
Space Complexity - O(1) for three pointers and for recursive its O(N)
 */
public class ReverseLinkedList_LC_206 {
    ListNode reversedNode; //global variable for approach 2
    //Approach 1 - Iterative
    public ListNode reverseListIterative(ListNode head) {

        ListNode prev = null; // to point 1 to null
        ListNode curNext = null; // to hold to current's next pointer
        ListNode current = head; // not to mess up head node
        while(current != null){
            curNext = current.next;  // hold current.next pointer in curNext
            current.next = prev;   // point current to prev
            prev = current;        // make current element as prev
            current = curNext;      // and make curnext as current basically we are shifting till end of the list by shifting prev, current and curNext
        }

        return prev;
    }

    //Approach 2 - Recursive with global recursive variable and void helper function
    public ListNode reverseListRecursive(ListNode head) {
           ListNode current = head;
           ListNode prev = null;
           helper(current, prev);
           return reversedNode;

    }

    private void helper(ListNode current, ListNode prev) {
        //base case
        if(current == null) {
            reversedNode = prev;
            return;
        }
        //logic
        ListNode tmp = current.next;
        current.next = prev;
        prev = current;
        current = tmp;

         helper(current, prev);
    }


   //Approach 3 - Pure Recursive without three pointers
        public ListNode reverseListPureRecursive(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode reversed = reverseListPureRecursive(head.next);
            head.next.next = head;
            head.next = null;
            return reversed;
        }
}





