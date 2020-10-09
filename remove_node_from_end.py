class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(0)
        dummy.next = head   #creating a link
        p1,p2 =dummy,dummy
        for i in range(n+1):
            p2 = p2.next
            
        while(p2!=None):
            p1 = p1.next
            p2 = p2.next
            
        p1.next = p1.next.next
        return dummy.next
        
        # time complexity is o(n) n being number of nodes and space complexity is constant.
        #I am creating a dummy node and then pointing two pointers p1 and p2 at it, moving p2 pointer n nodes ahead of p1.
        #then while p2 is not null, i am traversing p1 and p2 ahead.
        #when p2 is null, p1 will be at previous node of the node which needs to be deleted and hence will point prev node to next node hence will delete the required node.
