# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach 

#Iterative
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """   
        # Assign curr,prev pointers to change node
        # Assign new to move ahead
        curr = head
        prev = None
        while curr:
            new = curr.next
            curr.next = prev
            prev = curr
            curr = new
        head = prev
        return head

#Recursive
# Time Complexity : O(n)
# Space Complexity : O(n)
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # Go till the end of the LL and start reversing from there
        def reverse(p, q):
            if p != None:
                reverse(p.next, p)
                p.next = q
            else:
                self.first = q
            
        self.first = None        
        reverse(head, None)
        return self.first
