# Time Complexity : O(N) 
# Space Complexity :    O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head==None or head.next==None:
            return None
        
        slow = head
        fast = head
        flag = False
        while(fast!=None and fast.next!=None):
            slow = slow.next
            fast = fast.next.next
            if slow==fast:
                flag = True
                break
        
        if flag==False:
            return None
        else:
            slow = head
            while(slow!=fast):
                slow = slow.next
                fast = fast.next
            
            return slow
            
        
        