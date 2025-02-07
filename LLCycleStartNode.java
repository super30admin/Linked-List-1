// Approach: Maintain 2 pointers, slow and fast, both initially pointing to head. Move slow pointer one step at a time and fast pointer two
// steps at a time while fast doesn't reach the end of the list. If at any point they meet, it indicates the presence of a cycle in the list.
// Once a cycle is detected, reset the slow pointer to head and move both pointers one step at a time until they meet again. The meeting
// point is the starting node of the cycle.
// Time Complexity: O(n) where n - node count
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// https://leetcode.com/problems/linked-list-cycle-ii/description/
// https://www.geeksforgeeks.org/find-first-node-of-loop-in-a-linked-list/
// https://www.geeksforgeeks.org/how-does-floyds-slow-and-fast-pointers-approach-work/

import java.util.Set;
import java.util.HashSet;

public class LLCycleStartNode {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int v) {
            val = v;
        }

        @Override
        public String toString() {
            return String.valueOf(val); // or Integer.toString(val);
        }
    }

    ListNode detectCycleUsingHashSet(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while (head != null) {
            if (!set.add(head)) {
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }

    ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LLCycleStartNode llcsn = new LLCycleStartNode();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        System.out.println("Start node of the loop/cycle is: " + llcsn.detectCycle(head));
    }
}