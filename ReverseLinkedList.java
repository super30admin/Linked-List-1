//TimeComplexity: O(N)
//SpaceComplexity: O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode fast = head.next;

        while(fast!=null){
            current.next= prev;
            prev = current;
            current = fast;
            fast=fast.next;
        }
        current.next=prev;
        return current;
    }
}