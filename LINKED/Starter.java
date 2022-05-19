package LINKED;

public class Starter {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        LINKED.Common.print(head);
        //Reverse
        System.out.println("Reverse: ");
        ListNode reverNode = Reverse.reverse(head);
        LINKED.Common.print(reverNode);

        //Remove kth
        ListNode newHead = RemoveKthFromLast.removeKthFromEnd(reverNode,2);
        LINKED.Common.print(newHead);

        newHead.next = newHead.next.next.next;
        //Cycle 2
        ListNode cycleNodePos = Cycle.findCycle(newHead);
        System.out.println(cycleNodePos.val);
    }
}
