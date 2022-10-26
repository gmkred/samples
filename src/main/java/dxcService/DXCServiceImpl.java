package dxcService;

import java.util.HashSet;
import java.util.Set;

@javax.jws.WebService
public class DXCServiceImpl implements DXCService {

	DXCEmployee de = null;

	Set<DXCEmployee> employees = new HashSet<DXCEmployee>();

	@Override
	public String saveEmployee(int dxcid, String name, String mailid) {

		for (DXCEmployee obj : employees) {
			if (dxcid == obj.dxcId) {
				return "employee id already exists";
			}
		}
		employees.add(new DXCEmployee(dxcid, name, mailid));
		return DXCEmployee.SUCCESS;
	}

	@Override
	public DXCEmployee getEmployee(int dxcid) {

		for (DXCEmployee temp : employees) {
			if (temp.dxcId == dxcid)
				return temp;
		}
		return de;
	}

}
