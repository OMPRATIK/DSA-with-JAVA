import java.util.*;
class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size; // Size Of A LinkedList
    // Add New Node At First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        } 
        newNode.next = head;
        head = newNode;
    }
    // Add New Node At last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // Print a Linked List
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Add Node in the middle
    public void addIndex(int ind,int data) {
        if(ind == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < ind-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // remove First
    public int removeFirst() {
        if(size == 0) {
            System.out.println("Empty LinkedList");
            return Integer.MAX_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    // Remove Last
    public int removeLast() {
        if(size == 0) {
            System.out.println("Empty LinkedList");
            return Integer.MAX_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    // Linear search in LinkedList (Iterative)
    public int linearSearch(int key) {
        Node temp = head;
        int i =0;
        while(temp != null) {
            if(temp.data == key) return i;
            i++;
            temp = temp.next;
        }
        return -1;
    }
    // recursive search
    public int search(int key,Node head,int i) {
        if(head == null) return -1;
        if(head.data == key) return i;
        return search(key,head.next,i+1);
    }
    // Reverse a LinkedList
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    // delete Nth node from end
    public void deleteNthNode(int n) {
        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        if(n == size) {
            head = head.next;
            return;
        }
        int i =1;
        int toFind = size - n;
        Node prev = head;
        while(i< toFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    // Check if LinkedList is palindrome or not
    // 1. find middle of LinkedList
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // 2. check palindrome
    public boolean checkPalindrome(Node head) {
        if(head == null || head.next == null) return true;
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while(right != null) {
            if(left.data != right.data) {
                return  false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    // Check if LinkedList is in cycle or not
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
    // Remove Cycle in a Linked List
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean exists = false;
        while(fast != null  && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                exists = true;
                break;
            }
        }
        if(exists == false) return;
        slow = head;
        Node prev = null;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    // Merge Sort 
    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;   
    }
    public Node merge(Node head1,Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;  
            }
            else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head) {
        if(head == null || head.next == null) return head;
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft,newRight);
    }
    // ZigZag
    public void zigZag() {
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid  = slow;
        //reverse second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL,nextR;
        while(left!=null && right !=null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }
    }
    public void oddEvenList(Node head) {
        Node tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }
        int i=0;
        Node temp = head;
        while(temp.next!=null) {
            if((i+1)%2==1) {
                Node end = temp.next;
                temp.next = temp.next.next;
                tail.next = end;
                tail = tail.next;
            }
            i++;
            temp = temp.next;
        }
    }
    // Q1 stack
    public static boolean palindStack(Node head) {
        Stack<Integer> s = new Stack<>();
        Node temp = head;
        while(temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }
        while(head != null) {
            if(head.data != s.pop()) return false;
            head = head.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        
        
        System.out.println(palindStack(head));

    }
}
