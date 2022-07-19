"""
Runtime Complexity:
O(n) - because we traverse all the nodes using slow and fast pointers.
Space Complexity:
O(1) - no extra space created to compute the solution.
Yes, the code worked on leetcode.
The idea behind the algorithm is to increment fast and count until count<=n. When fast is not null increment both slow and fast. Slow's next should
point to next.next inorder to unlink the next of slow. Then we return dummy.next which returns the desired list.
"""
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        
        while count<=n:
            count+=1
            fast = fast.next
            
        while fast!=None:
            slow = slow.next
            fast = fast.next
        
        slow.next= slow.next.next
        
        return dummy.next
        
        