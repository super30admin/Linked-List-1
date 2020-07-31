/**
Problem: Detect cycle in linked list
Did it run on LeetCode : Yes

Time Complexity : O(n)
Space Complexity: O(1)

Approach: 2 pointers
1. The slow pointer moves by 1, and the fast pointer moves by 2. 
2. If the pointers meet, it means that there's a cycle in the linkedlist.
3. To know the starting point of the cycle, we then make the start to point to the head, and while fast and slow are not equal, we move them both by 1.
4. At the end, where slow and fast are equal, we return slow, the node where the loop(cycle) starts.
*/


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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                isCycle = true;
                break;
            }
        }
        if(!isCycle) return null;
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}