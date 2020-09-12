# 19. Remove Nth Node From End of List

# Code:


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
    
        # initializing a pointer for ref
        p = head
        size = 0
        
        # Finding the length
        while p:
            p = p.next
            size+=1
        
        # Making sure we go only until we get to Total length minus the given N
        length = size - n
        
        dummy = ListNode(0)
        dummy.next = head
        
        q = dummy
        while length:
            length-=1
            q = q.next
        
        # breaking the Nth node link and relinking the nodes
        q.next = q.next.next
        
        # Returning the head
        return dummy.next

# Time Complexity: O(N)
# Space Complexity: O(1)
# Accepted on Leetcode: Yes