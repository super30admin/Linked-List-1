// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no issues as of now.. Learning

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
         ListNode* dummyhead = new ListNode;
        dummyhead->next = head;
       ListNode* p1 = dummyhead; // dummery head for the corner case of single node case.
        ListNode* p2 = dummyhead;
        int counter = 0;
        if (n ==0) return head;
        while(p1!=NULL){
            if (counter > n){
                p2 = p2->next; // as soon as p1 exceeds the n values we start moving the p2
            }
            p1= p1->next;
            counter+=1;
          
        }
        
        p2->next = p2->next->next; // updating the position in order to skip the next node i.e remove it
        
      return dummyhead->next;  // nothing but the head node. but in case of single node and n=1 this will return NULL.
    }
};