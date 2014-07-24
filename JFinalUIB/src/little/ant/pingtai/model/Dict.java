package little.ant.pingtai.model;

import little.ant.pingtai.annotation.Table;

import org.apache.log4j.Logger;

@Table(tableName="pt_dict")
public class Dict extends BaseModel<Dict> {
	
	private static final long serialVersionUID = 2051998642258015518L;

	private static Logger log = Logger.getLogger(Dict.class);
	
	public static final Dict dao = new Dict();
	
}