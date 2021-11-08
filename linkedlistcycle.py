# Time Complexity :O(n) 
# Space Complexity :O(n)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this : No
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        curr=head
        print(curr)
        Set=set()
        while curr:
            if curr in Set:
                return curr
            Set.add(curr)
            curr=curr.next
        return None
    #tc: O(n)
    #sc: O(n)