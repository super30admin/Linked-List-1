#Time Complexity:O(N)
#Space Complexity:O(1)


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current =  head;
        ListNode next = null;
        ListNode prev=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;   
        }
        return prev;
    }
}