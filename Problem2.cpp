// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Minor Issues


// Your code here along with comments explaining your approach

#include<bits/stdc++.h>
using namespace std;

 // Definition for singly-linked list.
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
        if(head == NULL) return head; // null case
        ListNode* fast = head;  // creating 2 ptrs
        ListNode* slow = head;
        int count = 0;
        while(count<n){    // getting fast to location needed for slow
            fast = fast->next;
            count++;
        }
        if(fast == NULL) return head->next;  // handling edge case
        while(fast->next!= NULL){   // slow will be at the prev node 
            fast = fast->next;   
            slow = slow->next;
        }
        ListNode* temp = slow->next;
        slow->next = slow->next->next;  // updating slow ptr and removing element from list
        delete temp;  // freeing the memory from program
        return head;
    }
};