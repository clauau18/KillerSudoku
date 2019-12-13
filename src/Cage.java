import java.util.ArrayList;

public class Cage {
	public int sum;
	public ArrayList<Pair> cells;
	
	public Cage(int val, ArrayList<Pair> group) {
		this.sum = val;
		this.cells = group;
	}
	
	public String toString() {
		String s = this.sum + "";
		for(int i = 0; i < this.cells.size(); i++)
			s += " " + this.cells.get(i);
		return s;
	}
}
