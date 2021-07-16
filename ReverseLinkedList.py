# Time Complexity : O(n)
# Space Complexity : O(1)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return head 

        prev = None 
        cur = head 

        while cur:
            temp = cur.next 
            cur.next = prev 
            prev = cur 
            cur = temp 

        return prev