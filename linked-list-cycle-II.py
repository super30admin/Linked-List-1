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
        # visit=set()
        # while head:
        #     if head in visit:
        #         return head
        #     visit.add(head)
        #     head=head.next
        # return None
        fast, slow = head, head

        # flag=False
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                slow2 = head
                while fast != slow2:
                    slow2 = slow2.next
                    fast = fast.next
                return slow2

        return None

    #time-o(n) saoce-O(1) or hashset-space-O(n)