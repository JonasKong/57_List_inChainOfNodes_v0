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
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
		Node nodeVal = new Node(val);
		nodeVal.setReferenceToNextNode(headReference);
		return true;
     }
}
