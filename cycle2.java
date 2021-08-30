// Time Complexity : o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


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
        HashSet<ListNode> s = new HashSet<ListNode>();
        ListNode node = head;
        while (node != null) {
           
            if (s.contains(node))
                return node;

            s.add(node);
 
            node = node.next;
        }
 
        return null;
    }
    }
