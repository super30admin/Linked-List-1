# Did this code successfully run on Leetcode: Yes
# Time Complexity: O(n)
# Space Complexity: O(1)
# Logic: keep 2 pointers, if 1 is at head 2nd would be at nth node. So, when 2nd would become None, 1st would point to
# the nth from last node. In order to avoid boundary case of n == length of LL, we use dummy node as start so that head
# also behaves like normal node.

# Definition for singly-linked list.
class Node:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def __init__(self):
        self.head = None

    def print_list(self):
        cur_node = self.head
        while cur_node:
            print(cur_node.val, end=" ")
            cur_node = cur_node.next

    def append(self, data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            return

        last_node = self.head
        while last_node.next:
            last_node = last_node.next
        last_node.next = new_node

    def removeNthFromEnd(self, head, n: int):
        dummy = Node(-1)
        dummy.next = head
        p = dummy
        q = dummy
        count = 0
        while q and count <= n:
            q = q.next
            count += 1
        # if not q and n + 1 != count:
        #     return None
        while q:
            q = q.next
            p = p.next
        p.next = p.next.next
        return dummy.next


llist = Solution()
llist.append(1)
llist.append(2)
# llist.append(3)
# llist.append(4)
# llist.append(5)
llist.print_list()
print()
llist.removeNthFromEnd(llist.head, 2)
llist.print_list()
