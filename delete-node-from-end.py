# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        sayac = 0
        temp = head
        if temp.next == None: 
            return None 
        while temp != None:
            temp = temp.next
            sayac = sayac + 1
        temp = head
        if sayac - n == 0:
            temp = head.next
            while temp != None:   
                return temp
        for num in range(sayac-n-1):           
            temp = temp.next
        temp.next = temp.next.next
        temp = head
        return temp


            
