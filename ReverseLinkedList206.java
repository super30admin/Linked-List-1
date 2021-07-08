 //time complexity : O(n)
//space complexity : O(1)
//leet code : yes
// steps : point cursor to it's next ref and attach currosr to dummy node to reverse.and finally map the next to cursor.
//   in 2md case space complexity is O(n)
class ReverseLinkedList206{

class ListNode {

    ListNode next;
    int val;
    ListNode(int x){
        this.val = x;
    }
    public ListNode reverseList(ListNode head) {

        if(head==null||head.next==null) return head;
        
      //  ListNode R=null,cursor=head,next;
            // 1 <- 2   3  4
        //            R cursor
        // while(cursor!=null){
        //     next = cursor.next;
        //     cursor.next = R;
        //     R = cursor;
        //     cursor = next;
        // }
        
        ListNode R = reverseList(head.next);
        head.next.next = head;
        head.next = null;


        return R;


    }

}



}