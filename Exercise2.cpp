// Problem - Remove nth  node from end of list
//  Time Complexity : O(n)
//  Space Complexity : O(1)
//  Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. Since n can point to head itself, we create a dummyNode to avoid any edge
// cases
// 2. We use slow and fast pointer technique, we first move fast to count == n,
// to create a gap of n nodes
// 3. We then move the slow and fast together, after fast reaches null, slow
// will be pointing to the node previous which needs to be deleted

#include <bits/stdc++.h>
using namespace std;

/**
 * Definition for singly-linked list.
 * };
 */
struct ListNode {
  int val;
  ListNode *next;
  ListNode() : val(0), next(nullptr) {}
  ListNode(int x) : val(x), next(nullptr) {}
  ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
  ListNode *removeNthFromEnd(ListNode *head, int n) {
    ListNode *dummyNode = new ListNode();
    dummyNode->next = head;
    ListNode *slow = dummyNode;
    ListNode *fast = dummyNode;
    int count = 0;
    while (count <= n) {
      fast = fast->next;
      count++;
    }
    while (fast) {
      slow = slow->next;
      fast = fast->next;
    }

    ListNode *temp = slow->next;
    slow->next = temp->next;
    temp->next = nullptr;
    delete temp;
    return dummyNode->next;
  }
};
