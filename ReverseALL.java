// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach'


/*

    We are directly changing the next node addresses.
    Three variables are used.
    prev is initially pointed to null,current to head and fast to head.next

    we change till fast becomes null
    once fast becomes null, we still need to change the last current node address, and we do it.

*/

public class ReverseALL{

    public static ListNode reverseList(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode prev = null,curr = head,fast = head.next;

        while(fast!=null)
        {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        
        curr.next=prev;

        return curr;

    }


    public static void main(String args[])
    {
        ListNode head = new ListNode(10);
        ListNode first = new ListNode(20);
        ListNode second = new ListNode(30);
        ListNode third = new ListNode(40);

        head.next=first;
        first.next=second;
        second.next=third;
        
        ListNode answer = reverseList(head);

        while(answer!=null)
        {
            System.out.print(answer.data+" ");
            answer=answer.next;
        }
    }
}