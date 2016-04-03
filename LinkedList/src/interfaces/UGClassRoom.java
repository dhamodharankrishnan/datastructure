package interfaces;


public class UGClassRoom extends ClassRoom implements IClassRoom  {

	private String classLabel;
	public UGClassRoom(String aClassLabel){
		this.classLabel = "UG";
	}
	public String getClassLabel() {
		return classLabel;
	}
	public void setClassLabel(String classLabel) {
		this.classLabel = classLabel;
	}
	@Override
	public String toString() {
		return "UGClassRoom [classLabel=" + classLabel + ", studentsList="
				+ studentsList + "]";
	}

	
}
