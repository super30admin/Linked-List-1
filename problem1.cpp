// Time Complexity  : O(n) --> We iterate through the entire linked list
// Space Complexity : O(n) --> We create a new linked list (current) that reverses all the values from the previous linked list(head)
// Did this code successfully run on Leetcode : Yes	
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach


/*

1. Create a new Linked List ptr to store the reverse Linked list
2. For every iteration, the reverse LL ptr gets updated to the first value in head & head gets updated head->next
3. After some iteration when head gets updated to head->next & head->next doesnt exist, we return reverse pointer since all the values from head have been stored in reverse now
*/


#include <iostream>
#include <algorithm>

using namespace std;


//Definition for singly-linked list.

 struct ListNode {
      int val;
      ListNode *next;
      ListNode(int x) : val(x), next(NULL) {}
  };

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* cur = NULL; //initialize reverse ptr to NULL incase we have empty linked list
        while (head) {//iterate until all the values in head are reversed
            ListNode* next = head -> next;
            head -> next = cur; 
            cur = head;//store the first val of Linked List in reverse ptr (since the 
            head = next;//update the head to now point to head->next
        }
        return cur;
    }
}