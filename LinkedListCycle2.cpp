//Time Complexity - O(n)
//Space Complexity - O(1)

//Problem successfully compiled on leet code
//No problems faced while coding this.


#include <iostream>
using namespace std;

 struct ListNode {
    int val;
      ListNode *next;
      ListNode(int x) : val(x), next(NULL) {}
  };
 
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode* fast=head;
        ListNode* slow = head;
        bool cycleFound=false;        
        while(fast!=NULL && fast->next!=NULL && slow!=NULL)
        {
            slow=slow->next;
            fast=(fast->next)->next;
            if(slow==fast)
            {
                cycleFound=true;
                break;
            }
            
        }
        
        if(!cycleFound)
        {
            return NULL;
        }
        
        slow=head;
        while(slow!=fast)
        {
            slow=slow->next;
            fast=fast->next;
        }
        return slow;
        
        
    }
};