# leetcode accepted
# time complexity: o(n)
# no doubts
# explianation: you take two more pointer saying prev and next. prev will be in fron of the current pointer and next will be next of curr. so while traversing the curr of next will be pointing to next


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:

    def reverseList(self, head: ListNode) -> ListNode:
        prev = None
        curr = head
        n = 0
        while (curr != None):
            n = curr.next
            curr.next = prev
            prev = curr
            curr = n
        head = prev
        return head
