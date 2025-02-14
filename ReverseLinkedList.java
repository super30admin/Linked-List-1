class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
        return head;

        ListNode prev = null;
        ListNode cur = head;
        while(cur !=null)
        {
            ListNode temp = cur.next;
            cur.next=prev;
            prev= cur;
            cur=temp;
        }
        return prev;



    }
}

//Time Complexity (TC): O(n)
//Space Complexity (SC): O(1)