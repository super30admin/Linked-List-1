// Time Complexity : O(N) 

// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes

// Appoarch: Using fast and slow pointers, first move the fast pointer until n,
// then move slow n fast one by one until fast->next is NULL. Return start->next.

// 19. Remove Nth Node From End of List

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
        ListNode* start = new ListNode();
        start->next = head;
        ListNode* slow = start;
        ListNode* fast = head;
        for(int i=0;i<n;i++){
            fast = fast->next;
        }
        while(fast != NULL){
            fast = fast->next;
            slow = slow->next;
        }
        slow->next = slow->next->next;
        return start->next;
    }
};