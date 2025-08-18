# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        flag = False
        while fast!= None and fast.next!= None:
            slow = slow.next
            fast = fast.next.next
            if fast == slow:
                flag = True
                break
        if flag == False:
            return None
        slow = head
        while slow!=fast:
            slow = slow.next
            fast = fast.next
        return fast


        
        