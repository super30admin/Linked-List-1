#T.C = O(N) Length of linkedList
#S.C=> O(N) Since we use recurssion stack
#Appraoach => Here we use recursion. Were all the values are store in recurssion stack. Ones the values unfoalds we assign head.next.next set to head and then current head as none
#Approach2 = > we can even make the next node to point to current node and curr.next.next is store in one variable to reapeate the same process. Here space can be optimized
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None: return head
        reverse = self.reverseList(head.next)
        # print("head: "+  str(head.val) +  'reverse: ' + str(reverse.val))
        head.next.next = head
        head.next = None
        return reverse