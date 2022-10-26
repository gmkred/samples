package dxcService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface DXCService {

	@WebMethod(operationName = "Add_Employee_Details")
	public String saveEmployee(int dxcid, String name, String mailid);

	@WebMethod(operationName = "Get_Employee_Details")
	public DXCEmployee getEmployee(int dxcid);
}
