package manyTomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int eid;
	private String ename;
	@ManyToMany
	private List<Project> project;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", project=" + project + "]";
	}
	

}
