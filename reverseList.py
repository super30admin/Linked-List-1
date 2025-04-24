class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:

    # Approach: Iterative
    # Traverse the list while reversing the direction of `next` pointers using two pointers: prev and curr.
    # TC: O(n)
    # SC: O(1)
    def reverseListIterative(self, head):
        prev, curr = None, head
        while curr:
            front = curr.next
            curr.next = prev
            prev = curr
            curr = front
        return prev

    # Approach: Recursive
    # Recursively reach the end of the list, then reverse the links during the backtracking phase.
    # TC: O(n)
    # SC: O(n) due to recursion stack
    def reverseListRecursive(self, head):
        if not head or not head.next:
            return head
        newHead = self.reverseListRecursive(head.next)
        head.next.next = head
        head.next = None
        return newHead


# create linked list from list
def create_linked_list(arr):
    if not arr:
        return None
    head = ListNode(arr[0])
    curr = head
    for val in arr[1:]:
        curr.next = ListNode(val)
        curr = curr.next
    return head


# print linked list
def print_linked_list(head):
    while head:
        print(head.val, end=" -> " if head.next else "\n")
        head = head.next


# Test both iterative and recursive solutions
if __name__ == "__main__":
    sol = Solution()

    # Test: Iterative
    test_list1 = create_linked_list([1, 2, 3, 4, 5])
    print("Reversed (Iterative):")
    print_linked_list(sol.reverseListIterative(test_list1))

    # Test: Recursive
    test_list2 = create_linked_list([10, 20, 30, 40])
    print("Reversed (Recursive):")
    print_linked_list(sol.reverseListRecursive(test_list2))
