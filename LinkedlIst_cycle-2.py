using hashmap:
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
we used hashmap to store the elements of the linked list and when traversing if we find a duplicate element then we return the head indiating there is a cycle.else if traversal touches the end of list then there is no cycle.

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
        d=dict()
        while head!=None:
            if head not in d:
                d[head]=1
            else:
                return head
            head=head.next
        return None
        
without extra space:
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
we use fast and slow pointers to solve this problem.we followed the hare and tortoise analogy as in we made the fast to traverse by 2 times compared to slow so that they will at a point for sure at some traversal.then from there make slow reset to head and traverse both slow and fast by one step at a time till they reach the intersection point.

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
        if head==None or head.next==None:
            return None
        slow=head
        fast=head
        while (fast!=None and fast.next!=None):
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                break
        slow=head
        while (slow!=fast):
            if fast==None or slow==None:
                return None
            slow=slow.next
            fast=fast.next
        return fast
        