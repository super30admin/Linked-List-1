public class LinkedListCycle
{
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */

//Time Complexity: O(n)
//Space Complexity: O(1)
// Approach: This can be done using a hashset and checking before inserting the node if it already exists and return the existing node for check
// But this can be optimized if we use slow and fast pointer, with slow pointer moving 1 jump and fast pointer moving 2 jumps
// The head of the cycle is at equidistant with the head of the linkedlist and the point where both slow and fast pointers meet, for this reason we need
// to move the fast pointer to head and go one by one to reach the cycle head.
    public class Solution {
        public ListNode detectCycle(ListNode head)
        {
            ListNode slow = head;
            ListNode fast = head;
            boolean hasCycle = false;

            while (fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next; //Jump two times ahead

                if (slow == fast) // If there is a cycle break out of the loop when slow meets fast
                {
                    hasCycle = true;
                    break;
                }
            }

            if(!hasCycle) return null; // When no cycle exists

            //Reset the fast to head and iterate the fast and slow pointers one node at a time until they meet second time, which gives the exact node
            //where they meet.
            fast = head;

            while(slow != fast)
            {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
}
