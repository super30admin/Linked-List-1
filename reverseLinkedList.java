public class reverseLinkedList {
    //TC: O(n)
    //SC: O(1)
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next ==  null){
            return head;
        }

        ListNode prevnode = null;
        ListNode currnode = head;

        while(currnode!=null){
            ListNode nxtnode = currnode.next;
            currnode.next = prevnode;
            prevnode=currnode;
            currnode=nxtnode;
        }
        head = prevnode;
        return head;


    }
}
