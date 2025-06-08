# Time Complexity: O(n)
# Spcae Complexity: O(1) 
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # if head == None or head.next == None:
        #     return head
        # reversedHead: ListNode = reverseList(head.next)
        # print(head.val) # 4, 3, 2, 1
        # head.next.next = head
        # head.next = None
        # return reversedHead
        prev: ListNode = None
        curr: ListNode = head
        while curr != None:
            temp: ListNode = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev
        # return helper(head, None)


    # def helper(self, curr, prev):
    #     # Base
    #     if curr == None:
    #         return prev
    #     temp = curr.next
    #     curr.next = prev
    #     prev = curr
    #     curr = temp
    #     return self.helper(curr, prev)