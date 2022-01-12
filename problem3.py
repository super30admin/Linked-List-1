#Time Complexity O(N)
#Space Complexity O(N)

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        data = dict()
        counter = 0
        
        temp = head
        while temp!=None:
            if temp in data:
                return temp
            data[temp] = temp
            temp = temp.next
            counter+=1
        return None
