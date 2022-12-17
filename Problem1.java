// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :yes, handling null 


class Solution {

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        // itetative
        //return reverseListItr(head);
        //recursive
        return reverseListRecurse(head);

    }
 /*
we can solve this using 3 pointers, prev, current and next,we wil move it by one point and make curent's next point to prev and make the prev.next = null to prevent any cycle

T: O(n)
S : O(1)
 */
    public ListNode reverseListItr(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;
        
        while(next!=null){
            // make current's next point to prev
            current.next = prev;
            // move each pointer one step
            prev = current;
            current = next;
            next = next.next;
        }

        // when next is null, then there would be still one connection to make
        current.next = prev;

        // current would be the new head if the reverse list
        return current;
        
    }
    /*
    we will recurse on the list until the last node, that node would be the head of the reversed linked list,
    we then keep reversing next to point to current 
T: O(n)
S : O(n) // recursing stack
    */

    public ListNode reverseListRecurse(ListNode node){

        // base case
        if(node.next == null){
            return node;
        }

        //recurse
        ListNode head = reverseListRecurse(node.next); // we will go deep in the recursion to get the head of the new rev list
        // logic
        node.next.next = node;
        node.next = null; // preveting a cycle

        return head;
    }


}