class Solution:
    def removeNthFromEnd(self, head, n):
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        c = 0
        while c <= n:
            fast = fast.next
            c += 1

        while fast != None:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next

        return dummy.next
    
#TC : O(n)
#SC : O(n)