//Time Complexity - O(n)
//Space Complexity - O(1)

//Problem successfully compiled on leet code
//No problems faced while coding this.


#include <iostream>
using namespace std;



  struct ListNode {
      int val;
      ListNode *next;
      ListNode() : val(0), next(nullptr) {}
      ListNode(int x) : val(x), next(nullptr) {}
      ListNode(int x, ListNode *next) : val(x), next(next) {}
 };

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* dummyNode=new ListNode();
        dummyNode->next=head;
        
        
        int count=0;
        ListNode* fast=dummyNode;
        ListNode* slow=dummyNode;
        
        while(count<n)
        {
            fast=fast->next;
            count++;
        }
        
        while(fast->next!=NULL)
        {
            fast=fast->next;
            slow=slow->next;
        }
        
        slow->next=(slow->next)->next;
        return dummyNode->next;
    }
};