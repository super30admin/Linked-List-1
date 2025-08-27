public class ReverseLinkedList 
{
    public ListNode reverseList(ListNode head)
    {
      ListNode prev=null,curr=head;
      
      while(curr!=null)
      {
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
      }
      return prev;

    }
}
class ReverseLinkedList2
{
    public ListNode reverseList(ListNode head)
    {
      if(head==null) return null;
      ListNode prev=null,curr=head,temp=curr.next;
      
      while(temp!=null)
      {
        curr.next=prev;
        prev=curr;
        curr=temp;
        temp=temp.next;
      }
      curr.next=prev;
      return curr;
    }
}
class ReverseLinkedList3
{
    public ListNode reverseList(ListNode head)
    {
       return helper(null,head);
    }
    private ListNode helper(ListNode prev,ListNode curr)
    {
        if(curr==null) return prev;
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
        return helper(prev, curr);
    }
}
class ReverseLinkedList4
{
    ListNode result;
    public ListNode reverseList(ListNode head)
    {

       helper(null,head);
       return result;
    }
    private void helper(ListNode prev,ListNode curr)
    {
        if(curr==null) 
        {
            result=prev;
            return;
        }
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
        helper(prev, curr);
    }
}
class ReverseLinkedList5
{
    public ListNode reverseList(ListNode head)
    {
       return helper(null,head);
    }
    private ListNode helper(ListNode prev,ListNode curr)
    {
        if(curr==null) return prev;
        ListNode result=helper(curr,curr.next);
        curr.next=prev;
        return result;
    }
}
class ReverseLinkedList6
{
    public ListNode reverseList(ListNode head)
    {
       if(head==null|| head.next==null) return head;
       ListNode result=reverseList(head.next);
       head.next.next=head;
       head.next=null;
       return result;
    }
    
}
class ReverseLinkedList7
{
    ListNode result;
    public ListNode reverseList(ListNode head)
    {
       if(head==null) return null;
       helper(head);
       return result;
    }
    private void helper(ListNode head)
    {
        if(head.next==null)
        {
            result=head;
            return;
        }
        reverseList(head.next);
        head.next.next=head;
        head.next=null;   
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
