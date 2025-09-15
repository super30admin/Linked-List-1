# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    # tc : O(n) 
    # sc : O(1)
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        #Floyds algorithm 
        # moving slow pointer one step and fast pointer two steps, if there is a cycle they meet at some point in the looop if not then there is no cycle
        
        if head is None: # edge case handling
            return None 

        slow = fast = head
        cycle = False

        while fast.next is not None and fast.next.next is not None:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                cycle = True
                break

        if not cycle: # not cycle return none
            return None 

        # if cycle exists reset one of the pointer 
        slow = head # move slow and fast exactly until they meet which gives us the meeting point 

        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow 



        