# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # Time complexity = O(n)
        # space Complexity = O(1)
        # working on Leetcode = Yes
        # logic:  take 3 ptrs (curr, fast, prev). initialize the prev = null
        # curr = head and fast = head.next
        # fast pointer saves the LL
        # curr.next -> prev; prev->curr and curr -> fast
        if head == None or head.next == None:
            return head

        # initialize the pointers
        curr= head
        prev= None
        fast = head.next

        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next

        curr.next=prev
        return curr


l = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
a = Solution
l=a.reverseList(a, head=l)

ptr =l
while ptr != None:
    print(ptr.val)
    ptr=ptr.next

