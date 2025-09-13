## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

# Method1: Iterative
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# We can use fast and slow pointer. Keep distance of N between them. So when fast pointer reaches the end, slow would point to the Nth node 
# from the end. Just that we need to keep track of one node before to be able to remove the Nth node. There is one case if n = length of the 
# linked list, that is n = 6, so we need our slow pointer to be one step back then node 1. we can handle it separately or we can have a 
# dummy node at the start with a not allowed value.

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        # we can have dummy node to handle case where n = len(linkedList)
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        # to create a gap of n between slow and fast pointer
        while(count <= n):
            fast = fast.next
            count += 1

        while(fast):
            slow = slow.next
            fast = fast.next

        temp = slow.next
        slow.next = slow.next.next
        temp.next = None

        return dummy.next

def printLinkedList(root):
    curr = root
    while(curr):
        print(curr.val, end=" -> ")
        curr = curr.next
    print()


print("Method1: Iterative")
node1 = ListNode(1)
node2 = ListNode(2)
node3 = ListNode(3)
node4 = ListNode(4)
node5 = ListNode(5)
head = node1
node1.next = node2
node2.next = node3
node3.next = node4
node4.next = node5

sol = Solution()
print("eg:1")
head = sol.removeNthFromEnd(head, 2)
printLinkedList(head)

sol = Solution()
print("eg:2")
head = sol.removeNthFromEnd(head, 4)
printLinkedList(head)

node6 = ListNode(6)
node7 = ListNode(7)
head = node6
node6.next = node7

sol = Solution()
print("eg:3")
head = sol.removeNthFromEnd(head, 1)
printLinkedList(head)


node8 = ListNode(8)
head = node8
sol = Solution()
print("eg:4")
head = sol.removeNthFromEnd(head, 1)
printLinkedList(head)


## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

# Method1: Recursive
# Time Complexity : O(n)
# Space Complexity : O(n) -- recursive stack space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Converted the above logic into top-down recursion. But this is less efficient than iterative solution due to extra space of recursive stack

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def __init__(self):
        self.count = 0
        # self.slow = None

    def helper(self, slow, fast, n):
        # base
        if(not fast):
            # remove the node
            temp = slow.next
            slow.next = slow.next.next
            temp.next = None
            return

        # logic
        fast = fast.next
        if(self.count > n):
            slow = slow.next
            
        self.count += 1
        self.helper(slow, fast, n)
            

    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        
        # we can have dummy node to handle case where n = len(linkedList)
        dummy = ListNode(-1)
        dummy.next = head
        self.helper(dummy, dummy, n)
        
        return dummy.next


print("Method1: Recursive")
node1 = ListNode(1)
node2 = ListNode(2)
node3 = ListNode(3)
node4 = ListNode(4)
node5 = ListNode(5)
head = node1
node1.next = node2
node2.next = node3
node3.next = node4
node4.next = node5

sol = Solution()
print("eg:1")
head = sol.removeNthFromEnd(head, 2)
printLinkedList(head)

sol = Solution()
print("eg:2")
head = sol.removeNthFromEnd(head, 4)
printLinkedList(head)

node6 = ListNode(6)
node7 = ListNode(7)
head = node6
node6.next = node7

sol = Solution()
print("eg:3")
head = sol.removeNthFromEnd(head, 1)
printLinkedList(head)


node8 = ListNode(8)
head = node8
sol = Solution()
print("eg:4")
head = sol.removeNthFromEnd(head, 1)
printLinkedList(head)