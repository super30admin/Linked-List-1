#https://leetcode.com/problems/linked-list-cycle-ii/
# // Time Complexity :0(n)
# // Space Complexity : o(n)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this : general hashmap solution.
#
#
# // Your code here along with comments explaining your approach
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        visited = set()
        node = head
        while node is not None:
            if id(node) in visited:
                return node
            else:
                visited.add(id(node))
                node = node.next
            print(visited)
        return None

