# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : NO


# // Your code here along with comments explaining your approach
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """

        #Get Length
        tempHead = head
        cnt = 0
        while tempHead != None:
            tempHead = tempHead.next
            cnt += 1
        
        idx = cnt - n + 1

        tempHead = head
        while idx != 0:
            if idx == 1:
                if tempHead.next != None:
                    tempHead.next = tempHead.next.next
                else:
                    tempHead.next = None
                    break
            tempHead = tempHead.next
            idx -= 1