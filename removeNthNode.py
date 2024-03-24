# TC = O(2n)= O(n)
# SC = O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        curr = head
        length = 0
        if curr == None or curr.next == None:
            return None
        else:
            while curr.next != None:
                length += 1
                curr = curr.next
            n = length - n

            curr = head
            print(curr.val, n)
            if n < 0:
                return head.next

            while n > 0:
                curr = curr.next
                n -= 1
            temp = curr.next
            curr.next = curr.next.next
            temp.next = None

            return head
