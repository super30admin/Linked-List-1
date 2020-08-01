#Time Complexity : O(N)
#Space Complexity: O(1)
#Yes it ran on leetcode

class Solution(object):
    def removeNthFromEnd(self, head, n):
        dummy = ListNode(0)
        slow = dummy
        fast = dummy

        dummy.next = head
        count = 0

        while count < n:
            fast = fast.next
            count += 1

        while fast.next != None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next

        return dummy.next