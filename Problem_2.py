
# 142. Linked List Cycle II

# Code:

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head:
            return None
        
        mapping = {}
        dummy = ListNode(0)
        dummy.next = head
        p1 =dummy
        p2 = head
        i = 0
        while p2 and p2 not in mapping: 
            p1 = p1.next
            p2 = p2.next
            
            mapping[p1] = i
            i+=1
        return p2


# Time Complexity: O(N)
# Space Complexity: O(N)
# Accepted on Leetcode: Yes       
