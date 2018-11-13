import java.util.ArrayList;

public class Node {
	private final int x;
	private final int y;
	
	private ArrayList<Node> neighbor;
	
	public Node(int x, int y){
		this.x = x;
		this.y = y;
		neighbor = new ArrayList<Node>();
		if(x<Config.GRID_WIDTH) neighbor.add(new Node(x+1,y));
		if(x<Config.GRID_WIDTH && y<Config.GRID_HEIGHT) neighbor.add(new Node(x+1,y+1));
		if(x<Config.GRID_HEIGHT) neighbor.add(new Node(x,y+1));
		if(x>0 && y<Config.GRID_HEIGHT) neighbor.add(new Node(x-1,y+1));
		if(x>0) neighbor.add(new Node(x-1,y));
		if(x>0 && y>0) neighbor.add(new Node(x-1,y-1));
		if(y>0) neighbor.add(new Node(x,y-1));
		if(x<Config.GRID_WIDTH && y>0) neighbor.add(new Node(x+1,y-1));
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}

	public ArrayList<Node> getNeighbor() {
		return neighbor;
	}

	
	
}
