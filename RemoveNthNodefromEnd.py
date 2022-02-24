# TC : O(n)
# SC : O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummyHead = ListNode()
        dummyHead.next = head

        fast = dummyHead
        i = 1
        while(i<=n):
            fast = fast.next
            i += 1
        
        slow = dummyHead
        
        while(fast.next!=None):
            slow = slow.next
            fast = fast.next
            
        slow.next = slow.next.next
        
        return dummyHead.next
