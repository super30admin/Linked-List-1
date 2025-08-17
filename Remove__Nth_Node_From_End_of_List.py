#  Time Complexity : O(n) 
#  Space Complexity : O(1) 
#  Did this code successfully run on Leetcode : Yes
#  Three line explanation of solution in plain english : This code removes the n-th node from the end of a singly linked list using the two-pointer technique. It advances the fast pointer n+1 steps ahead of slow, then moves both together until fast reaches the end, so that slow lands right before the node to delete. Finally, it skips over that node by adjusting pointers (slow.next = slow.next.next) and returns the updated list starting from dummy.next.

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
        
        while fast != None:
            fast = fast.next
            slow = slow.next
        
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None

        return dummy.next
