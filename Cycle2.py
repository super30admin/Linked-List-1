"""

First we use two pointers moving at different speeds to check if there’s a cycle.
If they meet, we reset one to the head and walk both one step at a time.
They meet again at the node where the cycle starts.

"""
#Time Complexity:O(N)
#Space Complexity: O(1)


# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        slow = head
        fast =  head
        flag = False

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break

        if flag is False:
            return None

        slow = head

        while slow!= fast:
            slow = slow.next
            fast = fast.next
        return slow

        
        

