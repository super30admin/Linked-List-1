# Time Complextity: O(N)
# Space Complexity: O(1)
# Passed Leetcode

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    
    
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        
        tempHead = ListNode(0, head)
        p1 = tempHead
        
        p2 = tempHead
        i = 0
        j = 0
        while p2:
            
            if j - i >= n + 1:
                p1 = p1.next
                i += 1
                
            p2 = p2.next
            j += 1
            
        p1.next = p1.next.next
        
        return tempHead.next