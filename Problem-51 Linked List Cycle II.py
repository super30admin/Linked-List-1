# 142. Linked List Cycle II
# https://leetcode.com/problems/linked-list-cycle-ii/

# Time Complexity: O(n)
# Space Complexiety: O(1)

# Logic: First identify if the given LL has a cycle or not using slow and fast pointers. 
# If there is no cycle then return None. If cycle is present then we move either of the 
# pointers to the start location and move both the pointers (both by 1 steps) until they meet. 
# They will meet at the starting of the loop.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution:
    def detectCycle(self, head):
        if head == None or head.next == None:
            return None
        
        slow = head
        fast = head
        isCycle = False
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                isCycle = True
                break
        
        if isCycle == False:
            return None
        
        slow = head
        
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow