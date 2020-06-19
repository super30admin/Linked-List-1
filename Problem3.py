"""
// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        fast = head
        slow = head
        flag = 0
        
        while fast and fast.next:
            
            slow = slow.next
            fast = fast.next.next #moves 2*slow
            
            if slow == fast: #if there is a cycle, fast and slow pointers will meet
                flag = 1
                break
            
        if flag == 1: #theres a cycle
            slow = head # place one pointer at head
            
            while slow != fast: # move one by one till both meet, they will meet at the head of cycle
                slow = slow.next 
                fast = fast.next
                
        else:
            return None
        return fast
        
        