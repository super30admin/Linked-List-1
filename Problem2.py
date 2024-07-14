#I used a two-pointer technique to efficiently find and remove the nth node from the end. I start with two pointers, 'slow' and 'fast', both initially pointing to the head of the list. First, I move the 'fast' pointer n nodes ahead. If 'fast' becomes None at this point, it means we need to remove the head, so we return head.next. Otherwise, I move both pointers simultaneously until 'fast' reaches the end of the list. At this point, 'slow' will be pointing to the node just before the one we want to remove. I then adjust the 'next' pointer of the 'slow' node to skip the node to be removed.

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        slow = head
        fast = head
        for i in range(n):
            fast = fast.next

        if fast == None:
            return head.next

        while fast.next != None:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next
        return head