'''
Approach: Take fast and slow pointers to find the intersection point. From head and intersection point start p1 and p2 pointers, and move them to next until p1 equals p2. 

Time: O(n)
Space: O(1)

Passes all testcases in leetcode

'''


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None
        slow = head
        fast = head
        
        temp=head
        while fast.next and fast.next.next:
            prev = fast
            slow=slow.next
            fast = fast.next.next
            if(slow == fast):
                p1 = head
                p2 = slow
                while(p1!=p2):
                    p1 = p1.next
                    p2 = p2.next
                return p1
                
        else:
            return None
            
        
