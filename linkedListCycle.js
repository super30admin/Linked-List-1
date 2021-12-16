// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Step1: Set base cases to not cause the function to fail by an exception
// Step2: Set slow to second value and fast to the third value(slow=1x speed && fast=2x speed)
// Step3: Create the first while loop and have it continue until fast and slow have met
// Step4: After they've met, start the slow pointer back from the beginning or just use head
// to traverse again at 1x speed. We also update fast pointer's speed to become 1x.
// Step5: When the two pointers meet again, that is where the cycle lies.

var detectCycle = function (head) {
  if (head === null || head.next === null || head.next.next === null)
    return null;

  let slowPointer = head.next;
  let fastPointer = head.next.next;

  while (slowPointer !== fastPointer) {
    if (fastPointer.next === null || fastPointer.next.next === null)
      return null;
    slowPointer = slowPointer.next;
    fastPointer = fastPointer.next.next;
  }

  slowPointer = head;
  while (slowPointer !== fastPointer) {
    if (fastPointer.next === null || fastPointer.next.next === null)
      return null;
    slowPointer = slowPointer.next;
    fastPointer = fastPointer.next;
  }

  return fastPointer;
};
