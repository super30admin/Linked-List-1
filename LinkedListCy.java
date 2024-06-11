public class LinkedListCy {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode detectCycle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast== slow)
            {
                slow=head;

                while(fast!=slow)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        ListNode common = new ListNode(2);
        ListNode head = new ListNode(1, common);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4,common);
        LinkedListCy cy = new LinkedListCy();
        ListNode temp=cy.detectCycle(head);
        System.out.println(temp.val);
    }
}
