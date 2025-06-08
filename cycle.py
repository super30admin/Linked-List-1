"""
Leetcode 142 - Linked List Cycle II

Detects the node where the cycle begins in a linked list.

Methods
-------
detectCycle(head: ListNode) -> ListNode or None:
    Uses Floyd's Tortoise and Hare algorithm to detect the cycle.
    If a cycle exists, returns the node where it begins.
    If no cycle, returns None.

Time Complexity: O(n)
    n is the number of nodes in the list.

Space Complexity: O(1)
    Only two pointers are used.
"""
class ListNode:
    def __init__(self, val = 0, next = None):
        self.val = val
        self.next = next

class solution:
    def detectCycle(self, head):
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                start = head
                while start != slow:
                    start = start.next
                    slow = slow.next
                return start

# ----------- MAIN FUNCTION -----------
def createLinkedListWithCycle(values, pos):
    head = ListNode(values[0])
    current = head
    cycle_entry = None

    for i in range(1, len(values)):
        node = ListNode(values[i])
        current.next = node
        current = node
        if i == pos:
            cycle_entry = node

    if pos == 0:
        cycle_entry = head

    if cycle_entry:
        current.next = cycle_entry

    return head

if __name__ == "__main__":
    # Example 1: Cycle begins at node index 1
    vals = [3, 2, 0, -4]
    pos = 1  # cycle at node with value 2
    head = createLinkedListWithCycle(vals, pos)

    sol = solution()
    entry = sol.detectCycle(head)
    print("Cycle starts at node with value:", entry.val if entry else "No cycle")

    # Example 2: No cycle
    vals2 = [1, 2]
    pos2 = -1
    head2 = createLinkedListWithCycle(vals2, pos2)

    sol2 = solution()
    entry2 = sol2.detectCycle(head2)
    print("Cycle starts at node with value:", entry2.val if entry2 else "No cycle")