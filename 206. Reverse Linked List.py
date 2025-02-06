#Time: O(n)
#Space: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:  
            return None
        prev = None
        curr = head
        fast= curr.next
        while(fast != None):
            temp = curr
            curr.next = prev
            curr= fast
            fast= fast.next
            prev= temp
        curr.next= prev
        return curr
