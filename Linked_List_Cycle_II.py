#  Time Complexity : O(n) 
#  Space Complexity : O(1) 
#  Did this code successfully run on Leetcode : Yes
#  Three line explanation of solution in plain english : This code detects if a cycle exists in a linked list using the two-pointer technique: slow moves one step, while fast moves two steps. If they meet, a cycle exists, and a second phase starts where head and slow both move one step at a time until they meet again — that node is the start of the cycle. If fast reaches None, the list has no cycle, and the function returns None.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head

        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                while head != slow:
                    head = head.next
                    slow = slow.next
        
                return slow
        
        return None
        
       