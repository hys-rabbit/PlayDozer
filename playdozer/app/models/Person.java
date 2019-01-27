package models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.UpdatedTimestamp;

@Entity
public class Person extends Model {
	@Id
	public Long id;
	public String name;
	public BigDecimal amount;
	@UpdatedTimestamp
	public LocalDateTime date;
}
