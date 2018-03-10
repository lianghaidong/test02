package com.itheima.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:HelloStruts <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 上午10:58:38 <br/>       
 */
public class HelloStruts extends ActionSupport {
	
	private String  id;
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public String findById(){
		return SUCCESS;
	}
}
  
