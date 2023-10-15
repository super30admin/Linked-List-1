'''
1. Maintain a slow pointer and fast pointer. Move slow pointer by 1 step and fast pointer by 2 steps. If they meet, there is a cycle. Else return None
2. If there is a cycle, distance need to be traveled from head to start of cycle = distance where slow and fast meet to start of cycle. 
3. Reuse fast pointer and move it to head. Now move both pointers by 1 step till they meet. Return the node where they meet as it is the start of cycle.

TC: O(n)
SC: O(1)
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head == None:
            return head

        fast = head
        slow = head
        hasCycle = False
        
        while fast!=None and fast.next!=None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                hasCycle = True
                break

        if not hasCycle:
            return None       
    
        fast = head    
        while fast != slow:
            slow = slow.next
            fast = fast.next
        return fast
            
        