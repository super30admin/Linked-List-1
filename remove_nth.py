"""
Leetcode 19 - Remove Nth Node From End of List

Removes the N-th node from the end of a singly linked list and returns the modified list.

Parameters
----------
head : ListNode
    The head of the singly linked list.
n : int
    The position from the end of the list of the node to remove.

Returns
-------
ListNode
    The head of the modified linked list.

Approach
--------
- Use a dummy node to simplify edge cases (e.g., removing the head).
- Use two pointers (`fast` and `slow`).
- Move `fast` pointer n steps ahead.
- Move both `fast` and `slow` until `fast` reaches the end.
- Delete the node after `slow`.

Time Complexity: O(L), where L is the length of the list (one pass).
Space Complexity: O(1), constant space.
"""
class ListNode:
    def __init__(self, val = 0, next = None):
        self.val = val
        self.next = next

class solution:
    def removeNthFromEnd(head, n):
        dummy = ListNode()
        dummy.next = head
        slow = fast = dummy
        for i in range(n):
            fast = fast.next
        while fast and fast.next:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next

def printList(head):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("None")

if __name__ == "__main__":
    # Example 1
    head1 = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
    n1 = 2
    print("Original List 1:")
    printList(head1)
    modified1 = solution.removeNthFromEnd(head1, n1)
    print("After removing 2nd node from end:")
    printList(modified1)

    # Example 2: Single node
    head2 = ListNode(1)
    n2 = 1
    print("\nOriginal List 2:")
    printList(head2)
    modified2 = solution.removeNthFromEnd(head2, n2)
    print("After removing 1st node from end:")
    printList(modified2)