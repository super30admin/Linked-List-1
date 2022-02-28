//TC: O(n)
//SC: O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                break;
            }
        }

        //fast is invalid -> there is no cycle
        if (fast == null || fast.next == null)
        {
            return null;
        }

        //slow == fast = > there is a cycle


        slow = head;

        while(slow != fast)
        {
            slow = slow.next;
            System.out.println(slow.val);
            fast = fast.next;
            System.out.println(fast.val);
        }

        return slow;

    }
}