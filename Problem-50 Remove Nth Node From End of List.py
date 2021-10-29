# 19. Remove Nth Node From End of List
# https://leetcode.com/problems/remove-nth-node-from-end-of-list/

# Time Complexity: O(n)
# Space Complexiety: O(1)

# Logic: Use two pointers. The two pointers should be n distance apart. Then iterate the LL. 
# When the second pointer reachs the last node, the first pointer will be n units behind. 
# This is the location where we have to delete the node.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head, n):
        if head.next == None:
            return head.next
        
        cur = head
        end = head
        
        for i in range(n):
            end = end.next
        
        if end == None:
            head = head.next
            return head
        
        while end.next:
            cur = cur.next
            end = end.next
        
        cur.next = cur.next.next
        
        return head