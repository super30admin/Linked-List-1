# accepted on leetcode
# time - O(N), space - O(1)
# 2 pointer approach, use slow and fast pointers , and maintain the distance of n units in between 2 pointers
# once the the fast pointers hits None node , exit loop and change the pointer and returns the linked list.
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        # edge case
        if head is None:
            return None
        dummy = ListNode(0) # initialize a dummy pointer as first element in the list.
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        # To move the fast to initial position of n length between slow and fast
        while count <= n:
            # print(count)
            fast = fast.next
            count += 1
        # iterate until fast is not None
        while fast != None:
            slow = slow.next
            fast = fast.next
        # change the pointer and return the list
        slow.next = slow.next.next
        return dummy.next