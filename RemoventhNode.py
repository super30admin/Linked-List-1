# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # First find the length of the linked list
        ptr = head
        length = 0
        while ptr!= None:
            ptr = ptr.next
            length+=1
        # To handle the case when the node to be removed is the head
        if length == n:
            return head.next
        #To get the node to be deleted from beginning
        cnt = length - n
        prev = head
        for _ in range(cnt - 1):
            prev = prev.next
        
        # Remove the nth node
        prev.next = prev.next.next
        
        return head

