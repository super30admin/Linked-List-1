//time complexity:O(l)
//space complexity:O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);//initialize a dummy node
        dummy.next=head;//before the head
        ListNode slow = dummy;//initialize the fast and slow pointers
        ListNode fast = dummy;//at dummy
        int count = 0;
        while (count<=n)
        {
            fast=fast.next;//increment the fast pointer such that
            count ++;//the gap between slow and fast is n
        }
        while(fast!=null)
        {
            slow=slow.next;//increment the pointers by one
            fast=fast.next;//untill the fast pointer reaches null
        }
        slow.next=slow.next.next;//delete the second last element
        return dummy.next;
    }
}
