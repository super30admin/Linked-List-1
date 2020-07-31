//Time Complexity : O(number of nodes)
//Space Complexity : O(1)
/*Approach
-taking two pointers fast and slow
-firstly moving the fast till nth position to maintain a gap of n between slow and fast
-then again moving slow and fast to next node in each iteration whenever fast reaches end(i.e null)
slow will be before the nth node from the last, so pointing nest of slow to the next of its next
*/
public class DeleteNthNode {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
   }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count =0;
        while(count<=n){
            count++;
            fast = fast.next;
        }
        
        while(fast != null){
            slow = slow.next;
            fast= fast.next;
        }
        slow.next= slow.next.next;

        return dummy.next;
        
    }
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        DeleteNthNode obj= new DeleteNthNode();
        ListNode newNode = obj.removeNthFromEnd(head,3);
        while(newNode != null){System.out.print(newNode.val+" "); newNode= newNode.next;}



    }

}