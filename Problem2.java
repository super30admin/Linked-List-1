//remove nth node from end of linkedlist
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/*
we take two pointers , one slow and one fast. fast moves to next till out n is not 0
when the n is zero, when fast has travlled n distance we move slow and fast pointer. till the fast 
reaches end. when fast reached end. the next node to slow will be the node to remove
remove it by making slow.next to its next. 
ALso we assign dummy pointer to maintain head
*/

public class Problem2 {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = removeNthFromEnd(head, 2);
        while(res != null){
            System.out.print(" " +res.val);
            res = res.next;

        }

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //fast pointer & slow pointer
        ///the next to slow pointer will be the pointer to remove
        
        if(head == null)
            return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        while(n >=0){
            fast = fast.next;
            // slow = slow.next;
            n--;
        }
        //
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        //remove next to slow
        
        slow.next = slow.next.next;
        //slow.next = null;
        return dummy.next;
        
    } 

    
}
