import java.util.*;

public class Grid {
	private Cells cells;
	public final boolean status[][];
	private final int width;
	private final int height;
	
	
	public Grid(int width, int height) {
		super();
		this.cells = cells;
		this.status = new boolean[width][height];
		this.width = width;
		this.height = height;
		
		cells = initCells();
		
	}


	private Cells initCells() {
		Cells cell = new Cells();
		cell.add(new Node(width/2+1,height/2));
		status[width/2+1][height/2] = true;
		
		cell.add(new Node(width/2,height/2+1));
		status[width/2][height/2+1] = true;
		
		cell.add(new Node(width/2-1,height/2));
		status[width/2-1][height/2] = true;
		
		cell.add(new Node(width/2,height/2-1));
		status[width/2+1][height/2-1] = true;
		
		return cell;
	}
	
	
	public void nextRound() {
		
		Iterator i = cells.iterator();
		
		while(i.hasNext()) {
			for(Node n : ((Node) i.next()).getNeighbor()) {
				
			}
		}
		
		
		
		
		
	}
	
	
	
	
}
