# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        '''
        TC : O(N)
        SC : O(1)
        Approach : fast-slow pointer
        Use two pointers -> fast pointer jump by 2 position where as slow pointer jumps by 1 position 
        when we reach at the point when fast pointer is equal to slow pointer break the loop.
        now start one pointer from head and slow pointer togather and when both pointer reach at same position that will be the strating of the cycle.
        '''
        slow = head
        fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast: break
        
        if not fast or not fast.next:
            return None
        
        ptr = head
        while slow != ptr:
            slow = slow.next
            ptr = ptr.next
        return ptr
    
   