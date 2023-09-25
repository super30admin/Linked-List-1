# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head):
        if head ==None or head.next == None:
            return head

        prev = None
        curr = head
        fast = head.next

        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next

        curr.next = prev
        return curr
    
#TC: O(n)
#SC: O(1)