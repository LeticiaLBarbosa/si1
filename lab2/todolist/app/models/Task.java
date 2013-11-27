package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model {

	@Id
	public Long id;

	@Required
	public String label, project, description;
	
	@Required
	public int priority;
	
	private boolean done = false;

	public static Finder<Long, Task> find = new Finder(Long.class, Task.class);

	public static List<Task> all() {
		return find.all();
	}

	public static void create(Task task) {
		task.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}
	
	public static void makeItDone(Long id){
		Task activity = find.ref(id);
		
		activity.setDone(true);
		create(activity);
	}

	public Long getId() {
		return id;
	}

	public int getPriority() {
		return priority;
	}

	public String getLabel() {
		return label;
	}

	public String getProject() {
		return project;
	}
	
	public String getDescription() {
		return description;
	}
	
	public boolean isDone(){
		return done;
	}
	
	public void setDone(boolean done){
		this.done = done;
	}

}