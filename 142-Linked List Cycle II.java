//Time complexity=O(n)
//Space complexity=O(1)

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // if(head.next==null || head==null)
        //     return null;
        //We are doing this using two pointer which are slow and fast, fast moves at 2x speed compared to that of slow pointer.As both the pointer intersect we stop the loop and place the slow pointer to the start and again start moving both pointer but now the spped of both the pointer is the same. So now when they intersect they show the point where the loop starts 
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                flag=true;
                break;
            }
        }
        if(!flag) return null;
        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
}