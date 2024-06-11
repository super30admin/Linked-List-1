//time complexity:O(n)
//space complexity:O(1)
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseLinkedL
{

        public ListNode reverseList(ListNode head)
        {
            ListNode prev=null;
            ListNode current=head;
            ListNode next;

            while(current!=null)
            {
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            return prev;
        }
        public static void main(String[] args)
        {
            ReverseLinkedL obj=new ReverseLinkedL();
            ListNode head=new ListNode(1);
            head.next=new ListNode(2);
            head.next.next=new ListNode(3);
            head.next.next.next=new ListNode(4);
            ListNode llist=obj.reverseList(head);
            while(llist!=null) {
                System.out.println(llist.val);
                llist=llist.next;
            }
        }
    }
