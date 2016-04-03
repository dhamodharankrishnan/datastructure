package interfaces;

public class PGClassRoom extends ClassRoom implements IClassRoom {
	private String label;
	public PGClassRoom(String aLabel){
		this.label = "PG";
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@Override
	public String toString() {
		return "PGClassRoom [label=" + label + ", studentsList=" + studentsList
				+ "]";
	}

	

}
