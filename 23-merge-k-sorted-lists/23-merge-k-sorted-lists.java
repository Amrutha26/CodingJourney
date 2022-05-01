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
    public ListNode mergeKLists(ListNode[] lists) {
        
        // creating a minheap
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        
        // traversing through each and every list
        for(ListNode head: lists) {
           while(head != null) {
               // adding
               minHeap.add(head.val);
               head = head.next;
           }    
        }
        
        // reference node - dummy
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        
        // adding all the elements into a new linkedlist
        while(!minHeap.isEmpty()) {
            head.next = new ListNode(minHeap.remove());
            head = head.next;
        }
        
        // always return dummy.next and not dummy
        return dummy.next;
    }
}