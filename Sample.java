// Problem1 (https://leetcode.com/problems/reverse-linked-list/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}



// Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy, fast=dummy;
        for(int i=0;i<=n;i++)
        {
            fast=fast.next;
        }
        while (fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;   
    }
}



// Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                flag=true;
                break;
            } 
        }
        if(flag)
        {
            slow=head;
            while(slow!=fast)
            {
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
        return null;
    }
}





