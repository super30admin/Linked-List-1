//TC:O(n)
//SC:O(1)
//works in leetcode
//use two pointers left,right. Initialize left to head and right pointer to nth place
public class RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n)  {
        ListNode left = head;
        ListNode right = head.next;

        for(int i=0;i<n;i++){
            right = right.next;
        }

        while(right !=null){
            left = left.next;
            right= right.next;
        }
        ListNode temp = left.next.next;
        left.next = temp;

        return head;
    }

    public static void main(String [] args){
        //1,2,3,4,5

        ListNode tail = new ListNode(5,null);
        ListNode node1 = new ListNode(4,tail);
        ListNode node2 = new ListNode(3,node1);
        ListNode node3 = new ListNode(2,node2);
        ListNode head = new ListNode(1,node3);

        ListNode newLL = removeNthFromEnd(head, 3);
        while(newLL!=null){
            System.out.println(newLL.val);
            newLL = newLL.next;
        }
    }
}












