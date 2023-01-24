# 19. Remove Nth Node From End of List
 
# // Time Complexity :  O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# creating a window of n elements in the start and traversing to the end
# start point of the window will be at nth element from end

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head.next == None: return None
       
        dummy = ListNode()
        dummy.next = head
        slow = dummy
        fast = dummy
        for i in range(n):
            fast = fast.next
        while(fast):
            if fast.next == None:
                if slow.next == head: # if removing the first element
                    head = slow.next.next
                slow.next = slow.next.next
            fast = fast.next
            slow = slow.next
        return head