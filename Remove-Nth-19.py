# Time Complexity : O(n) size of LL
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach 

class Solution(object):
    def removeNthFromEnd(self, head, n):
        # Two pointers, one for moving ahead till n and the second one for removing the element
        if head is None or head.next is None:
            return
        slow = fast = head
        
        while n > 0:
            fast = fast.next
            n = n - 1
        if not fast:
            return head.next
        while fast and fast.next != None:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next
        return head
