package researchportal.Springresearchportal.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="recomendations_table")
@Entity(name="reecomendations")
public class Recomendations {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int rid;
//	@NonNull
	int id;
	@NonNull
	String symbol;
	@NonNull
	String type;
	@NonNull
	String date;
	@NonNull
	String details;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Recomendations(int rid, int id, String symbol, String type, String date, String details) {
		super();
		this.rid = rid;
		this.id = id;
		this.symbol = symbol;
		this.type = type;
		this.date = date;
		this.details = details;
	}
	public Recomendations() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Recomendations [rid=" + rid + ", id=" + id + ", symbol=" + symbol + ", type=" + type + ", date=" + date
				+ ", details=" + details + "]";
	}
	
}
