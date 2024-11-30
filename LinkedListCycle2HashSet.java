/*
Time Complexity : O(n), We have to visit all nodes once.
Space Complexity : O(n), We have to store all nodes in the hash set.
Did this code successfully run on Leetcode: Yes
*/

import java.util.HashSet;

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
public class LinkedListCycle2HashSet {
    public ListNode detectCycle(ListNode head)
    {
        HashSet<ListNode> nodeVisited = new HashSet<>();

        ListNode node = head;

        while(node != null)
        {
            //if the node is visited, there is a cyclee
            if(nodeVisited.contains(node)) {
                return node;
            }
            else {
                //not visited then add in hashset and move to next node
                nodeVisited.add(node);
                node = node.next;
            }
        }

        return null; //no cycle
    }
}