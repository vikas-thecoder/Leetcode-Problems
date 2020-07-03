/*  
Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/
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
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(0);
        ListNode temp=l1,temp1=l2,curr=dummyHead;
        int x=0,y=0,carry=0,sum=0;
        while(temp || temp1){
           x=(temp!=null)?temp.val:0;
            y=(temp1!=null)?temp1.val:0;
            sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(temp!=null) temp=temp.next;
            if(temp1!=null) temp1=temp1.next;

        }
        if(carry!=0){
            curr.next=new ListNode(carry);
        }
        return dummyHead.next;
        
    }
}
