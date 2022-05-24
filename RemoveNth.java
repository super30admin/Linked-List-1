public class RemoveNth {
    private int helper(ListNode head, int n){
        if(head == null){
            return 0;
        }
        int count = helper(head.next, n);
        if(count == -1){
            return -1;
        }
        if(count == n){
            head.next = head.next.next;
            return -1;
        }
        return count+1;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = helper(head,n);
        if(c == -1){
            return head;
        }
        else{
            return head.next;
        }
    }
}
