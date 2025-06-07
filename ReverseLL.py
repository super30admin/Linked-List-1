# // Time Complexity : o(n) in two pointer , recursion and recursion stack
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : concept of global and local reference and the optimal solution


# // Your code here along with comments explaining your approach
# usng 2 pointer - have a prev curr keep changing the pointers and then return the changed head do the same with recursion
# use recursion property - so basically keep calling the next node until head.next is not null once null return then start manipulating the pointers and then return the global pointer

from typing import Optional, List

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# class Solution:
#     def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
#         prev ,curr=  None, head
#         def helper(prev , curr):
#             if not curr: return prev
#             temp = curr.next
#             curr.next = prev
#             prev = curr
#             curr = temp
#             return helper(prev , curr)
#         return helper(prev, curr)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# class Solution:
#     def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
#         prev ,curr=  None, head
#         while curr:
#             temp = curr.next
#             curr.next = prev
#             prev = curr
#             curr = temp
#         return prev

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        res,prev ,curr=  None, head, None
        def helper(head):
            nonlocal res
            if not head or not head.next : 
                res = head
                return
            helper(head.next) # returns the head that caused base to crash
            head.next.next = head
            head.next = None
        helper(head)
        return res

        

        

        

        