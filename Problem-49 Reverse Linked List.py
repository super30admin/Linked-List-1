# 206. Reverse Linked List
# https://leetcode.com/problems/reverse-linked-list/

# Iterrative Approach
# Time Complexity: O(n)
# Space Complexiety: O(n)

# Logic: 


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head):
        if not head:
            return
        
        stack = list()
        
        ptr = head
        
        while ptr:
            stack.append(ptr.val)
            ptr = ptr.next
            
        item = stack.pop()
        new_node = ListNode(item)
        head = new_node
        ptr = head
        
        while stack:
            item = stack.pop()
            new_node = ListNode(item)
            ptr.next = new_node
            ptr = ptr.next
        return head