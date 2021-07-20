# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None or head.next == None:
            return head
        fast = head.next
        curr = head
        prev = None
        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next = prev
        return curr

# Time Complexity: O(n)
# Space Complexity: O(1)


# Using recursion
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None or head.next == None:
            return head
        reversedNode = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reversedNode

# Time Complexity: O(n)
# Space Complexity: O(n) because of recursive space