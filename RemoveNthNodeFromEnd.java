/*
* Approach:
*  1. Insert a dummy node before head. Place slow and fast pointers at dummy node.
* 
*  2. Move the fast by n position, 
        so that the nodes between slow and fast will n.
    
    if fast reaches null,   
    return head.next because we have to remove the first node.
* 
*  3. Now, move the slow and fast by one step until fast reaches null.
        When fast is at null, slow will be one step before the node to remove
        
            slow.next = slow.next.next

        This removes the node from list.
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n)
* 
* Space Complexity: O(1)
* 
*/

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode curr = head;

        // int length = 0;

        // while(curr!=null){
        //     length++;
        //     curr = curr.next;
        // }

        // if(length < n)
        //     return null;
        
        // if(length == n)
        //     return head.next;

        // int pos = 1;

        // curr = head;

        // while(pos!= (length-n)){
        //     curr = curr.next;
        //     pos++;
        // }

        // curr.next = curr.next.next;

        // return head;

        ListNode dummy = new ListNode(-1);

        dummy.next = head;

        ListNode slow = dummy, fast = dummy;

        int count = 0;

        // given n is less than or equal to length
        while(count<=n){
            fast = fast.next;
            count++;
        }

        if(fast == null)
            return head.next;

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;

        return head;
    }
}
