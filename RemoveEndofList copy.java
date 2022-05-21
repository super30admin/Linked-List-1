// Time Complexity : O(n) visit n nodes
// Space Complexity : O(n) hashset
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
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
        ListNode curr = head;
        Set<ListNode> set = new HashSet<ListNode>(); // value
        
        while (curr != null){
            if (!set.contains(curr)){
                set.add(curr); // marked as traversed
            }
            else{
                return curr;
            }
            curr = curr.next;
        }
        return null; // no cycle since we reached null at end
    }
}