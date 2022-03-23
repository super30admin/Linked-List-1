/**
 * time complexity is O(n)
 * space coplexity is O(n)
 */

import java.util.HashSet;
import java.util.Set;

 class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        
        ListNode iter = head;
        
        while(iter != null) {
            ListNode node = iter;
            if(visited.contains(node)) {
                return node;
            }
            visited.add(node);
            iter = iter.next;
        }
        
        return null;
        
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}