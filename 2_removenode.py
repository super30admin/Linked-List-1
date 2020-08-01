# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        # time complexity = O(n)
        # space complexity = O(1)
        # working on Leetcode = Yes

        # logic: add a dummy node.
        # Take 2 pointers (slow and fast) and initialize it with head.
        # move fast by n node and keep slow fixed.
        # move slow and fast together till fast.next = null

        # add a dummy node
        dummy = ListNode()
        dummy.next = head
        head = dummy
        # initialize the poniters
        fast = head
        slow = head

        # move fast pointer n step ahead of slow
        for i in range(n):
            fast = fast.next

        # traverse the LL
        while fast.next != None:
            slow = slow.next
            fast = fast.next

        # remove the element
        slow.next = slow.next.next

        return head.next


l=ListNode(1,ListNode(2,ListNode(3,ListNode(4))))
a=Solution
a.removeNthFromEnd(a,head=l,n=1)

ptr =l
while ptr != None:
    print(ptr.val)
    ptr=ptr.next
