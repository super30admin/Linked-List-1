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

ListNode* reverseList(ListNode* head) {
    if(!head) return NULL;
    ListNode* ptr = head;
    while(head->next){
        ListNode* temp = head->next;
        head->next = head->next->next;
        temp->next = ptr;
        ptr = temp;
    }
    return ptr;
}
int main(){
    ListNode* head = new ListNode(1);
    head->next = new ListNode(2);
    head->next->next = new ListNode(3);
    ListNode* reversed = reverseList(head);
    while(reversed){
        cout<<reversed->val<<" ";
        reversed = reversed->next;
    }
    return 0;
}
// Time Complexity: O(n)
// Space Complexity: O(1)
// Input: 1->2->3
// Output: 3->2->1
// Explanation: The linked list is reversed.