# Time Complexity
# O(N)
# Space Complexity
# O(1)

# Approach :

# Use fast and slow pointer
# here since duplicate elements can be present, we compare node locations rather than just values
# move fast as twice as slow pointer
# when fast and slow meet for the first time, reset either one of them to the head of the list
# keep moving both of them one element at a time till they meet the same location
# once met return that location

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        slow = head
        fast = head
        hasCycle = False

        if not head:
            return None
        count = 0
        while fast.next != None and fast.next.next != None:

            slow = slow.next
            fast = fast.next.next
            count = count+1

            if fast == slow:
                hasCycle = True
                break

        if hasCycle == True:
            fast = head
            while fast != slow:
                slow = slow.next
                fast = fast.next
            return fast
