# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

        
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        st=[]
        rev_head=None
        dummy=head
        while dummy!=None:
            st.append(dummy.val)
            dummy=dummy.next
            #print (st)
        while len(st)!=0:
            popped=st.pop()
            #print (popped)
            if rev_head==None:
                rev_head=ListNode(popped)
                dummy=rev_head
                #print (dummy)
            else:
                rev_head.next=ListNode(popped)
                rev_head=rev_head.next

        return dummy


