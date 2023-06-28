// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach:
// The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. If there is a cycle in the list, the two pointers will eventually meet at the same node. If a cycle is detected, we use another pair of pointers, p1 and p2, to find the start of the cycle. The p1 pointer starts from the head of the list, and the p2 pointer starts from the meeting point of slow and fast. They both move one step at a time until they meet, which will be the start of the cycle. If there is no cycle, it returns null.

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode p1 = head;
                ListNode p2 = slow;
                while (p1 != p2) {
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode node4 = new ListNode(4);

        head.next = node2;
        node2.next = node0;
        node0.next = node4;
        node4.next = node2; // Cycle formed: 4 -> 2

        LinkedListCycle obj = new LinkedListCycle();

        ListNode cycleStartNode = obj.detectCycle(head);

        if (cycleStartNode != null) {
            System.out.println("Cycle found. The cycle starts at node with value: " + cycleStartNode.val);
        } else {
            System.out.println("No cycle found.");
        }
    }
}