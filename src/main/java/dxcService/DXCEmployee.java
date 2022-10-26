package dxcService;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class DXCEmployee {
	public static String SUCCESS = "employee added successfully";

	public int dxcId;
	public String name;
	public String mailId;

	public DXCEmployee(int dxcId, String name, String mailId) {
		super();
		this.dxcId = dxcId;
		this.name = name;
		this.mailId = mailId;
	}
}