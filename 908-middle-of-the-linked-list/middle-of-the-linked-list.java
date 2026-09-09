/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode temp=head;
//         int size=0;
//         while(temp!=null){
//             size++;
//             temp=temp.next;
//         }
//         int pos=size/2;
//         ListNode curr=head;
//         while(pos-->0){
//             curr=curr.next;
//         }
//         head=curr;
//         return head;
//     }
// }
// ANOTHER APPROACH 

public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}
