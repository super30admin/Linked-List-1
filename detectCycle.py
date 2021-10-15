'''
Time Complexity: O(n) + O(n)= o(2n) ~ O(n)
Space: O(1)
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head):
        slow = fast = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            if slow == fast:
                break
                
        if not fast or not fast.next: 
            return None
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
    