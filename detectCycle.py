# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Time complexity - O(K+N) -O(N)
#Space complexity - O(1)
# Approach - Create two pointers fast and slow. Slow pointer moves 1X speed and fast pointer moves 2X speed. 
# When both slow and fast pointer meet, it means cycle id detected. Move slow to the head.
# Now, move both slow and fast pointers at 1X speed. When they meet, it is the node where cycle starts.


class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        #Edge case
        if head==None or head.next==None:
            return None
        slow=head
        fast=head
        while (fast!= None and fast.next!=None):
            slow=slow.next
            fast=fast.next.next
            if(slow==fast):
                break
        if fast == None or  fast.next == None:
            return None
        slow=head
        while (slow!=fast):
            slow=slow.next
            fast=fast.next
        return slow