# coding=utf-8
'''
Iterative:
Time Complexity: O(L) //Length of list
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation : add an auxiliary "dummy" node, which points to the list head. The "dummy" node is used to simplify
some corner cases such as a list with only one node, or  removing the head of the list. On the first pass, we find the
list length LL. Then we set a pointer to the dummy node and start to move it through the list till it comes to the
(L - n)(L−n) th node.
We relink next pointer of the (L - n)(L−n) th node to the (L - n + 2)(L−n+2) th node and we are done.
'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(-99999)
        dummy.next = head
        temp = head
        count = 0
        if temp.next == None:
            return None

        while temp != None:
            count = count + 1
            temp = temp.next

        temp = dummy
        curr = 0
        length = count - n

        while length > 0:
            length -= 1
            temp = temp.next

        temp.next = temp.next.next

        return dummy.next