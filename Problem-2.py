# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        slow = head
        fast = head
        i = 1
        while fast.next:
            #Create a window as big as n
            fast = fast.next
            if i > n:
                slow = slow.next
            i+=1
        # move it till the end
        #if the head node is the one to remove move head
        if i == n:
            head = head.next
        else:
            #else delete the node n from the back
            slow.next = slow.next.next
        return head