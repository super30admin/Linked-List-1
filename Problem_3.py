#
# @lc app=leetcode id=142 lang=python3
#
# [142] Linked List Cycle II
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
'''
Time Complexity - O(n). We are traversing the entire list.
Space Complexity - O(1). Additional variables being used only for traversal

This code works on leetcode.
'''
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None: #return None if list is empy
            return None
        slow = head #point the slow and fast pointer to head
        fast = head
        flag = False
        while fast.next!= None and fast.next.next != None:
            slow = slow.next
            fast = fast.next.next #move slow pointer by one node and fast pointer by 2 nodes
            if slow == fast: #if there is a cycle present fast pointer and slow pointer will definitely meet
                flag = True 
                break
        if not flag: #if we reach null in the List that means no cycle present
            return None
        fast = head  #reset the fast pointer to head
        while slow != fast:
            slow = slow.next #move both pointers by one node and they will meet at the beginning of the cycle.
            fast = fast.next
        return fast

        
# @lc code=end

