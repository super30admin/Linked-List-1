# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if not head or not head.next:
            return None

        slow= head
        fast= head

        while fast and fast.next:  #for odd values fast, even fast.next also
            slow= slow.next 
            fast= fast.next.next
            if slow== fast:
                break
        else:
            return None
        fast= head
        while slow!= fast:
            slow=slow.next
            fast= fast.next
            
        return slow
        #can return fast also, they both are at same pos now