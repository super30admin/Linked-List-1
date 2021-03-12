#Time complexity: O(n) where n s the number of nodes
#Space complexity: O(1), only using constant space
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        #create dummy node
        dummy = ListNode(-1)
        #dummy node points to head
        dummy.next = head
        
        #take two pointers pointing to dummy node
        p1 = dummy
        p2 = dummy
        
        #increament P2 till n>0 to maintain a distance of n between P1 and P2
        while (n > 0):
            p1 = p1.next
            n -=1
        
        while (p1.next != None):
            p1 = p1.next
            p2 = p2.next
            
        p2.next=p2.next.next
        
        return dummy.next
