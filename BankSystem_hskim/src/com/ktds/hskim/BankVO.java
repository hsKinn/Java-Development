package com.ktds.hskim;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankVO {
	
	// 은행 초기 자본금
	public static int capital = 400000000;
	
	// 고객 리스트 담을 HashMap
	public Map<String, List<CustomerVO>> loanList = new HashMap<String, List<CustomerVO>>();

} // class end
