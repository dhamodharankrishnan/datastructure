package tree.tab;

import java.util.ArrayList;

public class TabImpl {

	public static void main(String args[]){
		TabCollection tabColl = new TabCollection(ITabConstants.TAB_ARRAY);
		tabColl.setSelected("b.5");
		
		ArrayList tabList = tabColl.getMultiLevelList();
		System.out.println(tabList);
	}
}
