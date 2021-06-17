'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 206. Reverse Linked List
# Given the head of a singly linked list, reverse the list, 
# and return the reversed list.

# https://leetcode.com/problems/reverse-linked-list/.

#-----------------
# Time Complexity: 
#-----------------
# O(N): Need to iterate over entire linked list once

#------------------
# Space Complexity: 
#------------------
# O(1): Constant extra space, for two temporary nodes. 

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  36 ms   (68.45 %ile)
# Space            :  15.3 MB (99.23 %ile)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev_node = None
        curr_node = head
        while curr_node is not None:
            next_node = curr_node.next
            curr_node.next = prev_node
            prev_node = curr_node
            curr_node = next_node
        
        return prev_node

