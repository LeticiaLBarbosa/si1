package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model implements Comparable{

	@Id
	public Long id;

	@Required
	public String label, project, description;
	
	@Required
	public int priority;
	
	private boolean done = false;

	public static Finder<Long, Task> find = new Finder(Long.class, Task.class);

	public static List<Task> all() {
		List<Task> tasks = find.all();
		Collections.sort(tasks);
		return tasks;
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
	
	@Override
    public int compareTo(Object task) {
             return priority - ((Task) task).getPriority();
    }

}