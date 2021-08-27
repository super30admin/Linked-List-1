# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    """
    Iterative approach
    TC - O(n)
    SC - O(1)
    """
    def approach1(self, head):
        prev, cur, fast = None, head, head.next
        while fast != None:
            cur.next = prev
            prev = cur
            cur = fast
            fast = fast.next
        cur.next = prev
        return cur

    """
    Recursive approach
    TC - O(n)
    SC - O(1)
    """
    def approach2(self, head, prev):
        if head == None:
            return prev
        temp = head.next
        head.next = prev
        return self.approach2(temp, head)

    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return head
        # return self.approach1(head)
        return self.approach2(head, None)
