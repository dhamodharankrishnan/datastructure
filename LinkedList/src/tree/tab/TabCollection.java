package tree.tab;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Level 1 - [ Key Date, Build Agrmnt, EAS, PEG, Franchise Fees, Franchise Mgmt, Liability, Billing ]
 * Level 2 - [ Service Standard, Communication ]
 * Level 3 - [ Outages ]
 * 
		1) Key Date
		2) Build Agrmnt
		3) EAS
		4) PEG
		5) Franchise Fees
		6) Franchise Mgmt
			a) Service Mgmt
				i. Outages
			b) Communication
		7) Liability
		8) Billing
 * 
 * */
public class TabCollection extends ArrayList implements ITabConstants
{
	private  String bgColorArray[];
	private String styleArray[];
	private String selBgColorArray[];
	private String selStyleArray[];
	private String tabArray[];
	private ArrayList multiLevelList;
	
	public TabCollection( String aTabArray[]  )
	{
		this(BGCOLOR, STYLE, SEL_BGCOLOR, SEL_STYLE, aTabArray);
	}

	public TabCollection(String aBgColorArray[], String aStyleArray[], String aSelBgColorArray[], String aSelStyleArray[], String aTabArray[] )
	{
		super();
		
		bgColorArray = aBgColorArray;
		styleArray = aStyleArray;
		selBgColorArray = aSelBgColorArray;
		selStyleArray = aSelStyleArray;
		tabArray = aTabArray;
		multiLevelList = new ArrayList();
		generateTabs();
	}
	
	
	private void generateTabs()
	{
		if(tabArray != null && tabArray.length > 0)
		{
			for(int tabCount=0; tabCount<tabArray.length;tabCount++)
			{
				StringTokenizer tokens = new StringTokenizer(tabArray[tabCount], "|");

				String tabID=null;
				String title=null;
				int tokenCount=0;
				while(tokens.hasMoreTokens())
				{
					switch(tokenCount)
					{
						case 0:
							tabID = (String)tokens.nextElement();
							break;
						case 1:
							title = tokens.nextToken();
							break;
					}
					
					tokenCount++;
				}

				TabNode parentNode = getParentNode(tabID);
				if(parentNode != null)
				{
					int level = parentNode.getLevel()+1;
					
					TabNode tabNode = new TabNode(tabID, parentNode, level, title, getStyle(level), getBgColor(level), this);
					parentNode.addChild(tabNode);
				}
				else
				{
					add(new TabNode(tabID, null, 1, title, getStyle(1), getBgColor(1), this));
				}
			}
		}
		
		
	}

	/**
	 * The parent Collection is passed as the parameter
	 * */
	private TabNode getParentNode(String aTabID)
	{
		TabNode parentNode=null;
		if(aTabID != null)
		{
				for(int i=0;i<size();i++)
				{
					TabNode tabNode = (TabNode)get(i);
					
					if( tabNode.isParent(aTabID) )
					{
							parentNode = getParentNode(tabNode, aTabID);
							break;
					}
				}
		}
		return parentNode;
	}

	private TabNode getParentNode(TabNode aTabNode, String aTabID)
	{
		// 6.1 lastIndexOf("6.1.1")
		String parentID = aTabID.substring(0, aTabID.lastIndexOf(MENU_SEPARATOR));
		//System.out.println("parentID="+parentID + ", aTabID="+aTabID);		
		
		if(parentID.equals(aTabNode.getTabID()))
		{
			return aTabNode;
		}
		else
		{
			ArrayList children = aTabNode.getChildren();
			
			if(children != null)
			for(int count=0;count<children.size();count++)
			{
				TabNode tabNode = (TabNode)children.get(count);
				
				if( tabNode.isParent(aTabID) )
				{
						return getParentNode(tabNode, aTabID);
				}
			}
		}
		
		return aTabNode;
	}


	public String getBgColor(int level)
	{
		if(bgColorArray.length >= level)
			return bgColorArray[level-1];
		else
			return bgColorArray[bgColorArray.length-1];
	}

	public String getStyle(int level)
	{
		if(styleArray.length >= level)
			return styleArray[level-1];
		else
			return styleArray[styleArray.length-1];
	}

	public String getSelbgColor(int level)
	{
		if(selBgColorArray.length >= level)
			return selBgColorArray[level-1];
		else
			return selBgColorArray[selBgColorArray.length-1];
	}

	public String getSelstyle(int level)
	{
		if(selStyleArray.length >= level)
			return selStyleArray[level-1];
		else
			return selStyleArray[selStyleArray.length-1];
	}

	public void setSelected(String aTabID)
	{
		
		TabNode parentNode=null;
		if(aTabID != null)
		{
				for(int i=0;i<size();i++)
				{
					TabNode tabNode = (TabNode)get(i);
					
					if( tabNode.isParent(aTabID) )
					{
							setSelected(tabNode, aTabID);
							break;
					}
				}
		}
		
		if(parentNode != null) parentNode.setSelected(aTabID); 
		addToMultiLevelList(this);
	}
	
	private void setSelected(TabNode aTabNode, String aTabID)
	{
		// 6.1 lastIndexOf("6.1.1")
		int lastIndex = (aTabID.lastIndexOf(MENU_SEPARATOR)>-1)?aTabID.lastIndexOf(MENU_SEPARATOR):aTabID.length()-1;
		String parentID = aTabID.substring(0, lastIndex);
		System.out.println("parentID="+parentID + ", aTabID="+aTabID);		
		
		if(parentID.equals(aTabNode.getTabID()))
		{
			aTabNode.setSelected(aTabID);
			System.out.println("BEGIN=> setSelected="+aTabNode.getTabID());
			return;
		}
		else
		{
			ArrayList children = aTabNode.getChildren();
			
			if(children != null)
			for(int count=0;count<children.size();count++)
			{
				TabNode tabNode = (TabNode)children.get(count);
				
				if( tabNode.isParent(aTabID) )
				{
						setSelected(tabNode, aTabID);
				}
			}
		}
		
		if(aTabNode != null) aTabNode.setSelected(aTabID);
		System.out.println("END=> setSelected="+aTabNode.getTabID());
		
	}

	public ArrayList getMultiLevelList()
	{
		return multiLevelList; 
	}

	public void addToMultiLevelList(ArrayList children)
	{
		if(children != null && children.size() > 0)
			multiLevelList.add(0, children);
	}
}
