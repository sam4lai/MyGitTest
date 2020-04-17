package service;

import java.util.List;

import entity.Vclients;

public interface ClinetListService {
	
	public List<Vclients> getClientByPage(String conditionStr,int pageNum,int numPerPage);
    public int getTotalRecord(String ConditionStr);
}
