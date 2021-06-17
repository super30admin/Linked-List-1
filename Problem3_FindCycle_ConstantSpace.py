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
# O(N): Need to iterate over entire linked list once (worst case)

#------------------
# Space Complexity: 
#------------------
# O(1): No auxiliary data structure. Just 4 temporary variables. So constant space

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  48 ms   (82.35 %ile)
# Space            :  17 MB   (94.99 %ile)



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        single_step = head
        double_step = head
        current = head
        while double_step is not None:
            intersection = None
            if double_step.next is not None:
                double_step = double_step.next.next
                single_step = single_step.next
                if single_step == double_step:
                    intersection = single_step
                    break
            else:
                return None

        if intersection is None:
            return None
        else:
            while current != intersection:
                current = current.next
                intersection = intersection.next

        return current