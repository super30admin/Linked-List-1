// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode* slow=head;
        ListNode* fast=head;
        bool flag = false;
        
        while(fast!=NULL && fast->next!=NULL){
            fast=fast->next->next;
            slow=slow->next;
            if(fast==slow){
                flag=true;
                break;
            }
        }
        
        if(flag==false) return NULL;
        
        slow=head;
        while(fast!=slow){
            slow=slow->next;
            fast = fast->next;
        }
        cout << slow->val;
        return slow;
    }
};
