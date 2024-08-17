# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(n)
# Space Complexity : Average : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    '''
    - Will traverse the linked list with two pointers: current and previous
    - At each iteration, current will be linked to previous while the next
    - node will be stored for next traversal
    '''
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        # if curr != None:
        #     oncoming = curr.next
        while curr != None:
            #curr = oncoming
            oncoming = curr.next
            curr.next = prev
            prev = curr
            curr = oncoming
        head = prev
        return head