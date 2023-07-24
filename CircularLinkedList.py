#Time Complexity: O(n)
#Space Complexity: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow=head
        fast=head
        if head is None or head.next is None:
            return None 
        while fast and fast.next: #at end and one before end
            slow=slow.next #Moves at 1x speed
            fast=fast.next.next #Moves at 2x speed
            if fast==slow:
                fast=head
                break
        if fast is None or fast.next is None:
            return None

        while slow and slow is not fast:
            slow=slow.next
            fast=fast.next
        
        return fast

