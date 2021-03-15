// Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
// Time Complexity : O(n)
// Space Complexity : O(n)

public ListNode detectCycle(ListNode head) {
    Set<ListNode> visited = new HashSet<ListNode>();

    ListNode node = head;
    while (node != null) {
        if (visited.contains(node)) {
            return node;
        }
        visited.add(node);
        node = node.next;
    }

    return null;
}