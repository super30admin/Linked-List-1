#Time Complexity : O(n) 
# Space Complexity : O(1) as we are using only pointers
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        count = 0
        dummy = ListNode(-1)
        dummy.next = head
        fast = dummy
        slow = dummy
        while count <= n:
            count = count + 1
            fast = fast.next
        
        while fast != None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next
        