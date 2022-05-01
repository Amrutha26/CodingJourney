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
    public void reorderList(ListNode head) {
        // security check
        if(head == null || head.next == null) return;
        
        // head of the first half of the list
        ListNode l1 = head;
        
        // head of the second half of the list
        ListNode slow = head;
        
        //tail of the second half of the list
        ListNode fast = head;
        
        //tail of the first half of the list
        ListNode prev = null;
        
        // to find the middle of the linked list to separate into two lists
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // to separate into two lists
        prev.next = null; 
         
        ListNode l2 = reverse(slow);
        
        merge(l1, l2);
    }
    
    
    // Reversing the list: without creating a new linked list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
    
    // Merging two lists
    public void merge(ListNode l1, ListNode l2) {
        while(l1 != null) {
            // Have reference of the l1's next 
          ListNode l1_next = l1.next;
          ListNode l2_next = l2.next;
           
          l1.next = l2;  
          if(l1_next == null) {
              break;
          }
            
          l2.next = l1_next;
          l1 = l1_next;
          l2 = l2_next;
    
        }
    }
}