#time complexity:0(n)
#space complexity :0(1)

#iterative

class Solution(object):
    def reverseList(self, head):
        if head == None or head.next == None:
            return head
        
        prev = None
        curr = head
        fast = head.next
        
        while fast is not None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
            
        curr.next = prev
        return curr
        """
        :type head: ListNode
        :rtype: ListNode
        """
        
#recursion 

def reverseList(self, head):
        if head == None or head.next == None:
            return head
       
        reverse = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        
        return reverse