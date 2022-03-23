#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : YES
#Any problem you faced while coding this : NO

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head
        first = head
        count = 0
        while first:
            first = first.next
            count += 1
        
        first = dummy
        while first:
            if count == n:
                first.next = first.next.next
            first = first.next
            count -=1
                    
                
        return dummy.next
            