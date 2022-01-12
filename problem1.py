#Time Complexity O(N)
#Time Complexity O(1) constant
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #st = list()
        temp = head
        prev = None
        while temp != None:
            nexttemp = temp.next
            temp.next = prev
            prev = temp
            temp = nexttemp
            
        
        return prev
        
        # for x in range(len(st)):
        #     prev= ListNode(st[x])
        #     prev = prev.next
        # return prev
            
            
            
        
        
        
        
        
            
        
        
