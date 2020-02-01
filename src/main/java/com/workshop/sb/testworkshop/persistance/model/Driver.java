package com.workshop.sb.testworkshop.persistance.model;

import com.workshop.sb.testworkshop.model.DriverRequest;


//ini yang urusan dengan database (buat atau lainnya)

import javax.persistence.*;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name= "name",length = 50,nullable = false)
    private String name;

    @Column(name="phone_number", length =20,nullable = false)
    private String phone_number;

    @Column(name="id_number", length = 50,nullable = false)
    private String id_number;

    @Column(name="address", length =300,nullable = false)
    private String address;

    @Column(name="salary", length =10,nullable = false)
    private double salary;

    public Driver(DriverRequest request) {
        this.id = request.getId();
        this.name = request.getName();
        this.phone_number = request.getPhone_number();
        this.id_number = request.getId_number();
        this.address = request.getAddress();
        this.salary = request.getSalary();
    }

    public Driver() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}