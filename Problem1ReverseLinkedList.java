//When doing so says, there is a cycle formed in the linkedList;
//Kindly remove the cycle

class Solution {
    public ListNode reverseList(ListNode head) {
        
        //working with pointer will not work as we will need pinter to pointing at all the elements present in the stack currently;
        
        //Using stack;
        Stack<ListNode> stack=new Stack<>();
        ListNode curr=head;
        
        while(curr!=null){
            stack.push(curr);
            System.out.println(curr);
            curr=curr.next;
        }
        
        // System.out.println(stack.peek()); 
        
        head=stack.pop();
        curr=head;
        System.out.println("New Head:"+head);
        while(stack.size()>0){
            curr.next=stack.pop();
        }
        return head;
    }   
}
