'''
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.
'''
# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # null case
        if not head:
            return None
        # init slow and fast pointers, flag = false as we assume there is no loop
        slow, fast = head, head
        flag = False
        # iterate over the linked list(ll)
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            # if we detect a loop
            if slow == fast:
                flag = True
                break
        if flag:
            slow = head
            count = 0
            while slow != fast:
                slow = slow.next
                fast = fast.next
                count += 1
            return slow
        
        return None
