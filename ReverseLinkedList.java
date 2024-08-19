/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Iterative solution.
// for example, consider 1->2->3. dummy = null
// Time complexity = O(n)
// Space complexity = O(1)
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        while(head!=null) {
            ListNode temp = head.next;
            head.next = dummy;
            dummy = head;
            head = temp;
        }
        return dummy;
    }
}



// recursive approach
// take an example 1->2->3->4->5
// we need to make this 5->4->3->2->1
// Time complexity = O(n)
// Space Complexity = O(h) if we consider the recursive stack otherwise 1.
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return helper(head);        
    }    
    private ListNode helper(ListNode curr) {
        if(curr == null || curr.next==null) {
            return curr;// for 5 (curr.next ==null helps. The curr==null is for [] list)
        }
        ListNode result = helper(curr.next);
        // stack.pop();
        // what will be the curr in the stack -> 1,2,3,4,5(5 will return 5).
        
        curr.next.next = curr;// for the rest (4,3,2,1) (curr is 4,3,2,1).
        curr.next = null; // for the rest
        return result; // returns result which is 5 (the head).
    }
}