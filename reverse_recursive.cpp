//TimeComplexity O(n)
//SpaceComplexity O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

class Solution {
public:
    ListNode* reverseList(ListNode* head)         
    	 return reverse(head);
    }
    
    ListNode* reverse(ListNode* head){
        
        //base case
        if(head == NULL || head->next == NULL){
            return head;
        }
        
        //logic
        
        ListNode* reversed=reverse(head->next);
        head->next->next=head;
        head->next=NULL;
        return reversed;
    }
};

