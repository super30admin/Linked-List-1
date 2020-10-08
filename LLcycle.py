class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head is None:
            return None
               
        intersection = self.helper(head)
        
        if intersection is None:
            return None
        
        temp1 = head
        temp2 = intersection
        while temp1!=temp2:
            temp1 = temp1.next
            temp2 = temp2.next
        return temp1
        
        
    def helper(self,head):
        first = head
        second = head
        
        while second is not None and second.next is not None:
            first = first.next
            second = second.next.next
            
            if first == second:
                return first
            
        return None
        
        
        #tc o(n)
        #sc o(1)
        #i am using floyed cycle to solve the question. if there's a cycle at some point first and second will meet. find that point and start again with pointer 1 as head ans pointer 2 as intersecting point and keep travversing until they meet. the meeting point will be the start of LL loop
