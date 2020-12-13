# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    #O(N)
    #O(1)
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return
        #start both pointers at head
        slow=head
        fast=head
        #flag variable
        flag=False
        #normal cycle identifier loop
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                #cycle found flag
                flag=True
                break
        #if no cycle>>return None
        if not flag:
            return
        #cycle found>>get start node
        else:
            #move slow to head and start traversing one step for both pointers till they are equal which is start point
            slow=head
            while slow!=fast:
                slow=slow.next
                fast=fast.next
            return slow

                    
        