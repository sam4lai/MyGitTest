package service;

import java.util.List;
import entity.TVehicles;

public interface VehicleListService {
	public List<TVehicles> getVehicleByPage(String conditionStr,int pageNum,int numPerPage);
    public int getTotalRecord(String ConditionStr);

}
