class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        while count <= n and fast!= None:
            fast = fast.next
            count += 1
        while fast!= None:
            slow = slow.next
            fast = fast.next
            
        slow.next = slow.next.next
        
        return dummy.next

# Time Complexity: O(n)
# Space Complexity: O(1)