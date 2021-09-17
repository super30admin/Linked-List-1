//Time complexity : O(n)
//Space complexity : O(n)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode node = head;
        while(node != null) {
            //if the node is already visited, return the node
            if(visited.contains(node)) {
                return node;
            }
            visited.add(node);
            node = node.next;
        }
        return null;
    }
}