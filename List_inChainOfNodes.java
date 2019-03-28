/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes(){
		headReference = new Node(null);
	}

    /**
      @return the number of elements in this list
     */
    public int size() {
		Node current = headReference;
		int size = 0;
		while (current.getCargoReference() != null) {
			size += 1;
			current = current.getReferenceToNextNode();
		}
		return size;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
		Node current = headReference;
		String representation = "Size of List: " + this.size() + "\n";
		while (current.getCargoReference() != null) {
			representation += current.getCargoReference();
			current = current.getReferenceToNextNode();
		}
		return representation;
    }
    
    /**
	  Iterate through the list until the desired Node is reached.
	*/
	public Node iterateTo(int index){
		Node current = headReference;
		 int i = 0;
		 while ((i < index) && (current.getReferenceToNextNode() != null)) {
				 current = current.getReferenceToNextNode();
				 i ++;
		 }
		 return current;
	}
	
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
		Node nodeVal = new Node(val);
		nodeVal.setReferenceToNextNode(headReference);
		headReference = nodeVal;
		return true;
     }
	 
	 public Object set(int index, Object val) {
		 Node current = this.iterateTo(index);
		 Object replaced = current.getCargoReference();
		 current.setCargoReference(val);
		 return replaced;
	 }
	 
	 public Object get(int index) {
		 Node current = iterateTo(index);
		 return current.getCargoReference();
	 }
	 
	 public boolean add(int index, Object val) {
		 Node nodeVal = new Node(val);
		 Node current = iterateTo(index - 1);
		 Node placeholder = current.getReferenceToNextNode();
		 current.setReferenceToNextNode(nodeVal);
		 nodeVal.setReferenceToNextNode(placeholder);
		 return true;
	 }
	 
	 public boolean remove(int index) {
		 Node current = iterateTo(index - 1);
		 Node placeholder = current.getReferenceToNextNode();
		 current.setReferenceToNextNode(placeholder.getReferenceToNextNode());
		 return true;
	 }
}
