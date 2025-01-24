
class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode emptyNode = new ListNode();
        emptyNode.next = head;
        ListNode slow = emptyNode;
        ListNode fast = emptyNode;

        for(int i=0; i<n; i++){
            fast=fast.next;
        }

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return emptyNode.next;
    }
}
