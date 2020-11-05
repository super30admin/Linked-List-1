#Time Complexity : O(n) where n is number of elements in the linkedlist
#Space Complexity : O(1)

#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Keeping a slow pointer and fast pointer, which is basically moving two positons forward for fast pointer and moving one position for slow pointer. If these pointers ever overlap then that means a cycle is present, if there is cycle then we need to find the position where the cycle starts from thus, we continue moving the any one pointer (out of slow and fast) and head ahead till they meet. At this point the cycle will have started.

#Your code here along with comments explaining your approach


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head:
            return None
        fast, slow = head, head

        cycle = False
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            if slow == fast:
                cycle = True
                break
        if not cycle:
            return None
        while slow != head:
            slow = slow.next
            head = head.next

        return head
