
public class flattenDL{
 
  public Node flatten(Node head) {
    if(head == null){
      return head;
    }
    HashSet<Node> visited = new HashSet();
    Node previous = new Node();
    previous.val = -1;
    Node curr = new Node();
    Stack<Node> s = new Stack();
    s.push(head);
    while(!s.isEmpty()){
      curr = s.peek();
      if(curr.next!=null && !visited.contains(curr.next)){
        s.push(curr.next);
      }else if(curr.child!=null && !visited.contains(curr.child)){
        s.push(curr.child);
      }else{
        visited.add(s.pop());
        if(previous.val == -1){
          curr.next = null;
        }else{
          curr.next = previous;
          previous.prev = curr;
        }

        curr.child = null;
        previous = curr;
      }
    }
    return curr;
  }

}
