package com.Agility.YamlData;

import java.util.List;
import java.util.Map;

/**
 * This class will load the yaml file data
 * 
 * Key : it will be the name of test case e.g. getToken
 * Value: value are all list of data given for particular test case e.g. for above test case we have 3 test data row in yaml file 
 * 
 */
public class AllTestCaseData {
	
	private Map<String, List<TestData>> allTestCaseDataMap;

	public Map<String, List<TestData>> getAllTestCaseDataMap() {
		return allTestCaseDataMap;
	}

	public void setAllTestCaseDataMap(Map<String, List<TestData>> allTestCaseDataMap) {
		this.allTestCaseDataMap = allTestCaseDataMap;
	}

}
