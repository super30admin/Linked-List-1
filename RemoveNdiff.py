# Time Complexity : O(n) for each operation.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to move the pointer to n difference and then find the end of the list then remove the required pointer and link to next.

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        c=0
        dummy=ListNode(-1)
        dummy.next=head
        s=dummy
        f=dummy
        while(c<=n):
            f=f.next
            c+=1
        while(f!=None):
            s=s.next
            f=f.next
        temp=s.next
        s.next=s.next.next
        temp=None

        return dummy.next