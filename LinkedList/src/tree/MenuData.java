package tree;

public class MenuData {

	private String tabID;
	private String title;
	private int level;
	
	public MenuData(String tabID, String title, int level) {
		this.tabID = tabID;
		this.title = title;
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getTabID() {
		return tabID;
	}
	public void setTabID(String tabID) {
		this.tabID = tabID;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "MenuData [tabID=" + tabID + ", title=" + title + ", level="
				+ level + "]";
	}

	
}
