'''
Solution
1.  Detecting Cycle can be done using either a HashSet or using two pointers.
2.  Using a HashSet, whenever we find a node already present in HashSet, we return that node to be the starting node.
3.  Using Two Pointers (fast and slow), once these pointers meet, initialize slow to head again and move both fast and
    slow at the same speed so that they meet at the node at which the cycle starts.

Time Complexity: O(n) using HashSet and O(n) using two pointers
Space Complexity: O(n) using HashSet and O(1) using two pointers

--- Passed all testcases successfully on leetcode using both the solutions.
'''


# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class DetectCycle_Set(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # edge case
        if (head == None or head.next == None):
            return None

        # initialize a HashSet
        nodes = set()

        currNode = head

        while (currNode != None):
            # check presence in HashSet and return the node if present
            if (currNode in nodes):
                return currNode

            # otherwise add it to the HashSet
            nodes.add(currNode)
            currNode = currNode.next

        return None


class DetectCycle_TwoPointers(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # edge case check
        if (head == None or head.next == None):
            return None

        # initialize slow and fast pointers
        slowNode = head
        fastNode = head.next

        # traverse till fast pointer and slow pointer meet
        while (fastNode != None and fastNode.next != None):

            # if they meet, initialize slow pointer back to the head node
            if (slowNode == fastNode):
                slowNode = head
                fastNode = fastNode.next
                break

            slowNode = slowNode.next
            fastNode = fastNode.next.next

        # now traverse slow and fast pointers at the same speed until the end is reached or both pointers point to the same node.
        while (fastNode != None and fastNode.next != None):

            if (slowNode == fastNode):
                return slowNode

            slowNode = slowNode.next
            fastNode = fastNode.next

        return None
