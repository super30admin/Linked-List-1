#tc: O(n)
#sc: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return head
        
        slow = head
        fast = head
        f = 0
        while(slow != fast or f == 0):
            f = 1
            if slow.next:
                slow = slow.next
            else:
                return None
            
            if fast.next:
                fast = fast.next
            else:
                return None
            
            if fast.next:
                fast = fast.next
            else:
                return None
               
        fast = head
        print(fast.val,slow.val)
        while fast != slow:
            fast = fast.next
            slow = slow.next

        return fast