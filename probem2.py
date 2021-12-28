# Time Complexity : O(n)
# Space Complexity : 0(1)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach

# using Dummy Node
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None :
            return head
        dummy = ListNode()
        dummy.next = head
        count = 0
        slow = dummy
        fast = dummy
        while count<=n:
            fast = fast.next
            count+=1
        while fast != None:
            fast= fast.next
            slow=slow.next
        slow.next = slow.next.next
        return dummy.next
        
        