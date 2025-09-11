# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

'''
Solution 1: 
Slow and Fast pointer. Point a fast.next in a temp node. now, reverse the order between
slow and fast by pointing fast to slow. Move slow to fast and fast to temp. 
After iterating over the list, we need to take care of cycle between first two nodes.
eg. [1,2,3,4], after reversing it will be 4->3->2<=>1. point first node's next to null
Time Complexity: O(N)
Space Complexity: O(1)
'''
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return 
        slow = head
        fast = head.next
        while (fast!=None):
            temp = fast.next
            fast.next = slow 
            slow = fast 
            fast = temp
        
        head.next = None # take care of cycle formed between first two nodes while reversing

        return slow

'''
Solution 2: Recursion : Void function based
the 2nd base condition will make sure that we stop at 2nd last Node. 
head of the reversed list will be this node's next. 
    - reversed_head: global parameter. To store the head of the reversed list
    - node: parameter of recursion, one-to-one mapping, state of the node goes back when
            recursion function returns to line of code where the recursive call was made
Time Complexity: O(N) - iterating over each node in the list
Space Complexity: O(N) - recursive stack
'''
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None: # edge case [] empty list
            return None
        self.reversed_head = ListNode(-1)
        self.helper(head)
        head.next = None # take care of cycle formed between first two nodes while reversing
        return self.reversed_head

    def helper(self, node):
        # base
        if node.next == None: # edge case [1] list with only one element
            self.reversed_head = node
            return
        if node.next.next==None:
            self.reversed_head = node.next
            node.next.next = node
            return 

        # logic
        self.helper(node.next)
        node.next.next = node


'''
Solution 3: Recursion : ListNode function based
the 2nd base condition will make sure that we stop at 2nd last Node. 
head of the reversed list will be this node's next. 
    - reversed_head: global parameter. To store the head of the reversed list
    - node: parameter of recursion, one-to-one mapping, state of the node goes back when
            recursion function returns to line of code where the recursive call was made
Time Complexity: O(N) - iterating over each node in the list
Space Complexity: O(N) - recursive stack
'''
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None: # edge case [] empty list
            return None
        reversed_head = self.helper(head)
        head.next = None # take care of cycle formed between first two nodes while reversing
        return reversed_head

    def helper(self, node):
        # base
        if node.next == None: # edge case [1] list with only one element
            reversed_head = node
            return reversed_head
        if node.next.next==None:
            reversed_head = node.next
            node.next.next = node
            return reversed_head

        # logic
        reversed_node = self.helper(node.next)
        node.next.next = node
        
        return reversed_node