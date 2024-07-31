package manyTomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	private String pname;
	@ManyToMany
	private List<Emp> emp;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<Emp> getEmp() {
		return emp;
	}
	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", emp=" + emp + "]";
	}
	
	
	
}
