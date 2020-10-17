// Time Complexity  : O(n) --> We iterate through the list of length n
// Space Complexity : O(1) --> We only have constant extra space
// Did this code successfully run on Leetcode : Yes	
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

#include <iostream>
#include <algorithm>

using namespace std;

 // Definition for singly-linked list.
  struct ListNode {
      int val;
      ListNode *next;
      ListNode(int x) : val(x), next(NULL) {}
  };
 
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp = new ListNode(0);
        temp->next = head;
        
        ListNode* first = temp;
        ListNode* second = temp;
        
        for(int i = 0; i<n+1; i++)
            first = first->next;
        
        while(first !=  NULL)
        {
            first = first->next;
            second = second->next;
        }
        
        second->next = second->next->next;
        
        return temp->next;
    }
};