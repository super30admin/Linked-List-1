# Linked list cycle - 142
# Time complexity -O(N)
#Space complexity -O(1)
# Approach - we have two pointers slow and fast. slow pointer moves 1X times and fast pointer moves 2X times. When both slow and fast pointer meets, at that time slow pointer is reset to head node. From now onwards both slow and fast pointers moves at 1X speed. At this time when both slow and fast pointer meets that is the node when cycle starts.



# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        #edge case
        if head==None or head.next==None: return None
        slow=head
        fast=head
        
        while (fast!= None and fast.next!=None):
            slow=slow.next
            fast=fast.next.next
            if(slow==fast):
                
                break
        if fast == None or  fast.next==None : 
            return None
        slow=head
        while (slow!=fast):
                slow=slow.next
                fast=fast.next
        return slow
        