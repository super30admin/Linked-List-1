// T.C: O(N)
//S.C:O(1)
//   Definition for singly-linked list.
  public class removenthnode {
      int val;
      removenthnode next;
      removenthnode() {}
      removenthnode(int val) { this.val = val; }
      removenthnode(int val, removenthnode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public removenthnode removeNthFromEnd(removenthnode head, int n) {
        removenthnode dummy= new removenthnode(0);
        dummy.next= head;
        removenthnode left= dummy;
        removenthnode right=dummy; //distance betweent the 2 pointers should be n
        
        
        for(int i=1; i<=n+1;i++){
            if(right==null){
                return head.next;
            }else{
                right= right.next;
            }
            
        }
        while(right!=null){
            right=right.next;
            left=left.next;
        }
        left.next= left.next.next;
        
        return dummy.next;
    }
}
