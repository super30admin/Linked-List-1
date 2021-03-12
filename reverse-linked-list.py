#Time complexity: O(n) where n is the number of elements
#Space complexity: O(1) using constant space
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        #assign the pointers
        #current pointing to head and previous pointing to null before head
        curr = head
        prev = None
        while (curr != None):
            #store before change
            #store next node
            nxt = curr.next
            #make head node point to null (reversal)
            curr.next = prev
            #make prev point to the curr node
            prev = curr
            #move curr to next node
            curr = nxt
        
        return prev
