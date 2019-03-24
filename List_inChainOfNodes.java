/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
    private Node[] nodeList = new Node[10];

    /**
      @return the number of elements in this list
     */
    public int size() {
		return nodeList.length;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
		String representation = "Size of List: " + this.size() + "\n";
		representation += nodeList[0];
		return representation;
    }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
		Node nodeVal = new Node(val);
		int index = this.size() - 1;
		while (index > 0) {
			this.nodeList[index] = this.nodeList[index - 1];
			index --;
		}
		if (index == 0) {
			this.nodeList[index] = nodeVal;
			nodeVal.setReferenceToNextNode(this.nodeList[1]);
		}
        return true;
     }
}