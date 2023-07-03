package researchportal.Springresearchportal.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="users_table")
@Entity(name="User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@NonNull
	String username;
	@NonNull
	String email;
	@NonNull
	String password;
	@NonNull
	String phonenum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public User(int id, String username, String email, String password, String phonenum) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.phonenum = phonenum;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", phonenum=" + phonenum + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
