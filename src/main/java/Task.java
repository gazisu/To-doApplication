import java.util.Date;

public class Task {
    private String taskname;
    private String description;
    private Date duedate;
    private Boolean Completed;

    public Task(String taskname, String description, Date duedate) {
        this.taskname = taskname;
        this.description = description;
        this.duedate = duedate;
        this.Completed = false;
    }

    public String getTaskname(){
        return taskname;
    }
    public void setTasknamem(String taskname){
        this.taskname=taskname;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public Date getduedate(){
        return (Date) duedate;
    }
    public void setDuedate(Date duedate){
        this.duedate= (Date) duedate;
    }
    public Boolean getCompleted(){
        return Completed;
    }

    public void setCompleted(Boolean completed) {
        Completed = completed;
    }
}

