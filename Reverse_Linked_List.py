# Time Complexity :O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head is None:
            return None
        temp = head
        temp1 = head.next
        temp.next = None
        n = None
        while temp1:
            n = temp1.next
            temp1.next = temp
            temp = temp1
            temp1 = n
        return temp