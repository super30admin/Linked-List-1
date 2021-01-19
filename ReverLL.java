class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }

        if(head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;  //1
        ListNode next ; //

        while( curr != null ) {
            next = curr.next; //2 -- 3 --4 --5 --null
            curr.next = prev;  //5--> 4-->3-->2-->1-->null
            prev = curr; // prev = 1 --2 --3 --4 -- 5
            curr = next; // curr = 2 --3 -- 4 -- 5--null

        }

        return prev;
    }
}