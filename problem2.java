
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

class removeNthNodeFromEndOfList{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;

        int count = 0;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        while(count <= n){
            count++;
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        removeNthNodeFromEndOfList rd = new removeNthNodeFromEndOfList();
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        h.next.next.next = new ListNode(4);
        h.next.next.next.next = new ListNode(5);
        int n = 2;
        System.out.println(rd.removeNthFromEnd(h, n).val);
    }
}