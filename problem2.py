#Time Complexity :O(n)
#Space Complexity :O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if(head==None):
            return None
        dummy = ListNode()
        dummy.next = head
        prev = dummy 
        curr = head
        fast = head
        for i in range(n):
            fast= fast.next
        while(fast!=None):
            prev = curr
            curr= curr.next
            fast = fast.next
        prev.next = curr.next
        return dummy.next