# Linked-List-1

## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
Reverse Linked list
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode fast=head.next;
        while(fast!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=fast;
            fast=fast.next;
        }
        curr.next=prev;
        return curr;
        
        
    }
}
TIME COMPLEXITY :O(n)
SPACE COMPLEXITY :O(1)
NO ERRORS WHILE EXECUTING .


## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null) return null;
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode start=dummy;
        ListNode fast=dummy;
        int count=0;
        while(count<n)
        {
            fast=fast.next;
            count++;
        }
        while(fast!=null && fast.next!=null)
        {
            start=start.next;
            fast=fast.next;
        }
        start.next=start.next.next;
        return dummy.next;
    }
}
TIME COMPLEXITY :O(n)
SPACE COMPLEXITY :O(1)
NO ERRORS WHILE EXECUTING .


## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
Detect the cycle and path
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode start=head;
        ListNode fast=head;
        boolean b= false;
        while(fast.next!=null && fast.next.next!=null)
        {
            start=start.next;
            fast=fast.next.next;
            if(start==fast)
            {
               b=true;
                break;
            }
        }
        fast=head;
        if(b==false) return null;
            while(start!=fast)
            {
                start=start.next;
                fast=fast.next;
            }
        return start;
         
    }
}
TIME COMPLEXITY :O(n)
SPACE COMPLEXITY :O(1)
NO ERRORS WHILE EXECUTING .

