package com.sf.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			PolicyInfo policy1 = new PolicyInfo(121, "policy1",
					new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2015"),
					new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2050"), 100.00);
			PolicyInfo policy2 = new PolicyInfo(122, "policy2",
					new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2015"),
					new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2050"), 200.00);
			PolicyInfo policy3 = new PolicyInfo(123, "policy3",
					new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2015"),
					new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2050"), 150.00);
			
			PolicyManagement policyManage = new PolicyManagement();
			policyManage.issuePolicy(policy1);
			policyManage.issuePolicy(policy2);
			policyManage.issuePolicy(policy3);
			System.out.println(policyManage.displayPolicies());
			policyManage.renewPolicy(122);
			System.out.println("Renewal policy results");
			System.out.println(policyManage.displayPolicies());
			policyManage.cancelPolicy(123);
			System.out.println("cancel policy results");
			System.out.println(policyManage.displayPolicies());
			
		} catch (ParseException ex) {
			System.out.println(ex);

		}

	}

}
