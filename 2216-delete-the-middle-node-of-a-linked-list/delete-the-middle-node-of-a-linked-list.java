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
    public ListNode deleteMiddle(ListNode head) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==1) return null ;
        int pos=(int)Math.floor((size/2));
        ListNode curr=head;
        while(--pos>0){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}