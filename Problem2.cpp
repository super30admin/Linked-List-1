// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    //using dummy node
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* dummy=new ListNode(0);
        dummy->next=head;
        ListNode* p1=dummy;
        ListNode* p2= dummy;
        int count=0;
        while(count<=n){
            p2=p2->next;
            count++;
        }
        
        while(p2!=NULL){
            p1=p1->next;
            p2=p2->next;
        }
        
        p1->next = p1->next->next;
        
        return dummy->next;
        
    }
};
