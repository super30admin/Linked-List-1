# Time COmplexity: O(n)
# Space COmplexity: O(1)
# Approach to solve this problem:  

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head             # Declaring head as slow and fast pointer
        fast = head
        
        while fast and fast.next:   # termination state 
            slow = slow.next        # move slow by 1
            fast = fast.next.next   # move fast by 2 to check the present cycle
            if fast == slow:
                break
        else:
            return None
            
        pointer = head              # One more pointer on head and start by one
        while pointer != slow:      # When both pointer meet that is node 
            pointer = pointer.next
            slow = slow.next
            
        return pointer
        