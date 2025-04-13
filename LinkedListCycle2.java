// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach - Use Floyd’s Cycle Detection (Tortoise and Hare) to detect a cycle.
//    - If a cycle is found (slow == fast), move `slow` to the head and advance both pointers one step at a time.
//    - They will meet at the starting point of the cycle.

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;   //to check if cycle is present or not

        //fast!=null for even length and fast.next!=null for odd
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {  //there is a cycle
                flag = true;
                break;
            }
        }
        if(flag == false) {  //no cycle so return null as answer
            return null;
        }


        //now we know that slow and fast have met a point and we know that head of cycle is equidistant from that point and head of list
        //so move slow to head and now move both slow and fast by one node only until they meet each other, when they meet that will be start of cycle node
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }


    public static void main(String[] args) {
        ListNode node4 = new ListNode(-4);
        ListNode node3 = new ListNode(0, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(3, node2);
        node4.next = node2; // create cycle

        LinkedListCycle2 detector = new LinkedListCycle2();
        ListNode cycleStart = detector.detectCycle(node1);

        if (cycleStart != null) {
            System.out.println("Cycle detected starting at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
