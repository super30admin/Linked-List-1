# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes

# Your code here along with comments explaining your approach

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None
        reverseList = None
        temp = head
        while temp is not None:
            reverseList = ListNode(temp.val,reverseList) 
            temp = temp.next
        return reverseList