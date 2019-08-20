/**
 * 
 */
package com.automobile;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunil.alavilli
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String firstname = "sunil*";
		String firstname2 = "sunil";
		get(firstname);
		get(firstname2);
		
		
		
	}
	
	public static void get(String firstName)
	{
		StringBuffer sb = new StringBuffer("select top ");
		sb.append(" USA_ID, USA_FIRST_NAME,USA_LAST_NAME, USA_POSTAL_CODE, ");
		sb.append("USA_SEARCH_EMAIL, USA_BIRTH_MONTH, USA_BIRTH_DAY, USA_SEARCH_STATE, ");
		sb.append("USA_SEARCH_CITY, USA_STATUS_CD, USA_PHONE,USA_GENDER from BI_USER_ACCOUNT ");
		sb.append("with (nolock) where usa_status_cd = 'A' ");
		List<Object> paramList = new ArrayList<Object>();
		sb.append("and usa_first_name like ? ");
        paramList.add(firstName.replace("*", "%").trim());		
        System.out.println(sb.toString());
        System.out.println(paramList.toString());
	}

}
