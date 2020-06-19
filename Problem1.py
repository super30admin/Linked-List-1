# Time Complexity : O(n) 
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
class Node:
    def __init__(self,x):
        self.val = x 
        self.next = None 

class Solution:
    # Time = O(n) | O(1) space
    # def reverseList(self,head): 
    #     if not head :
    #         return head 
    #     prev = None 
    #     slow = head 
    #     fast = head.next 
    #     while slow.next:
    #         slow.next = prev 
    #         prev = slow 
    #         slow = fast 
    #         fast = fast.next 
    #     slow.next = prev 
    #     return slow
    
    # 2) Recursive : O(n) time | O(n) space
    def reverseList(self,head):
        if not head or not head.next:
            return head 
        newHead = self.reverseList(head.next)
        head.next.next = head 
        head.next = None 
        return newHead

if __name__ == "__main__":
    s = Solution()
    n = Node(1)
    n.next = Node(2)
    n.next.next = Node(3)
    n.next.next.next = Node(4)
    n.next.next.next.next = Node(5)
    node = s.reverseList(n)
    s = []
    while node:
        s.append(node.val)
        node = node.next 
    print(s)
        
        