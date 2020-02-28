'''
Iterative:
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation : Reverse the pointers while passing through the linkedlist 1->2->3->4, 4<-3<-2<-1 use prev and curr pointer
prev reverses the index and curr moves to next element
'''


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        curr = head
        prev = None
        while curr != None:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        return prev