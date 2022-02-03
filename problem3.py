#Time Complexity :O(n)
#Space Complexity :O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if(head==None):
            return None
        final =False
        slow = head
        fast = head
        while(fast!=None and fast.next!=None):
            slow = slow.next
            fast = fast.next.next
            if(slow == fast):
                final = True
                break
        if(not final):
            return None
        slow = head
        while(slow!=fast):
            slow = slow .next
            fast = fast.next
        return slow