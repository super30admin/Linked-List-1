// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ReverseList
{
    public ListNode reverseList(ListNode node)
    {
        ListNode prev = null;
        ListNode curr = node;
        ListNode temp;

        while (curr != null)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    ListNode prev = null;
    public ListNode reverseListRecursive(ListNode node)
    {
        helper(node);
        return prev;
    }

    public void helper(ListNode curr)
    {
        // Base
        if(curr == null)
            return;

        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        helper(temp);
    }
}
