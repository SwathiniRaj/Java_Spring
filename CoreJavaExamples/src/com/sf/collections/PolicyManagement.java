package com.sf.collections;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class PolicyManagement {

	public PolicyManagement() {
		// TODO Auto-generated constructor stub
	}

	HashMap<Integer, PolicyInfo> policies = new HashMap<Integer, PolicyInfo>();

	public boolean issuePolicy(PolicyInfo policy) {
		policies.put(policy.getPolicynumber(), policy);
		return true;
	}

	public boolean renewPolicy(Integer policyNumber) {
		if (policies.containsKey(policyNumber)) {
			PolicyInfo policy = policies.get(policyNumber);
			policy.setIssueDate(new Date());

			Calendar calender = Calendar.getInstance();
			calender.add(Calendar.YEAR, 1);
			Date expDate = calender.getTime();
			policy.setExpireDate(expDate);
			return true;
		} else {
			return false;
		}

	}
	
	public boolean cancelPolicy(Integer policyNumber) {
		if (policies.containsKey(policyNumber)) {
			policies.remove(policyNumber);
			return true;
		} else {
			return false;
		}
		}
	
	public HashMap<Integer,PolicyInfo> displayPolicies() {
		return policies;
	}
}
