//time - O(n)
//space - O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextPtr = curr.next;

        while(nextPtr!=null){
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
            nextPtr = nextPtr.next;
        }
        curr.next = prev;
        return curr;
    }
}