//time complexity:O(n)
//space complexity:O(1)
public class RemoveNode {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        if(head==null)
        {
            return head;
        }
        int count=0;
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow= dummy;
        while(count<=n)
        {
            fast=fast.next;
            count++;
        }
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args)
    {
        RemoveNode obj=new RemoveNode();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        int n=2;
        ListNode llist=obj.removeNthFromEnd(head, n);
        while(llist!=null) {
            System.out.println(llist.val);
            llist=llist.next;
        }
    }
}
