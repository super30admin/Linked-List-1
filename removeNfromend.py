'''
Complexity: 
Time: O(n)
Space: O(1)
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        # 2 pointer solution: Runner and Slower
        prev = None
        i = head
        j = head
        k=0
        while(k<n and j!=None):
            j = j.next
            k+=1
        
        while(j!=None):
            prev = i
            i = i.next
            j = j.next
        
        if(prev==None):
            head = i.next
        else:
            prev.next = i.next
        return head 
