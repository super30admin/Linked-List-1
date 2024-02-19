# Linked-List-1

## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
# // Time Complexity : o(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : No
# // Your code here along with comments explaining your approach
# we can approach with iterative method by using threee pointers
# prev, curr and fast - three pointers
# while curr not equal to null keep on moving all the pointers 

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #Iterative method
        prev = None
        curr = head

        while curr != None:
            fast = curr.next
            curr.next = prev
            prev = curr
            curr = fast

        return prev

# Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
# // Time Complexity : o(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : No
# // Your code here along with comments explaining your approach
# we can use two pointers approach
# keep the dummy node and count, place both the slow and fast pointers on dummy
#keep on increasing the count and move the fast pointer, once its reaches 
# then move both slow and fast pointers like sliding window until the fast reaches null.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head
        cnt = 0
        slow = dummy
        fast = dummy
        while(cnt <=n):
            fast = fast.next
            cnt += 1
        while(fast != None):
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = temp.next
        temp.next = None

        return dummy.next
        


## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

# // Time Complexity : o(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : No
# // Your code here along with comments explaining your approach
# Intialize the slow and fast pointers to head of linked list
# Move the slow one step and the fast two steps at a time until they meet or either fast or fast.next becomes null.
# The meeting point is the node where the cycle begins and return the meeting point node
# If the fast or fast.next pointer is null, it means we can return none as there is no cycle.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
         # Initialize slow and fast pointers
        slow = head
        fast = head
        flag = False
        # Move slow one step and fast two steps
        while (fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next

             # Check if the slow meets the fast
            if(slow == fast):
                flag = True
                break
         # Check if there is no cycle
        if( not flag): return None

        # Reset either tortoise or hare pointer to the head
        fast = head

         # Move both pointers one step until they meet again
        while(slow != fast):
            slow = slow.next
            fast = fast.next

         # Return the node where the cycle begins
        return slow


        
        
