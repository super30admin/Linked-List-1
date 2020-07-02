# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        r = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return r


#time complexity - O(n) as every node is traversed
#space complexity - O(1) as no extra space is used

#all test cases passed