//reverse linked list 
class Problem1{
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = reverseList(head);
        while(res != null){
            System.out.print(" " +res.val);
            res = res.next;

        }
        

    }
    public static ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return prev;
    }
}



