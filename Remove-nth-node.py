# The solution below calculates the length of the linked list.
# If we want to remove the 2 element from the last. Then from the front it is
# lenght -2 + 1 ---> this is here where our cur pointer will be stationed and the prev would be
# one node behind. Then we just repostion the pointer
# It takes O(n) time and O(1) space complexity. However it is a two pass solution.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:

    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        length = 0
        cur = head
        while cur:
            length += 1
            cur = cur.next
        if length == 0:
            return None
        if length == n:
            return head.next

        prev, cur, i = head, head, 1
        while i != length - n +1:
            i += 1
            prev = cur
            cur = cur.next
        prev.next = cur.next
        cur = None
        return head


