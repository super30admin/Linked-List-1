'''
Iterative:
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation : Reverse the pointers while passing through the linkedlist 1->2->3->4, 4<-3<-2<-1 use prev and curr pointer
prev reverses the index and curr moves to next element.

Recursive:
Time Complexity: O(n)
Space Complexity: O(n)
Did this code successfully run on Leetcode : Yes
'''


class Solution:
    def iterativeList(self, head: ListNode) -> ListNode:
        if head == None:
            return None
        curr = head
        prev = None

        while curr != None:
            next1 = curr.next
            curr.next = prev
            prev = curr
            curr = next1

        return prev

    def reverseList(self, head: ListNode) -> ListNode:
        if head == None or head.next == None:
            return head

        R = self.reverseList(head.next)
        head.next.next = head
        head.next = None

        return R
