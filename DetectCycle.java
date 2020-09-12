/* https://leetcode.com/problems/linked-list-cycle-ii/
142. Linked List Cycle II - MEDIUM
*/

import java.util.HashSet;
public class DetectCycle {
    /*
    TC: O(n) - visit all nodes once
    SP: O(n) - worst case O(n)
    Use a HashSet to keep the Nodes. 
    If a node already exists in the Set, it has already been visited and is the cycle start.
    */
    public ListNode getCycleWithSpace(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode node = head;
        while (node != null) {
            if (set.contains(node)) {
                return node;
            } else {
                set.add(node);
            }
            node = node.next;
        }
        return null;
    }


    /* 1 -> 2 -> 3 -> 4 
                 |    |
                 6 <- 5
    */
    /*
    TC: O(n) asymptotically, will not reach O(n^2)
    SC: O(1) constant space
    Approach: use 2 pointers, slow and fast, slow moves 1 step at a time, fast moves 2 steps at a time.
    When slow reaches fast break out of the loop.
    If a=distance from head to start of cycle, b=distance from start of cycle to where fast and slow meet, 
    and c=distance from where fast & slow meet to the start of the cycle.
    When fast and slow pointers meet, slow has travelled (a + b) & fast has travelled = (a + b + c + b)
    dist travelled by fast = 2(dist travelled by slow)
    => a+b+c+b = 2(a+b)
    => a+2b+c = 2a + 2b
    => a = c
    To get start of the cycle, move slow back to head, amd advance slow and fast until they meet
    This is the start of the cycle
    */
    public ListNode getCycle(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (slow == null || fast == null || fast.next == null) {
            return null;
        }

        if (slow == fast) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        return slow;
    }

    public static void main(String args[]) {
        DetectCycle d = new DetectCycle();

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = three;
        
        ListNode cycleStart = d.getCycleWithSpace(one);
        if (cycleStart != null) {
            System.out.println(cycleStart.val);
        }

        cycleStart = d.getCycle(one);
        if (cycleStart != null) {
            System.out.println(cycleStart.val);
        }

        six.next = null;
        cycleStart = d.getCycle(one);
        if (cycleStart != null) {
            System.out.println(cycleStart.val);
        } else {
            System.out.println("No cycle");
        }
    }
}
