# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:

    # Approach: Two Pointers (Fast and Slow)
    # Use a dummy node before head, move `right` pointer n steps ahead,
    # then move both `left` and `right` until `right` reaches the end.
    # TC: O(n)
    # SC: O(1)
    def removeNthFromEnd(self, head, n):
        dummy = ListNode(0, head)
        left, right = dummy, head

        while n > 0 and right:
            right = right.next
            n -= 1

        while right:
            left = left.next
            right = right.next

        left.next = left.next.next
        return dummy.next


def create_linked_list(arr):
    head = ListNode(arr[0])
    curr = head
    for val in arr[1:]:
        curr.next = ListNode(val)
        curr = curr.next
    return head


def print_linked_list(head):
    while head:
        print(head.val, end=" -> " if head.next else "\n")
        head = head.next


if __name__ == "__main__":
    head = create_linked_list([1, 2, 3, 4, 5])
    sol = Solution()
    result = sol.removeNthFromEnd(head, 2)
    print_linked_list(result)
