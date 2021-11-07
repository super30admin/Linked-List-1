public class Problem2 {

    // TC - O(N)
    // SC - O(1)

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy, second = dummy;

        for(int i = 0; i <= n; i++){
            first = first.next;
        }

        while(first != null){
            second = second.next;
            first = first.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {

    }

}
