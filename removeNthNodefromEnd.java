//take fast pointer to the nth position and then start moving both slow and fast pointers. When fast reaches the end, slow will reach size-n. Then remove it
//Time complexity: O(n)
//Space complexity: O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=new ListNode();
        temp.next=head;
        ListNode slow=temp;
        ListNode fast=temp;

        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }

        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;

        return temp.next;
    }
}