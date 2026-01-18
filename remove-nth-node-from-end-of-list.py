''' Time Complexity : O(n) 
    Space Complexity : O(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No

    Approach :  maintain slow and fast pointer, traverse the fast to keep gap of n nodes,
                when fast reach the null, slow will exactly be at one node before target node
'''
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        #dummy node to handle edge case - remove 1st element
        dummy = ListNode(-1)
        dummy.next = head

        slow, fast = dummy, dummy

        count = 0
        while count <= n:
            fast = fast.next 
            count += 1

        while fast is not None:
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None
    
        return dummy.next