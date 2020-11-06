# // Time Complexity : O(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach
# Using floyd algorithm


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        if head == None or head.next==None:
            return None
        
        dummy = ListNode(-1)
        dummy.next = head
        
        slow = dummy
        fast = dummy
        
        flag = False
        
        while fast != None and fast.next != None: 
            
            fast = fast.next.next
            slow = slow.next
            
            if fast == slow:
                flag = True
                break
        
        if flag == False:
            return None
        
        fast = dummy
        
        while fast != slow:
            fast = fast.next
            slow  = slow.next
            
        return fast