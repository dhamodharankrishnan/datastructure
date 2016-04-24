package tree.tab;

public interface ITabConstants extends java.io.Serializable
{
	/*
		1) Key Date
		2) Build Agrmnt
		3) EAS
		4) PEG
		5) Franchise Fees
		6) Franchise Mgmt
			a) Service Standard
				i. Outages
			b) Communication
		7) Liability
		8) Billing
	 * 
	 * */
	
	public static final String KEY_DATE = "a";
	public static final String BUILD_AGRMNT = "b";
	public static final String EAS = "c";
	public static final String PEG = "d";
	public static final String FRANC_FEES = "e";
	public static final String FRANC_MGMT = "f";
		public static final String FRANC_MGMT_SERV_STD ="f.1";
			public static final String FRANC_MGMT_SERV_STD_OUTAGES = "f.1.1";
		public static final String FRANC_MGMT_COMMUNICATION = "f.2";
	public static final String LIABILITY	= "g";
	public static final String BILLING = "h";
	
	
	/**
	 * TD Background colors
	 * The size of the array should be equal to the number of levels.
	 * */
	public static final String BGCOLOR[] = {"#b8cece", "#b8cece", "#b8cece"};
	public static final String SEL_BGCOLOR[] = {"#608c8c", "#608c8c", "#608c8c"};
	//Style constants - These styles have to be defined in the css file.
//	public static final String STYLE[] = {"lfa1-tab", "lfa2-tab", "lfa3-tab"};
//	public static final String SEL_STYLE[] = {"lfa1-selTab", "lfa2-selTab", "lfa3-selTab"};
	public static final String STYLE[] = {"tab", "tab", "tab"};
	public static final String SEL_STYLE[] = {"tab-selected", "tab-selected", "tab-selected"};
	
	public static final String MENU_SEPARATOR = ".";
	/**
	 * 
	 * TabID|Title
	 * ID - Will be auto-generated.
	 * Level - To be decided based on the parsing.
	 * Title - second parameter
	 * 
	 * TabID
	 * <Number>.<Number>.<Number>
	 * 9.9.9 Will support 9 Tabs.
	 * 
	 * The following will support 26 Tabs.
	 * The menuIDs should be specified as <Char>.<Number>.<Number>
	 * eg. a.9.9
	 * 
	 * The order of the tabs is the same as how the tabs are given 
	 * and NOT arranged alphabetically or numerically.
	 * 
	 * Limitations : 
	 * 1) 26 Main tabs are allowed.
	 * 2) And 9 sub tabs are only allowed under each sub levels.
	 * 3) Duplicate TabIDs are not allowed.
	 * 
	 * */
	public static final String[] TAB_ARRAY
	= new String[]
	             {
				  KEY_DATE+"|Key Date",
				  BUILD_AGRMNT +"|Build Agrmnt",
				  "b.1|Sample A",
				  "b.2|Sample B",
				  "b.3|Sample C",
				  "b.3.1|Sample C A",
				  "b.3.5|Sample C A",
				  "b.3.2|Sample C B",
				  "b.3.2.1|Sample C B A",
				  "b.3.2.2|Sample C B B",
				  "b.3.2.3|Sample C B C",
				  "b.3.2.4|Sample C B D",
				  "b.3.2.5|Sample C B E",
				  "b.4|Sample D",
				  "b.5|Sample B 5",
				  "b.5.1|Sample B 5 1",
				  "b.5.2|Sample B 5 2",
				  "b.5.1.1|Sample B 5 1 1",
				  EAS + "|EAS",
				  PEG+"|PEG",
				  FRANC_FEES+ "|Franchise Fees",
				  FRANC_MGMT+"|Franchise Mgmt",
				  FRANC_MGMT_SERV_STD + "|Service Standard",
				  FRANC_MGMT_SERV_STD_OUTAGES+"|Outages",
				  FRANC_MGMT_COMMUNICATION+"|Communication",
				  LIABILITY + "|Liability",
				  BILLING + "|Billing"
				 };
	
	
}
