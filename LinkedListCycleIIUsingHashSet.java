// Time Complexity : O(n), where n is the number of nodes in the linked list
// Space Complexity : O(n), due to storing nodes in the HashSet
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// The approach uses a HashSet to store each node as it is visited.
// As we traverse the list, we check if a node is already in the set.
// If we encounter a node already in the set, that means we’ve detected a cycle, and that node is the starting point of the cycle.
// If we reach the end of the list (null), there is no cycle.

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
        HashSet<ListNode> set = new HashSet<>();
        ListNode ptr = head;
        while(ptr != null){
            if(set.contains(ptr)){
                return ptr;
            }
            set.add(ptr);
            ptr = ptr.next;
        }
        return null;
    }
}