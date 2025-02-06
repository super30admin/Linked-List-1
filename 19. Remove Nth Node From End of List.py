#Space: O(1)
#time: O(n)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None:
            return
        
        dummy= ListNode(-1)
        dummy.next= head
        slow= dummy
        fast= dummy

        for i in range(n):
            fast= fast.next
        
        

        while fast.next != None:
            slow= slow.next
            fast= fast.next

        
        
        slow.next = slow.next.next

        return dummy.next
        
