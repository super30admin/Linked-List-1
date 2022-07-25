# Time Complexity : O(N)  //Where n is the size of the list we are iterating
#  Space Complexity : O(1)  //We are not using any extra space
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        #Base case
        if not head:
            return None
        #Declare a fast and slow variable to detect cycle
        slow = head
        fast = head
        
        hasCycle = False
        #Traverse the slow and fast at different speed
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                hasCycle = True
                break
        
        if not hasCycle:
            return None
        #Again reset the pointer and move it at same speed
        slow = head
        while fast != slow:
            slow = slow.next
            fast = fast.next
            
        return fast