# T.C = O(n) S.C = O(1)
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

        slow = head
        fast = head
        flag = False

        while(fast is not None and fast.next is not None):
            slow = slow.next
            fast = fast.next.next

            if(slow == fast):
                flag = True
                break

        if(flag == False):
            return None

        slow = head

        while(slow!=fast):
            slow = slow.next
            fast = fast.next

        return slow
        