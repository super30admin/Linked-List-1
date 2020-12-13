# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        #Method1>>3 pointer/Iterative
        # #O(N)
        # #O(1)
        
        # #if 1 or 0 element
        # if head==None or head.next==None:
        #     return head
        # prev=None
        # cur=head
        # temp=head.next
        # while temp!=None:
        #     cur.next=prev
        #     prev=cur
        #     cur=temp
        #     temp=temp.next
        # cur.next=prev
        # return cur
        
        
        
        
        #Method2>>recursive
        #O(N)
        #O(N)stack
        # def rev(head):
        #     if head==None or head.next==None:
        #         return head
        #     reversedval=rev(head.next)
        #     head.next.next=head
        #     head.next=None
        #     #print(reversedval)
        #     return reversedval
        # return rev(head)
        
        
        
        #iterative stack
        #O(N)
        #O(N)
        st=[]
        if head==None or head.next==None:
            return head
        while head.next!=None:
            st.append(head)
            head=head.next
        reversedval=head
        while(st):
            head=st.pop()
            head.next.next=head
            head.next=None
        return reversedval
            
        
        
        
        