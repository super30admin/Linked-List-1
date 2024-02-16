# Time Complexity O(n) n is the number of elements in linked list
# Space complexity O(n). in case of rescursion and O(1) in case of two pointers
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    reverse = ListNode()

    def reverseList(self, head: ListNode) -> ListNode:
        # prev = None
        # curr = head
        # while curr is not None:
        #     curr_next = curr.next
        #     curr.next = prev
        #     prev = curr
        #     curr = curr_next
        # return prev

        # if head == None or head.next == None:
        #     self.reverse = head
        #     return
        # else:
        #     print("head", head)
        #     self.reverseList(head.next)
        #     self.reverse.next =
        #     jump.next = None
        #     return head

        if head == None or head.next == None:  # head = 2 & 2 -> 3
            return head

        # newHead = Func(head=3) returns head = 3
        newHead = self.reverseList(head.next)
        head.next.next = head                  # head.next = 3 & 3.next = 2
        head.next = None                       # 2.next = None
        return newHead
