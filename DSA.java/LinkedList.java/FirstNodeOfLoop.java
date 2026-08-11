public class FirstNodeOfLoop {
    static Node firstNodeLoop(Node head){
        Node slow = head;
        Node fast = head;
        Node temp = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                while(temp != slow){
                    slow = slow.next;
                    temp = temp.next;
                }
                return temp;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        // DSA Sheet by pw
    }
    
}
