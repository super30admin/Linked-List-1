# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# Your code here along with comments explaining your approach
# move slow by one and fast by two, if there isa cycle they both meet at a point
# before fast becomes null
#if they dont meet return none,else move one of the pointer to head and now move
#both by one each time so they meet at the node where cycle begins
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        flag=0
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow==fast:
                flag=1
                break
        if flag!=1:
            return None
        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow