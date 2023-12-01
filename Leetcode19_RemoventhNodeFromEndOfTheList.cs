/* B_F approach
    take the length
    reach at length-n-1
    slow.nwxt.nwxt
    done!
    tc: O(n) - 2 pass
*/

/*
optimized aproach
//TC : O(N)
//SC": O(1)
1. make a diff of n between slow and fast, and then move them togeher until fast reaches null! updte slow.next to slow.next.next

dont forget to remove the node links completely to be collected by garbage collector*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
//we create dummy node to in case question asked to remove first node, thn dumy will lso cover that edge case

public class Solution {
    public ListNode RemoveNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        int count =0;
        
        while(count <= n)
        {
            fast = fast.next;
            count++;
        }
        
        //check if fast has not reached to null then only we can slow and fast together and still keep the same difference
        while(fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        //take a temp node to store the node that we want to remove
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        
        //removing links of Temp node
        temp.next = null;
        
        return dummy.next;
    }
}