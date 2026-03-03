// TimeComplexity: O(n)
// SpaceComplexity: O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(-1, head);
    ListNode slow = dummy;
    ListNode fast = dummy;
    int i =0;
    while(i<=n) {
        fast = fast.next;
        i++;
    }
    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }
    ListNode temp = slow.next;
    slow.next = slow.next.next;
    temp.next = null;
    return dummy.next;       
    }
}


// TimeComplexity: O(2n)
// SpaceComplexity: O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode first = head;
    int m=0;
    while(first!=null) {
        m++;
        first = first.next;
    }
    System.out.println(m);
    int k = m-n;
    if(k==0) {
        ListNode temp2 =  head;
        head= head.next;
        temp2.next = null;
        return head;
    }
    ListNode second = head;
    for(int i=0; i<k-1; i++){
        System.out.println(second.val);
        second= second.next;
    }
    
    ListNode temp = second.next;
    second.next = second.next.next;
    temp.next = null;
    
    return head;
        
    }
}