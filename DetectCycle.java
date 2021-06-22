import java.util.HashSet;
import java.util.Set;
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

/*
We make use of Set to check if the node has been visited before or not
if the node with the same address is already present we return the node.

*/
public class DetectCycle {
    public static ListNode detectCycle(ListNode head) {
        if(head==null)
            return null;
        Set<ListNode> nodeList=new HashSet<ListNode>();
        while(head!=null)
        {
            if(!nodeList.contains(head))
            nodeList.add(head);
            else return head;
            head=head.next;
            
        }
        return null;
        
        
    }
    public static void main(String[] args)
    {
        ListNode head=new ListNode(3);
        

        ListNode node= new ListNode(2);
        head.next=node;
        head.next.next=new ListNode(0);
        head.next.next.next=new ListNode(-4);
        head.next.next.next.next=node;
        System.out.println("Inserted Cycle Node:"+" "+node);

        ListNode cycleCause=detectCycle(head);
        System.out.println("Detected Cycle Node:"+" "+cycleCause);

        
    }
}
