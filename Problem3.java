public class Problem3 {

    //TC: O(N)
    //SC: O(1)

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean hasCycle(ListNode head) {
        if(head == null)  return false;

        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != null){
            if(fast == null || fast.next == null){
                return false;
            }

            fast = fast.next.next;
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
