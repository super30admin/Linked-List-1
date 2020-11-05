#Time Complexity : O(n) where n is number of elements in the linkedlist
#Space Complexity : O(1)

#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Put a dummy node in the front of the LinkedList to handle some cases like where the size of list is one. Now keeping 2 pointers, move one pointer let's say second pointer to "n+1" steps ahead, so we can move the first pointer ahead simultaneously with the second pointer which is "n+1" steps ahead, and as soon as the this second pointer reaches Null, that means the first pointer will n-1th node from the end. Now, simply make the first pointers next point to it's next to next, this will remove the nth node from the list.

#Your code here along with comments explaining your approach


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head:
            return head
        dummy = ListNode(0)
        dummy.next = head
        first, second = dummy, dummy

        for _ in range(n+1):
            second = second.next

        while second:
            first = first.next
            second = second.next

        first.next = first.next.next

        return dummy.next
