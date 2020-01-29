#Problem 1: Reverse Linked List

# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

'''
Taking 3 pointers
prev = None
curr = Head 
fast = head.next

point curr.next to prev
moving prev to curr position
moving curr to fast position
and fast to fast.next
once this is done inorder to point the last node making the curr.next point to prev
'''
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None or head.next is None:
            return head
        
        prev = None
        curr = head
        fast = head.next

        #Reversing the list
        
        while(fast!=None):
            curr.next = prev 
            prev = curr
            curr = fast
            fast = fast.next

        #reversing the last node
            
        curr.next = prev
        return curr

#####################################################################################

#Problem 2: Remove Nth Node From End of List

# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
Taking a dummy node to point towards the head
Now taking two pointers slow and fast both pointing to head initially
moving the fast pointer till the count is less than or equal to the position from where the element needs to be removed
once the fast pointer reaches the position then move the slow and fast pointer together
when fast reaches end of the list, slow would be at the position from where the element needs to be removed
make slow.next = slow.next.next and the elemnet is removed
'''

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        # adding the dummy element as the first element
        dummy = ListNode(0)
        dummy.next = head
        fast = dummy
        slow = dummy
        count = 0
        # moving the fast pointer till the nth position
        while(count<=n):
            fast = fast.next
            count+=1
        # moving the slow and fast together
        while(fast is not None):
            slow = slow.next
            fast = fast.next
        #removing the element from the nth position
        slow.next = slow.next.next
        return dummy.next
#####################################################################################

#Problem 3: Linked List Cycle II

# Time Complexity :O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

'''
Taking 2 pointers fast and slow and setting them at head
moving fast at double speed as compared to slow
if slow == fast that means that the cycle is present
Once cycle is detected, reset the slow pointer to head
move slow and fast together and where they meet that is the start point of the cycle
'''

  # Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        
        if not head:
            return None
        if head.next == None:
            return None
        
        slow = head
        fast = head
        flag = False
        
        while(fast!= None):
            
            if fast.next!=None:
                fast = fast.next.next # moving fast with twice speed
            else:
                fast = fast.next
            slow = slow.next # moving slow normally
            if(slow == fast): 
                flag = True # cycle detected
                break
        if flag == False:
            return None
        
        slow = head # resetting the slow pointer and moving both pointer one by one
        while(slow!=fast):
            slow = slow.next
            fast = fast.next
        return slow      # returning the slow pointer
