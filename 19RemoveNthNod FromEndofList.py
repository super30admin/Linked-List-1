class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None: return head
        dummy = ListNode(-1)
        dummy.next = head
        count = 0
        slow = dummy
        fast = dummy
        while count <= n:
            fast =  fast.next
            count += 1
        while(fast != None):
            fast = fast.next
            slow = slow.next
            
        slow.next = slow.next.next
        return dummy.next

# T.c >O(N)
# S.C=>O(1)
# Approach => Where fast pointer always traverse double time the slow node. Here when the fast pointer next is None the slows pointer next to be removed. Here traverse fast 
# pointer must be traversed n time ahead.