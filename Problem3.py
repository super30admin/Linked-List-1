#Linked List Cycle II

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Time -> On
# Space -> O1
# Logic -> Take 2 pointers, slow and fast, fast is of double speed. If they meeet, means cycle else No cycle
# if cycle move fast to begining now move at same speed they'll meet at the junction


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head

        isCyclic = False
        while fast != None and fast.next!=None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                isCyclic = True
                break

        if not isCyclic:
            return None
        
        
        fast = head
        while fast != slow:
            slow=slow.next
            fast=fast.next

        return fast