# Created by Aashish Adhikari at 10:04 AM 1/19/2021

'''
Time Complexity:
O(l)

Space Complexity:
O(1)
'''


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


        dummy = ListNode(None, head)

        slow = dummy.next
        fast = dummy.next
        flag = False

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                flag = True
                break

        if flag is False:
            return None


        slow = dummy.next


        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow
