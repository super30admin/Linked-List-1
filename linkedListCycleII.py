# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        """
        Find cycle by using tortoise/hare principle.. at the first intersection then there is a cycle
        """
        slow = head
        fast = head
        has_Cycle = False
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                has_Cycle = True
                break
        
        if has_Cycle == False:
            return None
        
        #find the part of the cycle where the two pointer move at the same speed..
        #once they intersect return fast
        slow = head
        
        while slow != fast:
            slow = slow.next 
            fast = fast.next 
            
        return fast