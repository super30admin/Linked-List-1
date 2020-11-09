// Time Complexity : O(n) where  n is no.of nodes in the LinkedList
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/*Approach
 * Approach is to use two pointers to keep the track of prev and next position of the current node
 * We iterate over the list by removing  connection from the curr to next node and establishing
 * connection from curr to prev node
 * */

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        //edge
        if(head==null || head.next==null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode fwd = head.next;

        while (fwd !=null){
            curr.next = prev;
            prev = curr;
            curr = fwd;
            fwd = fwd.next;
        }

        curr.next = prev;
        return curr;
    }

    /*Time Complexity = O(n)
     * Space Complexity = O(n) for recursion stack*/
    public ListNode reverseListRecursion(ListNode head){

        if(head==null || head.next==null) return head;

        ListNode revered = reverseListRecursion(head.next);
        head.next.next = head;
        head.next=null;
        return revered;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
