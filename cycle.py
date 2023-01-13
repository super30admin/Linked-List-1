# Time Complexity :
# O(N)

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
#Yes


#We keep 2 pointers - fast and slow. Fast moves by 2 nodes at each time step and the slow pointer by 1 node. If the fast reaches null, then no cycle is detected. If the fast reaches slow, then cycle is detected.
#If fast hits slow pointer, then that point is equidistant to the cycle head from the starting of the linked list. So we move from start and intersection point, and whenever we hit the same point, that is the head of the cycle 

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        cycle = False

        if head == None:
            return head

        while (fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next

            if fast == slow :
                cycle = True
                break

        if cycle == False:
            return None
        else :
            slow = head
            while (slow != fast ):
                slow = slow.next
                fast = fast.next

        return slow

