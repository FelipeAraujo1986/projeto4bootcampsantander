package com.digital.crud.saladereuniao.saladereuinao.model;

import javax.persistence.*;

@Entity
@Table(name = "mettingroom", indexes = {
        @Index(name = "idx_room_id", columnList = "id")
})
public class Room {

    private long id;
    private String name;
    private String date;
    private String startHour;
    private String endHour;

    public Room(){

    }

    public Room (long id, String name, String date, String startHour, String endHour){
        this.id=id;
        this.name=name;
        this.date=date;
        this.startHour=startHour;
        this.endHour=endHour;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name="name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="date", nullable = false)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Column(name="startHour", nullable = false)
    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        startHour = startHour;
    }

    @Column(name="endHour", nullable = false)
    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    @Override
public String toString(){
    return "Room [id-"+id+",name="+name+ ",startHour="+ startHour+ ",endHour="+ endHour+" ]";
}

}