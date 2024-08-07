package com.mahumane.todolist.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "historic")
public class HistoricModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long historic_id;

    private Long user_id;
    
    private String content_task;

    private String create_dateTime;

    private String end_dateTime;

    private String historic_create_Time;

    public HistoricModel() {
    }

    public HistoricModel(Long historic_id, Long user_id, String content_task, String create_dateTime,
            String end_dateTime, String historic_create_Time) {
        this.historic_id = historic_id;
        this.user_id = user_id;
        this.content_task = content_task;
        this.create_dateTime = create_dateTime;
        this.end_dateTime = end_dateTime;
        this.historic_create_Time = historic_create_Time;
    }

    
    public Long getHistoric_id() {
        return historic_id;
    }

    public void setHistoric_id(Long historic_id) {
        this.historic_id = historic_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getContent_task() {
        return content_task;
    }

    public void setContent_task(String content_task) {
        this.content_task = content_task;
    }

    public String getCreate_dateTime() {
        return create_dateTime;
    }

    public void setCreate_dateTime(String create_dateTime) {
        this.create_dateTime = create_dateTime;
    }

    public String getEnd_dateTime() {
        return end_dateTime;
    }

    public void setEnd_dateTime(String end_dateTime) {
        this.end_dateTime = end_dateTime;
    }

    public String getHistoric_create_Time() {
        return historic_create_Time;
    }

    public void setHistoric_create_Time(String historic_create_Time) {
        this.historic_create_Time = historic_create_Time;
    }

    
}