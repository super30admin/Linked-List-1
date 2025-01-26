# 1. Iterative: 3 pointer - make current previous and update all three pointers with 1 step. After parsing link the last current pointer to prev and return current pointer
# 2. Recursive: Recursively call towards the end and then head.next.next = head and head.next = None reverses it
# TC: O(N)
# SC: O(1)
# Yes this worked in leetcode

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        reversedList = self.reverseList(head.next)
        head.next.next = head
        head.next = None

        return reversedList



        # prev = None
        # curr = head
        # fast = curr.next
        # while fast:
        #     curr.next = prev
        #     prev = curr
        #     curr = fast
        #     fast = fast.next
        # curr.next = prev
        # return curr
