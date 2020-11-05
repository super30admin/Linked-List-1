# Time Complexity:- O(n)
# Space Complexity:- O(n)
# Approach: Use a set to keep track of the nodes encountered so far, if we reach none befoe we encounter a collision we return None- there is no cycle
# else return the node which caused a collision.
# Note:- need to implement the fast and slow pointer approach for O(1) space
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        my_set=set()
        while(head is not None):
            if head in my_set:
                return head
            my_set.add(head)
            head=head.next
        return None