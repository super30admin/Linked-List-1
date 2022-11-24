//Time complexity is O(L) where L is length of head - n
//Space complexity is O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr=head;
        int len = 0;
        while(curr!=null){
            curr=curr.next;
            len=len+1;
        }
        len =len-n;
        curr = dummy;
        while(len>0){
            len=len-1;
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return dummy.next;
    }
}