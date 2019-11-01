//--->183/209 test cases passed
//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode node = head;
        int size=0;
    for(ListNode node1=head;node1.next!=null;node1=node1.next) size++;
        //size=size+1;
       if(head==null) return null;
        if(node.next==null&&n==1) return null;
        else{
        int i=0;
        while(node!=null&&i<size){
            //System.out.println(node.val);
            if(i==size-n){ ListNode temp = node.next; node.next=temp.next;}
            else if(i<size-n||i>size-n) node=node.next;
            i++;
        }
        return head;
        }
    }
}
