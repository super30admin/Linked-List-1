#Time Complexity: O(n)
#Space Complexity: O(1)
#Works on leetcode: yes 
#Approach: We use 2 pointer - fast and slow. Nth from end means (len(linkedlist) - N) from start. So first we move fast pointer
# by N steps. Then we move fast and slow pointer simultaneously until fast reaches the end. That way slow becomes the node
# to be deleted. 
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        f = s = head
        for _ in range(n):
            f = f.next
        if not f:
            return head.next
        while f.next:
            f = f.next
            s = s.next
        s.next = s.next.next
        return head