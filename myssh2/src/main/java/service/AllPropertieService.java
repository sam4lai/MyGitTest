package service;
import java.util.List;

import entity.Tallproperties;;

public interface AllPropertieService {
	public List<Tallproperties> getPropertyByGroup(String group);
}
