## Problem1 (https://leetcode.com/problems/reverse-linked-list/)

# Method1: Iterative Three pointer Solution
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Keep a prev and curr pointer. Keep reversing the link between nodes till curr != null while maintaining a temp node to keep track of the next node

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        prev = None
        curr = head

        while(curr):
            # store to next node
            temp = curr.next
            # to reverse the link
            curr.next = prev
            # to move to next pointer
            prev = curr
            curr = temp

        head = prev
        return head

def printLinkedList(root):
    curr = root
    while(curr):
        print(curr.val, end=" -> ")
        curr = curr.next
    print()

print("Method1: Iterative Three pointer Solution")
node3 = ListNode(3)
node2 = ListNode(2)
node0 = ListNode(0)
node_4 = ListNode(-4)
head = node3
node3.next = node2
node2.next = node0
node0.next = node_4

sol = Solution()
print("eg:1")
head = sol.reverseList(head)
printLinkedList(head)

node1 = ListNode(1)
node5 = ListNode(5)
head = node1
node1.next = node5

sol = Solution()
print("eg:2")
head = sol.reverseList(head)
printLinkedList(head)


node6 = ListNode(6)
head = node6
sol = Solution()
print("eg:3")
head = sol.reverseList(head)
printLinkedList(head)

head = None
sol = Solution()
print("eg:4")
head = sol.reverseList(head)
printLinkedList(head)

# Method2: Using Top-down Recursion
# Time Complexity : O(n)
# Space Complexity : O(n) -- storing recursive function calls
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Converted the iterative logic into recursive. Here as we go top-down we keep reversing the link. We store prev in global and pass the current node
# as input parameter of recursion

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def __init__(self):
        # self.curr = None
        self.prev = None

    def helper(self, root):
        # base case
        if(not root):
            return

        # logic
        # reverse the pointer
        # root would give me current
        temp = root.next
        root.next = self.prev
        self.prev = root
        root = temp

        # recurse
        self.helper(root)

    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        self.helper(head)
        head = self.prev
        return head

print("Method2: Using Top-down Recursion")    
node3 = ListNode(3)
node2 = ListNode(2)
node0 = ListNode(0)
node_4 = ListNode(-4)
head = node3
node3.next = node2
node2.next = node0
node0.next = node_4

sol = Solution()
print("eg:1")
head = sol.reverseList(head)
printLinkedList(head)

node1 = ListNode(1)
node5 = ListNode(5)
head = node1
node1.next = node5

sol = Solution()
print("eg:2")
head = sol.reverseList(head)
printLinkedList(head)


node6 = ListNode(6)
head = node6
sol = Solution()
print("eg:3")
head = sol.reverseList(head)
printLinkedList(head)

head = None
sol = Solution()
print("eg:4")
head = sol.reverseList(head)
printLinkedList(head)


# Method3: Using Top-down Recursion
# Time Complexity : O(n)
# Space Complexity : O(n) -- storing recursive function calls
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Converted the iterative logic into recursive. Here as we go top-down we keep reversing the link. We can pass both prev and curr node as the 
# recursion paramters. 

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):

    def helper(self, curr, prev):
        # base case
        if(not curr):
            return prev

        # logic
        # reverse the pointer
        # root would give me current
        temp = curr.next
        curr.next = prev
        prev = curr
        curr = temp

        # recurse
        return self.helper(curr, prev)

    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        return self.helper(head, None)
    

print("Method3: Using Top-down Recursion")    
node3 = ListNode(3)
node2 = ListNode(2)
node0 = ListNode(0)
node_4 = ListNode(-4)
head = node3
node3.next = node2
node2.next = node0
node0.next = node_4

sol = Solution()
print("eg:1")
head = sol.reverseList(head)
printLinkedList(head)

node1 = ListNode(1)
node5 = ListNode(5)
head = node1
node1.next = node5

sol = Solution()
print("eg:2")
head = sol.reverseList(head)
printLinkedList(head)


node6 = ListNode(6)
head = node6
sol = Solution()
print("eg:3")
head = sol.reverseList(head)
printLinkedList(head)

head = None
sol = Solution()
print("eg:4")
head = sol.reverseList(head)
printLinkedList(head)


# Method4: Using Top-down Recursion
# Time Complexity : O(n)
# Space Complexity : O(n) -- storing recursive function calls
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Logic is same as above. Just in place of node based return recursion, we can have void based recursion and store the final new head node in a 
# global variable


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def __init__(self):
        self.result = None

    def helper(self, curr, prev):
        # base case
        if(not curr):
            self.result = prev
            return

        # logic
        # reverse the pointer
        # root would give me current
        temp = curr.next
        curr.next = prev
        prev = curr
        curr = temp

        # recurse
        self.helper(curr, prev)

    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        self.helper(head, None)
        return self.result
    

print("Method4: Using Top-down Recursion")    
node3 = ListNode(3)
node2 = ListNode(2)
node0 = ListNode(0)
node_4 = ListNode(-4)
head = node3
node3.next = node2
node2.next = node0
node0.next = node_4

sol = Solution()
print("eg:1")
head = sol.reverseList(head)
printLinkedList(head)

node1 = ListNode(1)
node5 = ListNode(5)
head = node1
node1.next = node5

sol = Solution()
print("eg:2")
head = sol.reverseList(head)
printLinkedList(head)


node6 = ListNode(6)
head = node6
sol = Solution()
print("eg:3")
head = sol.reverseList(head)
printLinkedList(head)

head = None
sol = Solution()
print("eg:4")
head = sol.reverseList(head)
printLinkedList(head)


# Method5: Using bottom-up Recursion
# Time Complexity : O(n)
# Space Complexity : O(n) -- storing recursive function calls
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Here first we go to the depth of the list ie the last node. We have to stop when we reach the last node ie one step before so that when we 
# go one step back we are on the second last node this help us to reverse the last link and so on. We set our result when we reach the base case
# ie our last node because when we reverse we that would be our first node. Here we use just a single variable to reverse the linked list

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def __init__(self):
        self.result = None

    def helper(self, curr):
        # base case
        # we have to stop when we reach the last node ie one step before
        # so that when we go one step back we are on the second last node
        # this help us to reverse the last link and so on...
        if((not curr) or (not curr.next)):
            self.result = curr
            return
        
        # recurse
        self.helper(curr.next)

        # logic
        # 1 -> 2 -> 3 -> 4 -> 5
        # now we are at node before 5 say 4
        # so 4.next.next = 4
        # ie 5.next = 4 (reverse happens)
        # do 4.next = null
        curr.next.next = curr
        curr.next = None


    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        self.helper(head)
        return self.result
    

print("Method5: Using bottom-up Recursion")    
node3 = ListNode(3)
node2 = ListNode(2)
node0 = ListNode(0)
node_4 = ListNode(-4)
head = node3
node3.next = node2
node2.next = node0
node0.next = node_4

sol = Solution()
print("eg:1")
head = sol.reverseList(head)
printLinkedList(head)

node1 = ListNode(1)
node5 = ListNode(5)
head = node1
node1.next = node5

sol = Solution()
print("eg:2")
head = sol.reverseList(head)
printLinkedList(head)


node6 = ListNode(6)
head = node6
sol = Solution()
print("eg:3")
head = sol.reverseList(head)
printLinkedList(head)

head = None
sol = Solution()
print("eg:4")
head = sol.reverseList(head)
printLinkedList(head)


# Method6: Using bottom-up Recursion
# Time Complexity : O(n)
# Space Complexity : O(n) -- storing recursive function calls
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# We can use the above logic as it is. Since we are passing only one input parameter so we can do it in the main function itself. No need to create
# the helper function. At each step from the second last node, we reversing the link. Once we have got the new head, we keep returning the same head
# from every recursive call


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    # def __init__(self):
    #     self.result = None


    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        # base case
        # we have to stop when we reach the last node ie one step before
        # so that when we go one step back we are on the second last node
        # this help us to reverse the last link and so on...
        if((not head) or (not head.next)):
            return head
        
        # recurse
        # I am catching the new head here
        result = self.reverseList(head.next)

        # logic
        # 1 -> 2 -> 3 -> 4 -> 5
        # now we are at node before 5 say 4
        # so 4.next.next = 4
        # ie 5.next = 4 (reverse happens)
        # do 4.next = null
        head.next.next = head
        head.next = None
        
        # returning the new head from here
        return result
    

print("Method6: Using bottom-up Recursion")    
node3 = ListNode(3)
node2 = ListNode(2)
node0 = ListNode(0)
node_4 = ListNode(-4)
head = node3
node3.next = node2
node2.next = node0
node0.next = node_4

sol = Solution()
print("eg:1")
head = sol.reverseList(head)
printLinkedList(head)

node1 = ListNode(1)
node5 = ListNode(5)
head = node1
node1.next = node5

sol = Solution()
print("eg:2")
head = sol.reverseList(head)
printLinkedList(head)


node6 = ListNode(6)
head = node6
sol = Solution()
print("eg:3")
head = sol.reverseList(head)
printLinkedList(head)

head = None
sol = Solution()
print("eg:4")
head = sol.reverseList(head)
printLinkedList(head)