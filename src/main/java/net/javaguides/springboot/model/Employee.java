package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class 	Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;

	@Column(name = "bookpages")
	private String bookpages;

	@Column(name = "booktype")
	private String booktype;

	@Column(name = "completionstate")
	private String completionstate;

	@Column(name = "email")
	private String email;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBooktype(String booktype) { this.booktype = booktype;}
	public String getBooktype() {return booktype;}
	public void setCompletionstate(String completionstate) {this.completionstate = completionstate;}
	public String getCompletionstate() {return completionstate;}
	public String getBookpages() {
		return bookpages;
	}
	public void setBookpages(String bookpages) {
		this.bookpages = bookpages;
	}


	}



