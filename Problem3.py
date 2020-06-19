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
    def detectCycle(self,head):
        if not head:
            return head 
        slow = head 
        fast = head 
        flag = False 
        while fast and fast.next:
            fast = fast.next.next 
            slow = slow.next 
            if slow == fast:
                flag = True 
                break 
        if flag == False:
            return None 
        slow = head 
        
        while slow != fast:
            slow = slow.next 
            fast = fast.next 
        return slow 

if __name__ == "__main__":
    s = Solution()
    n = Node(3)
    head = n 
    n.next = Node(2)
    n.next.next = Node(0)
    n.next.next.next = Node(4)
    n.next.next.next = head.next
    node = s.detectCycle(n)
    print(node.val)