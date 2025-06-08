"""
Leetcode 206 - Reverse Linked List

Reverses a singly linked list.

Method
------
reverseList(head: ListNode) -> ListNode:
    Iteratively reverses the pointers of a singly linked list in-place.

Time Complexity: O(n)
    - Each node is visited exactly once.

Space Complexity: O(1)
    - No additional space used; reversal is done in-place.
"""
class ListNode:
    def __init__(self, val = 0, next = None):
        self.val = val
        self.next = next

class solution:
    def reverseList(self, head):
        prev = None
        curr = head
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev

# ---------- MAIN FUNCTION ----------
def printList(head):
    result = []
    while head:
        result.append(head.val)
        head = head.next
    print(result)

if __name__ == "__main__":
    # Create Linked List: 1 -> 2 -> 3 -> 4 -> 5
    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(3)
    head.next.next.next = ListNode(4)
    head.next.next.next.next = ListNode(5)

    sol = solution()
    reversed_head = sol.reverseList(head)
    print("Reversed Linked List:")
    printList(reversed_head)  # Expected Output: [5, 4, 3, 2, 1]