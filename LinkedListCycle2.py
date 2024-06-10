# Time Complexity :
# Space Complexity :
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return None
        slow, fast = head, head
        hasCycle = False
        
        # First part: Determine if there is a cycle
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                hasCycle = True
                break
        
        if not hasCycle:
            return None
        
        # Second part: Find the entry point of the cycle
        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        
        return slow

# Helper functions to create a linked list with a cycle and to print a linked list
def create_linked_list_with_cycle(values, pos):
    if not values:
        return None
    head = ListNode(values[0])
    current = head
    cycle_node = None
    if pos == 0:
        cycle_node = head
    for i in range(1, len(values)):
        current.next = ListNode(values[i])
        current = current.next
        if i == pos:
            cycle_node = current
    if cycle_node:
        current.next = cycle_node
    return head

# Examples
solution = Solution()

# Example 1
values1 = [3, 2, 0, -4]
pos1 = 1
head1 = create_linked_list_with_cycle(values1, pos1)
cycle_node1 = solution.detectCycle(head1)
print("Example 1:")
print("Cycle starts at node with value:", cycle_node1.val if cycle_node1 else "No cycle")

# Example 2
values2 = [1, 2]
pos2 = 0
head2 = create_linked_list_with_cycle(values2, pos2)
cycle_node2 = solution.detectCycle(head2)
print("\nExample 2:")
print("Cycle starts at node with value:", cycle_node2.val if cycle_node2 else "No cycle")

# Example 3
values3 = [1]
pos3 = -1
head3 = create_linked_list_with_cycle(values3, pos3)
cycle_node3 = solution.detectCycle(head3)
print("\nExample 3:")
print("Cycle starts at node with value:", cycle_node3.val if cycle_node3 else "No cycle")
