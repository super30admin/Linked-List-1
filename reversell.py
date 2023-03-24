# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
# Your code here along with comments explaining your approach
# traverse till the last - 1 nodes and call reverseList recursively, then in the 
# fallback calls, shift node.next.next to node, base case is if the current node is
# last node then return that node
class Solution:
    global prev
    prev = None
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        global prev
        
        if head is not None and head.next is None:
            return head
        if head is not None and head.next is not None:
            prev = self.reverseList(head.next)
            head.next.next = head
            head.next = None
        return prev
