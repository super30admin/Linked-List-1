# Remove nth node
# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach
#iterate until fast reached nth node and then iterate until fast reached end of list by moving slow
#time - O(n)
#space - O(1)
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeNthFromEnd(self, head: 'ListNode', n: int) -> 'ListNode':
        temp = ListNode(-1)
        temp.next = head
        slow = temp
        fast = temp
        count = 0
        while count <= n: #iterate until fast reaches nth node
            print(count)
            fast = fast.next
            count += 1
        while fast is not None: #iterate until fast reached end of list
            slow = slow.next
            fast = fast.next
        #slow is before nth node
        node = slow.next
        slow.next = slow.next.next
        node.next = None
        return temp.next
