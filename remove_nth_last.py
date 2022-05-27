'''Approach: Iterate the linkedlist and get the length. To get position from start, subtract count-nth position from end. Iterate the linked list till position is reached. Attach the ith node to (i+2)th or make next null if pos is last. 

Time: O(n) n is size of linkedlist
Space:O(1)

Passes all testcases in leetcode

'''


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        temp = head
        count = 0
        while(temp):
            count+=1
            temp = temp.next
        
        if count == 1:
            return None
        
        pos=count-n
        if pos == 0:
            head = head.next
            return head
        temp1 = head
        for i in range(pos-1):
            temp1 = temp1.next
        
        if(temp1.next and temp1.next.next):
            temp1.next = temp1.next.next
        else:
            temp1.next = None
        
        return head
            
            
        
