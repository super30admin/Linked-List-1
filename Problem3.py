# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

#used map to keep track
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head == None:
            return None
        a = {}
        node = head
        while node !=None:
            if node not in a:
                a[node] = True
            else:
                return node
            node = node.next
        return None
            
            