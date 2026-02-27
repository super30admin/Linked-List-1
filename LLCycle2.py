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
        if not head:
            return None

        slow = head
        fast = head
        #Let us first see if there a cycle or not. We can use fast and slow pointer approach
        #for that.
        isCyclePresent = False
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                isCyclePresent = True
                break
            
        if not isCyclePresent:
            return None

        #Now that we know that there is a cycle and fast is already in the cyclic loop,
        #we can have a slow pointer start from head. While slow is not equal to fast, keep
        #on incrementing both. They will collide at the cyclic point.

        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow

    #TC : O(n)
    #SC : O(1)