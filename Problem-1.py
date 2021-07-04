# Time Complexity :O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        #if last node return last node
        if not head or not head.next:
            return head
        #propagate last node
        t = self.reverseList(head.next)
        #reverse node
        head.next.next = head
        #delete its linl that looks at the node now before
        head.next = None
        #return last node
        return t


# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        previous = None
        curr = head
        while curr:
            #save next to curr
            mynext = curr.next
            #next current = previous
            curr.next = previous
            #new previous is this iterations current
            previous = curr
            #curr check next node
            curr = mynext
        #return previous
        return previous