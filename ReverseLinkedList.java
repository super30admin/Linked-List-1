class ReverseLinkedList{
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    //time complexity :o(n) -> n is list of nodes
    //space :0(1)
    // create prev,next and current nodes. reverse next pointer of current to prev and move to the following nodes untill current = null.
}