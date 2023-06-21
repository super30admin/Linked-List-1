# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No
class Solution:
  def detectCycle(self, head: ListNode) -> ListNode:
    slow = head
    fast = head
    while fast and fast.next:
      slow = slow.next
      fast = fast.next.next
      if slow == fast:
        slow = head
        while slow != fast:
          slow = slow.next
          fast = fast.next
        return slow
    return None