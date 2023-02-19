/*
Detect the start of cycle in a linked list
approach: take fast and slow pointers, both should meet at one point if there's a cycle. if yes, take a start pointer
at head and move fast, start single steps, where both start and fast meet is the start of the cycle.
intuition: distance from where the fast, slow met to the start of cycle and distance from head to start of cucle would be same.
time: O(n)
space: O(1)
 */
public class Problem3 {

    static ListNode detectCycle(ListNode head) {

        ListNode slow=head, start=head, fast=head;
        boolean flag = false;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) {
                flag = true;break;
            }
        }
        if(flag) {
            while(fast!=start) {
                start = start.next;
                fast = fast.next;
            }
            return start;}

        return null;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(0);
//        ListNode node4 = new ListNode(-4);
//        ListNode node5 = new ListNode(5);

//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
        detectCycle(node1);
    }
}
