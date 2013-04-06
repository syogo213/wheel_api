package com.counters_spell.counter.api.titlelist;

import java.util.List;

public class TitleListResponse {

	List<TitleListResponseList> resultSet;
	String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<TitleListResponseList> getResultSet() {
		return resultSet;
	}

	public void setResultSet(List<TitleListResponseList> resultSet) {
		this.resultSet = resultSet;
	}
	
}
