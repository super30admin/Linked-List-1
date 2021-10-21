//Time complexity: O(n)
//space complexity: O(1)
//running on leetcode: yes
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null)
        {
            return head;
        }
        //taking dummy node so that the pointers are not pointing to null incase head is to be deleted
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy, fast=dummy;
        int count=0;
        while (count <= n)
        {
            fast=fast.next;
            count++;
        }
        while (fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;//cant return head if the first element needs to be returned
    }
}
