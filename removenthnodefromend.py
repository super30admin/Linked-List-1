# Time Complexity : O(N) 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        if head == None:
            return None
        
        dummy = ListNode(0)
        dummy.next = head
        s  = dummy
        
        f = dummy
        i = 0
        while i < n:
            f = f.next
        
            i +=1
            
        while f.next!=None:
            
            s = s.next
            f = f.next
            
        s.next = s.next.next
        
        return dummy.next
            
        
        
        
        
        