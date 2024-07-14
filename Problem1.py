#I used a two-pass method to reverse the linked list. In the first pass, I traverse the entire linked list, storing each node's value in a list. This allows me to capture all the values in their original order. Then, I reverse this list using Python's slicing feature (l[::-1]). In the second pass, I traverse the linked list again, this time replacing each node's value with the corresponding value from the reversed list. This effectively reverses the linked list in-place without changing the node connections.


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        l=[]
        temp=head
        while temp != None:
            l.append(temp.val)
            temp=temp.next
        l=l[::-1]
        temp=head
        for i in range (len(l)):
            temp.val=l[i]
            temp=temp.next
        return head
