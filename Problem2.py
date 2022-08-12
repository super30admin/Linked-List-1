# Time complexity : O(n)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # create a dummy node which is added at the start of the list
        dummy = ListNode(-1)
        dummy.next = head
        
        # maintaing pointers for list slow and fast
        slow = dummy
        fast = dummy
        count = 0
        
        # we traverse the fast pointer until we get the gap as n elements between slow and fast
        while count <= n:
            fast = fast.next
            count+=1
        
        # we start traversing the list using the fast pointer until it reaches the end of the list
        # at the same time, we increment the slow pointer as well which would stop one element before
        # the one which is to be removed
        while fast != None:
            slow = slow.next
            fast = fast.next
        
        # with this, we point the next of the slow to the next of next, skipping one element in between
        slow.next = slow.next.next
        
        # we return the head as dumm.next because we added dummy as temp
        return dummy.next
