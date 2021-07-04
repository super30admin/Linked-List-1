# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """

        slow = head
        fast = head
        # if not head or only one node return None
        if head==None or head.next== None:
            return None
        #loop until fast = slow or fast reach end
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                break
        # if fast reached end there is no loops
        if fast != slow :
            return None
        slow = head
        #reach the start of the loop
        #a = c
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow