# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# Your code here along with comments explaining your approach
# start with a dummy head and move the fast pointer till there are n nodes in between
# slow and fast pointers.Now move both by one, when fast is at null, slow will be one node
# node behind required node.So set slow.next = slow.next.next and return dummy.next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]: 
        dummy = ListNode()
        dummy.next = head
        slow = dummy
        fast = dummy
        i = 0
        while i <= n:
            fast = fast.next
            i+=1
        while fast:
            prev = slow
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = temp.next
        
        return dummy.next
