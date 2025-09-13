## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

# Time Complexity : O(n) -- to find if cycle exists + O(n) -- find the start of cycle = O(n) 
# worst case when last node is the starting point of the cycle
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Here we used slow and fast pointer approach where we moved slow pointer by one node and fast pointer by 2 nodes. If there would be a cycle, 
# then slow and fast pointer would meet anywhere during the one complete cycle of slow. If fast or fast.next reaches null it means there is no cycle
# Once we know cycle exists, then we reset one pointer to the head and move both fast and slow as 1x speed, they would always meet at the starting
# point of the cycle. In the base case as we are moving fast by 2 steps, we need to check fast != null (happen when elements are even) and 
# fast.next != null (would happen when elements are odd)


# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        fast = head
        slow = head
        isCycle = False

        while(fast and fast.next):
            slow = slow.next
            fast = fast.next.next
            if(slow == fast):
                # there is a cycle
                isCycle = True
                break

        if(not isCycle):
            return None

        slow = head
        while(slow != fast):
            slow = slow.next
            fast = fast.next

        return slow

node3 = ListNode(3)
node2 = ListNode(2)
node0 = ListNode(0)
node_4 = ListNode(-4)
head = node3
node3.next = node2
node2.next = node0
node0.next = node_4
node_4.next = node_4
sol = Solution()
print("eg:1")
print((sol.detectCycle(head)).val)

node1 = ListNode(1)
node5 = ListNode(5)
head = node1
node1.next = node5
node5.next = node1

sol = Solution()
print("eg:2")
print(sol.detectCycle(head).val)


node6 = ListNode(6)
head = node6
sol = Solution()
print("eg:3")
print(sol.detectCycle(head))

head = None
sol = Solution()
print("eg:4")
print(sol.detectCycle(head))