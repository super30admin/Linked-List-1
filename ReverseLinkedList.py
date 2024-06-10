# Time Complexity : O(n)
# Space Complexity : O(1)
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None:
            return None
        prev = None
        cur = head
        while cur is not None:
            next_node = cur.next
            cur.next = prev
            prev = cur
            cur = next_node
        return prev

# Helper functions to create and print linked lists
def create_linked_list(values):
    if not values:
        return None
    head = ListNode(values[0])
    current = head
    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next
    return head

def print_linked_list(head):
    values = []
    current = head
    while current is not None:
        values.append(current.val)
        current = current.next
    print(" -> ".join(map(str, values)))

# Example 1
head1 = create_linked_list([1, 2, 3, 4, 5])
print("Original List 1:")
print_linked_list(head1)
sol = Solution()
reversed_head1 = sol.reverseList(head1)
print("Reversed List 1:")
print_linked_list(reversed_head1)

# Example 2
head2 = create_linked_list([1])
print("Original List 2:")
print_linked_list(head2)
reversed_head2 = sol.reverseList(head2)
print("Reversed List 2:")
print_linked_list(reversed_head2)

# Example 3
head3 = create_linked_list([])
print("Original List 3:")
print_linked_list(head3)
reversed_head3 = sol.reverseList(head3)
print("Reversed List 3:")
print_linked_list(reversed_head3)