#Problem 142. LINKED LIST CYCLE II
# TIME COMPELXITY: O(N) where N denotes the number of nodes 
# SPACE COMPLEXITY: O(1) as we are not using any extra space we are only using pointers which takes O(1) of space


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

        if head is None:
            return None
        fast=head
        slow=head
        flag=False

        while fast.next is not None and fast.next.next is not None:
            slow=slow.next
            fast=fast.next.next

            if slow==fast:
                flag=True
                break
            
        if not flag:
            return None
        
        slow=head
        while slow!=fast:
            slow=slow.next
            fast=fast.next

        return slow