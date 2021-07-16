# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
            #you can also do it through fast and slow pointer.Fast+slow would be total nodes
            if (head==None or (head.next==None and n==1)):
                return None
            dummy=ListNode(0)
            slow=dummy
            fast=dummy
            dummy.next=head
            counter=0
            while(fast!=None):
                
                while(fast!=None and counter<=n):
                    fast=fast.next
                    counter+=1
                if (fast!=None):
                    slow=slow.next
                    fast=fast.next
            
            slow.next=slow.next.next
            return dummy.next
            #Time O(n)
            #Space O(1)

            # #two pass solution
            # total=0
            # cur=head
            # while(cur!=None):
            #     cur=cur.next
            #     total+=1
            # cur=head
            # prev=None
            # c=total-n
            # while(c>0):
            #     c-=1
            #     prev=cur
            #     cur=cur.next
            # if prev!=None:
            #     if cur.next!=None:
            #         prev.next=cur.next
            #     else:
            #         prev.next=None
            # else:
            #     head=cur.next
            # return head
            # #Time O(n)
            # #Space O(1)
                
