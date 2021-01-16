# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        #Approach: Floyd's "tortoise and hare" cycle-finding algorithm
        #Time Complexity: O(n)
        #Space Complexity: O(1)
        
        fast_pointer, slow_pointer = head, head
        
        flag = False
        while fast_pointer and fast_pointer.next:
            fast_pointer = fast_pointer.next.next
            slow_pointer = slow_pointer.next
            if slow_pointer == fast_pointer:
                flag = True
                break
            
        if not flag:
            return None
        
        fast_pointer = head
        while fast_pointer != slow_pointer:
            fast_pointer = fast_pointer.next
            slow_pointer = slow_pointer.next
            
        return fast_pointer