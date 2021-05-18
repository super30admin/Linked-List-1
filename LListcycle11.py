""" Linked List Cycle II
Time Complexity - O(2n)- O(n)
Space complexity - O(1)

Approach - have to pointers slow and fast. Iterate with fast in 2x speed and slow in 1 x speed . when they meet reset any pointer to head. now iterate both at 1 x spee and when they meet it will be at the start of the cycle. 2(a+b) = a+b+b+c"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = fast =head
        flag =False
        while fast and fast.next:
            
            slow = slow.next #move slow 1x speed
            fast =fast.next.next #move 2x speed
                
            if slow==fast: #the slow and fast has met
                flag=True 
                break
                #now reset any pointer
        if flag==False: #no cycle
            return None
        else:
            fast =head
            while slow!=fast: #till they meet move the slow and fast at 1x speed. Now they will be meeting at the beginning of the cycle.
                slow=slow.next
                fast=fast.next
            return slow
                
            