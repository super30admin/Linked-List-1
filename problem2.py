#Time Complexity O(N)
#Space Complexity O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        test = ListNode(0)
        test.next = head
        temp = head
        length = 0
        while temp!=None:
            length +=1 
            temp = temp.next
           
        counter = 0
        length = length-n
        temp=test
        while counter<length:
            temp = temp.next
            counter+=1
             
        temp.next = temp.next.next
        
        return test.next
        
            
            
            
            
        
