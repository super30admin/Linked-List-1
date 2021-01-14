'''
Solution
1.  To remove n-th node from the end, we use two pointers (one slow and one fast).
2.  We place fast pointer at the n-th node from the beginning and start slow slow pointer from the head and traverse
    each pointer one node at a time.
3.  Once we reach fast pointer's end, we delete slow pointer's next node.

Time Complexity: O(n) and Space Complexity: O(1)
--- Passed all test cases on Leetcode successfully.
'''

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class RemoveNthFromEnd(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        # edge case check
        if (head == None or head.next == None):
            return None

        # initialize fast pointer to head
        fastNode = head
        count = 0

        # move fast pointer to n-th node
        while (count < n):
            fastNode = fastNode.next
            count += 1

        #   one more edge case check
        if (fastNode == None):
            return head.next

        #   initialize slow pointer to head
        slowNode = head

        #   move slow and fast pointers simultaneously till fat reaches the end
        while (fastNode.next != None):
            slowNode = slowNode.next
            fastNode = fastNode.next

        #   delete slow pointer's next node
        slowNode.next = slowNode.next.next

        return head