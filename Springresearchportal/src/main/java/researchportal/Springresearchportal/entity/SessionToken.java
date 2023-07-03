package researchportal.Springresearchportal.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="sessiontoken")
@Entity(name="Sessiontoken")
public class SessionToken {
	@Id
	int id;
	@NonNull
	String sessiontoken;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSessiontoken() {
		return sessiontoken;
	}
	public void setSessiontoken(String sessiontoken) {
		this.sessiontoken = sessiontoken;
	}
	public SessionToken(int id, String sessiontoken) {
		super();
		this.id = id;
		this.sessiontoken = sessiontoken;
	}
	@Override
	public String toString() {
		return "SessionToken [id=" + id + ", sessiontoken=" + sessiontoken + "]";
	}
	public SessionToken() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
