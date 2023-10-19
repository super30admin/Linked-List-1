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
        # Time Complexity O(N)
        # Space Complexity O(N)
        res = collections.defaultdict()
        curr = head
        i = 0
        while curr:
            res[i] = curr
            i += 1
            curr = curr.next

        index_to_be_removed = len(res) - n
        if index_to_be_removed == 0: return res[0].next

        res[index_to_be_removed - 1].next = res[index_to_be_removed].next
        return head        