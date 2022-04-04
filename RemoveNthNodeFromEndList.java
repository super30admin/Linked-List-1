// Time Complexity : O(n) - traversing till the end of the node + k nodes.
// Space Complexity : O(1) - just storing the node references
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : 
// My Notes : 
// https://leetcode.com/submissions/detail/672977478/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){return null;}
        ListNode temp = new ListNode(0);
        temp.next = head;
        head = temp;
        
        ListNode ptr1 = head;
        // Keep the fast pointer ahead by n times
        while(n>0){
            ptr1 = ptr1.next;
            n--;
        }
        // Traverse till the fast reaches end, at that time the slow will be just the node before deletion
        ListNode ptr2 = head;
        while(ptr1!=null && ptr1.next!=null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        // The next nodes needs to be deleted
        if(ptr2!=null){
            ptr2.next =ptr2.next.next;
            //System.out.println(" Ptr 2 : "+ptr2.val);
        }
        return head.next;
    }

}