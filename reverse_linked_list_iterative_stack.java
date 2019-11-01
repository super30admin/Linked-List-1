class Solution {
    
    public ListNode reverseList(ListNode head) {
     ListNode node = head;
        Stack<ListNode> stack = new Stack<ListNode>();
        if(head==null) return head;
        while(node!=null){
            stack.push(node);
            node=node.next;
        }
        ListNode dummyNode = new ListNode(-1);
        head=dummyNode;
        while(!stack.isEmpty()){
        ListNode current=stack.pop();
        head.next = new ListNode(current.val);
        head=head.next;
        
        
        }
        return dummyNode.next;
    }
}
