'''
Linked-List-1

Problem1 (https://leetcode.com/problems/reverse-linked-list/)
'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]: # type: ignore
        if head == None:
            return None

        prev = None
        curr = head
        fast = curr.next

        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next

        curr.next = prev

        return curr        
        