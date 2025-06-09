""" 
Time Complexity - O(n)
Space Complexity - O(n)
Runs on leetcode - Yes
"""


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        """
        we will add a dummy node at start of the list
        we can use n to our advantage by increnmenting Right pointer twice and just move left
        we will be at the node before we need to remove
        """
        dummy = ListNode(0, head)
        left = dummy
        right = head

        while n > 0 and right:
            right = right.next
            n -=1
        
        while right:
            left = left.next
            right = right.next
        
        #delete the node
        left.next = left.next.next
        return dummy.next
