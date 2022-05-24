public class Reverse {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode rev_head = head, temp = head.next;
        while(temp!=null){
            ListNode t2 = temp.next;
            temp.next = rev_head;
            rev_head = temp;
            temp = t2;
        }
        head.next = null;
        return rev_head;
    }
}
