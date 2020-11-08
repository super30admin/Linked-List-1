# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        if not head or not head.next:
            return None
        l = 0
        dummy = ListNode()
        dummy.next = head
        #         length=head
        #         while length:
        #             l+=1
        #             length=length.next
        #         l-=n
        #         # print(l)
        #         first=dummy
        #         while l>0:
        #             first=first.next
        #             l-=1

        #         first.next=first.next.next
        #         return dummy.next

        first = dummy
        second = dummy
        for i in range(n + 1):
            first = first.next
        while first:
            first = first.next
            second = second.next
        second.next = second.next.next
        return dummy.next



#time=o(n) space-O(1)