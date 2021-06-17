'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''
# 19. Remove Nth Node From End of List
# Given the head of a linked list, remove the nth node
# from the end of the list and return its head.

#-----------------
# Time Complexity: 
#-----------------
# O(N): Need to iterate over entire linked list once

#------------------
# Space Complexity: 
#------------------
# O(1): Constant extra space, for three temporary nodes. 

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  20 ms   (99.77 %ile)
# Space            :  14.3 MB (14.05 %ile)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Idea is to use prev_node to store previous node during iteration
# Use current node which will point to the node to be removed at the end of iter
# Use last node which will first move n_places while current stays at head
# Iterate until last node is empty. In effect, curr_node will hold the element
# to be removed by the time last node reaches the end of LL (becomes null)
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        # Base case. Return None if LL had only 1 element and we removed it
        if n == 1 and head.next is None:
            return None
        else:
            prev_node = None # Stores previous node - In the beginning, null
            curr_node = head # Start current node at the head
            last_node = head # Use this node to iterate over n elements first
            
            for i in range(n):
                last_node = last_node.next

            while last_node is not None:
                prev_node = curr_node
                curr_node = curr_node.next
                last_node = last_node.next
            

            # If prev_node is null, that means current is still at head, i.e.,
            # n == LL.size()
            # Which means we want to remove the head.
            if prev_node is None:
                head = head.next
            
            else:
                prev_node.next = curr_node.next
            
            
            return head