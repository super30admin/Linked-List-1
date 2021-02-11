/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution 
{

    public ListNode reverseList(ListNode head) 
    {
        // return reverseWithStack(head);

        return reverseInplace(head);
    }

    private ListNode reverseWithStack(ListNode node)
    {
        Stack<Integer> stack = new Stack<>();
        ListNode dummy = new ListNode(0);

        while(node!=null)
        {
            stack.push( node.val);
            node = node.next;
        }

        ListNode temp = dummy;

        while( !stack.isEmpty() )
        {
            int currentValue = stack.pop();

            ListNode newnode = new ListNode(currentValue);

            temp.next = newnode;
            temp = temp.next;
        }


        return dummy.next;
    }

    private ListNode reverseInplace(ListNode head)
    {
        if(head == null) return head;

        ListNode current = head;
        ListNode previous = null;
        ListNode next = current.next;

        while(next != null)
        {
            current.next = previous;
            previous = current;
            current = next;
            next = next.next;

        }

        current.next = previous;

        return current;
    }
}


//================

//TC - O(n)
//SC - O(1)

public class ReverseLinkedListRecursive {

     public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode revList = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return revList;
    }
