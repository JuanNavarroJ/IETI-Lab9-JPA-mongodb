package eci.ieti.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Todo {

    //Atributos

    @Id
    private Long id;
    private String description;
    private int priority;
    private Date dueDate;
    private String responsible;
    private String status;

    public Todo() {
    }

    public Todo(Long id, String description, int priority, Date dueDate, String responsible, String status) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.responsible = responsible;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", dueDate=" + dueDate +
                ", responsible='" + responsible + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
