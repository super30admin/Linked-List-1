# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        cur = None
        while head is not None:
            tmp = head.next

            head.next = cur
            
            cur = head
   
            head = tmp
         
        return cur
    
#time = O(n)
#space = O(1)