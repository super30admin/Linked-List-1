# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes

# Your code here along with comments explaining your approach

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummyHead = ListNode()
        dummyHead.next = head
        
        fast = dummyHead
        for i in range(1,n+1):
            fast = fast.next
            
        slow = dummyHead
        while fast.next != None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        
        return dummyHead.next