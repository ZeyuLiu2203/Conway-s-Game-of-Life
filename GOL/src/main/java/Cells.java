import java.util.*;


public class Cells implements Iterable<Node>{
	private ArrayList<Node> body = new ArrayList<Node>();

	public void add(Node node) {
		body.add(node);
	}
	
	
	

	public Iterator<Node> iterator() {
		// TODO Auto-generated method stub
		return body.iterator();
	}
	
	
}
