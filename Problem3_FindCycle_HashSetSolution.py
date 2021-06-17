'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 142. Linked List Cycle II
# Given a linked list, return the node where the cycle begins. 
# If there is no cycle, return null.

# There is a cycle in a linked list if there is some node in the list that 
# can be reached again by continuously following the next pointer. 
# Internally, pos is used to denote the index of the node that tail's 
# next pointer is connected to. Note that pos is not passed as a parameter.

# Notice that you should not modify the linked list.

# https://leetcode.com/problems/linked-list-cycle-ii/

#-----------------
# Time Complexity: 
#-----------------
# O(N): Need to iterate over entire linked list once + 1 element (worst case)

#------------------
# Space Complexity: 
#------------------
# O(N): Need auxiliary hash set data structure storing max N elements in it. 

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  48 ms   (82.35 %ile)
# Space            :  17.5 MB (17.54 %ile)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        visited_nodes = set()
        while head is not None:
            if head not in visited_nodes:
                visited_nodes.add(head)
            else:
                break
            
            head = head.next

        return head