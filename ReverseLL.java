// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

/*
1. Using 3 pointers to reverse the list
previous pointer points to null
current pointer points to the first node
forward pointer points to the second node.
Goal: We make current's next as previous
For next iteration:
We make previous pointer as our current pointer.
We make current as forward.
and lastly, forward as forward.next
*/

public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode prev=null;
        ListNode curr=head;
        ListNode forward=head.next;
        while(forward!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=forward;
            forward=forward.next;
        }
        curr.next=prev;
        prev=curr;
        return prev;
        
    }
    public static void main(String[] args)
    {
        ListNode head=new ListNode(3);
        ListNode node= new ListNode(2);
        head.next=node;
        head.next.next=new ListNode(0);
        head.next.next.next=new ListNode(-4);
        head.next.next.next.next=node;


    }
}