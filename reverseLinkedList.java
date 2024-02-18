public class reverseLinkedList {
    //TC: O(n)
    //SC: O(1)
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next ==  null){
            return head;
        }

        ListNode prevnode = null;
        ListNode currnode = head;

        while(currnode!=null){
            ListNode nxtnode = currnode.next;
            currnode.next = prevnode;
            prevnode=currnode;
            currnode=nxtnode;
        }
        head = prevnode;
        return head;



        // Stack<Integer> st1 = new Stack<>();


        // while(head!=null){
        //     st1.push(head.val);
        //     head = head.next;
        // }
        // ListNode result = new ListNode(Integer.MIN_VALUE);
        // ListNode ptr = result;;
        // while(!st1.isEmpty()){
        //     ptr.next = new ListNode(st1.pop());
        //     ptr = ptr.next;
        // }

        // return result.next;
    }
}
