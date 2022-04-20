// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

/*

    We use a dummy pointer as head of LL. Dummy is used to handle when LL size is 1.
    We move the fast pointer till count<=n. Once we reach this we move slow and fast by 1.
    Then slow.next = slow.next.next;

    we return dummy.next since dummy is -1.

*/

public class RemoveNthNodeFromEndOfList {
    
    public static ListNode removeNthFromEnd(ListNode head, int n)
    {
        if(head == null)
        {
            return head;
        }

        int count = 0;

        ListNode dummy = new ListNode(-1);

        dummy.next=head;

        ListNode slow = dummy,fast = dummy;
        while(count<=n)
        {
            count++;
            fast = fast.next;
        }

        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;

        return dummy.next;
    }

    public static void main(String args[])
    {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        head.next=two;
        two.next=three;
        three.next=four;
        four.next=five;

        ListNode answer = removeNthFromEnd(head, 2);
        while(answer!=null)
        {
            System.out.print(answer.data+" ");
            answer=answer.next;
        }
    }
}
