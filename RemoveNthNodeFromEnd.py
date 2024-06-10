# Time Complexity : O(n)
# Space Complexity : O(1)
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if head is None or n == 0:
            return head
        if head.next is None and n == 1:  # Only one node
            return None
        
        dummy = ListNode(-1, head)  # Need this if the head has to be removed
        cur = dummy
        prev = dummy
        count = 0
        
        while cur is not None:
            if count <= n:
                cur = cur.next
            else:
                cur = cur.next
                prev = prev.next
            count += 1
        
        prev.next = prev.next.next
        return dummy.next  # Not head for some test cases

# Helper function to create linked lists from a list of values
def create_linked_list(values):
    if not values:
        return None
    head = ListNode(values[0])
    current = head
    for value in values[1:]:
        current.next = ListNode(value)
        current = current.next
    return head

# Helper function to convert linked list to a list of values for easy comparison
def linked_list_to_list(head):
    values = []
    current = head
    while current:
        values.append(current.val)
        current = current.next
    return values

# Example 1
values1 = [1, 2, 3, 4, 5]
head1 = create_linked_list(values1)
sol = Solution()
new_head1 = sol.removeNthFromEnd(head1, 2)
print(linked_list_to_list(new_head1))  # Output: [1, 2, 3, 5]

# Example 2
values2 = [1]
head2 = create_linked_list(values2)
new_head2 = sol.removeNthFromEnd(head2, 1)
print(linked_list_to_list(new_head2))  # Output: []

# Example 3
values3 = [1, 2]
head3 = create_linked_list(values3)
new_head3 = sol.removeNthFromEnd(head3, 1)
print(linked_list_to_list(new_head3))  # Output: [1]