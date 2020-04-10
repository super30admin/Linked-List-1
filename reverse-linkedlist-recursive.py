# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


#Gives wrong answer on leetcode - my outptut is always empty list []
#Time complexity - O(n)
#Space complexity - O(1)

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None:
            return None
        def reversehelper(curr, prev):
            if curr.next == None:
                curr.next = prev
                head = curr
                return head
            next = curr.next
            curr.next = prev
            reversehelper(next, curr)
        return reversehelper(head, None)