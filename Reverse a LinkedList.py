# I have given two solutions both with time complexity O(n) but space complexity differs 1st solution has space compexity O(n) and second has O(1).
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        stack = []
        while (head is not None):
            stack.append(head.val)
            head = head.next

        if (len(stack) != 0):
            head = ListNode(stack.pop())
            temp = head
        while (len(stack) != 0):
            temp.next = ListNode(stack.pop())
            temp = temp.next
        return head

        # curr = head
        # prev = None
        # while(curr != None):
        #     next1 = curr.next
        #     curr.next = prev
        #     prev = curr
        #     curr = next1
        # return prev
