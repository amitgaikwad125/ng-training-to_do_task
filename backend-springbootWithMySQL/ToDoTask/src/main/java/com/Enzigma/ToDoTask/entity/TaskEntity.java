package com.Enzigma.ToDoTask.entity;


import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todo")
public class TaskEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="assignedto")
	private String user;
	
	@Column(name="status")
	private String status;
	
	@Column(name="duedate")
	LocalDate date;
	
	@Column(name="priority")
	private String priority;
	
	@Column(name="comments")
	private String comment;

	public TaskEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaskEntity(int id, String user, String status, LocalDate date, String priority, String comment) {
		super();
		this.id = id;
		this.user = user;
		this.status = status;
		this.date = date;
		this.priority = priority;
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comment, date, id, priority, status, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskEntity other = (TaskEntity) obj;
		return Objects.equals(comment, other.comment) && Objects.equals(date, other.date) && id == other.id
				&& Objects.equals(priority, other.priority) && Objects.equals(status, other.status)
				&& Objects.equals(user, other.user);
	}

	@Override
	public String toString() {
		return "TaskEntity [id=" + id + ", user=" + user + ", status=" + status + ", date=" + date + ", priority="
				+ priority + ", comment=" + comment + "]";
	}
	
	
	
}
