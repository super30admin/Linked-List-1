# Time Complexity : O(n) 
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
class Node:
    def __init__(self,x):
        self.val = x 
        self.next = None 

class Solution:
    def removeNthFromEnd(self,head,k):
        if not head:
            return head 
        count = 0 
        dummy = Node(0)
        dummy.next = head
        slow = dummy 
        fast = dummy 
        while count <= k:
            count += 1 
            fast = fast.next 
        while fast:
            slow = slow.next 
            fast = fast.next 
        slow.next = slow.next.next 
        return dummy.next
        

if __name__ == "__main__":
    s = Solution()
    n = Node(1)
    n.next = Node(2)
    n.next.next = Node(3)
    n.next.next.next = Node(4)
    n.next.next.next.next = Node(5)
    node = s.removeNthFromEnd(n,2)
    s = []
    while node:
        s.append(node.val)
        node = node.next 
    print(s)