"""
https://leetcode.com/problems/copy-list-with-random-pointer/
"""
"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""


class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random


class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        if not head:
            return head
        self.hashmap = {}
        curr = head
        copynode = Node(head.val)
        copy = self.clone(copynode)
        self.hashmap[curr] = copy
        currcp = copy
        while curr:
            currcp.random = self.clone(curr.random)
            currcp.next = self.clone(curr.next)
            curr = curr.next
            currcp = currcp.next
        return copy

    def clone(self, node):
        if node is None:
            return node
        if node in self.hashmap:
            return self.hashmap[node]
        copynode = Node(node.val)
        self.hashmap[node] = copynode
        return copynode
        # return None



