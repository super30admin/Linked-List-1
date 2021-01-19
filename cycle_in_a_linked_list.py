# -*- coding: utf-8 -*-
"""
TC : O(N) as we have to traverse thtough the list
SC : O(1) as no extra space created
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        #Assign 2 pointers, slow and fast to the head of the Linked List
        slow = head
        fast = head
        #Flag is set to False, initially
        flag = False
        
        #raverse through the list
        while fast and fast.next:
            #iterate slow by one index
            #fast pointer by two indices
            slow = slow.next
            fast = fast.next.next
            
            #check if slow and fast are at the same index
            if slow == fast:
                #set flag to True and break out of loop
                flag = True
                break
                
        #if flag remains False, i.e. No cycle detected, return None 
        if flag is False:return None
            
        #reset slow or fast pointer to head
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        #can return either pointer as both would be poining the same index    
        return slow 