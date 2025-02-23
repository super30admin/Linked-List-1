#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};
ListNode *detectCycle(ListNode *head) {
    ListNode* slow = head, *fast = head;
    bool begin = true;
    while(fast&&fast->next&&(begin||slow!=fast)){
        begin = false;
        fast = fast->next->next;
        slow = slow->next;
    }
    if(!fast||!fast->next) return NULL;
    slow = head;
    while(slow!=fast){
        slow = slow->next;
        fast = fast->next;
    }
    return slow;
}
int main(){
    ListNode* head = new ListNode(3);
    head->next = new ListNode(2);
    head->next->next = new ListNode(0);
    head->next->next->next = new ListNode(-4);
    head->next->next->next->next = head->next;
    ListNode* cycle = detectCycle(head);
    cout<<cycle->val;
    return 0;
}
// Time Complexity: O(n)
// Space Complexity: O(1)
// Input: 3->2->0->-4, pos = 1
// Output: 2
// Explanation: The cycle is detected at node 2.