# Time Complexity :
# O(n) --> 2 Pass

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
# Yes

# Any problem you faced while coding this :
# No

# Your code here along with comments explaining your approach

# I have used two pointers slow and fast, intially both pointing to first node
# Then slow pointer will move by 1x speed and fast pointer will move by 2x speed
# If there is a cycle in the LL both pointers will meet at some point other wise fast will hit null
# If both pointers meet at some point we know that there is a cycle in the LL
# Now we have to find the node where cycle begins
# if keep one pointer at meeting point and one at head and then move both by 1x speed 
# They will meet at where cycle begins


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Using slow fast approach
        # TC: O(n)
        # SC: O(1)
        
        if (head == None):
            return None
        
        flag = False
        fast = head
        slow = head
        
        while (fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            
            if (fast == slow):
                flag = True
                slow = head
                break
                
        if(flag == False):
            return None
            
        if (flag == True):
            while (slow != fast):
                slow = slow.next
                fast = fast.next
            
            return slow