package pack1;

public class Employee
{
	private int eid,esal;
	private String ename;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Employee() {
		super();
		
	}
	public Employee(int eid, int esal, String ename) {
		super();
		this.eid = eid;
		this.esal = esal;
		this.ename = ename;
	}
	
	
}
