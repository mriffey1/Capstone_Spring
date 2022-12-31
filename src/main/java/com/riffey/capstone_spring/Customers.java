package com.riffey.capstone_spring;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer_Id")
    private int custId;

    @Column(name = "Customer_Name")
    private String custName;

    @Column(name = "Address")
    private String custAddress;

    @Column(name = "City")
    private String custCity;

    @Column(name = "State")
    private String custState;

    @Column(name = "Postal_Code")
    private String custPostalCode;

    @Column(name = "Phone")
    private String custPhoneNum;

    @Column(name = "Create_Date")
    private LocalDateTime custCreated;

    private String completeAddress;


    protected Customers() {
    }

    protected Customers(int custId, String custName, String custAddress, String custCity, String custState, String custPostalCode, String custPhoneNum, LocalDateTime custCreated) {
        super();
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
        this.custPostalCode = custPostalCode;
        this.custCity = custCity;
        this.custState = custState;
        this.custPhoneNum = custPhoneNum;
        this.custCreated = custCreated;

    }

    protected Customers(String custAddress, String custCity, String custState, String custPostalCode){
        this.custAddress = custAddress;
        this.custPostalCode = custPostalCode;
        this.custCity = custCity;
        this.custState = custState;
    }


    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return this.custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustPostalCode() {
        return custPostalCode;
    }

    public void setCustPostalCode(String custPostalCode) {
        this.custPostalCode = custPostalCode;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        this.custState = custState;
    }

    public String getCustPhoneNum() {
        return custPhoneNum;
    }

    public void setCustPhoneNum(String custPhoneNum) {
        this.custPhoneNum = custPhoneNum;
    }

    public LocalDateTime getCustCreated() {

        return custCreated;
    }

    public void setCustCreated(LocalDateTime custCreated) {
        this.custCreated = custCreated;
    }

    public String convertDate(LocalDateTime custCreated){
        LocalDateTime currentLocalDateTime = getCustCreated();

        // Create DateTimeFormatter instance with specified format
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm a");

        // Format LocalDateTime to String
        String formattedDateTime = currentLocalDateTime.format(dateTimeFormatter);

        return formattedDateTime;
    }

    public String getCompleteAddress() {
        return completeAddress;
    }

    public void setCompleteAddress(String completeAddress) {
        this.completeAddress = completeAddress;
    }

    public String completeAddress(){

        return  this.custAddress + "<br/>" + this.custCity + ", " + this.custState + " " + this.custPostalCode;
    }
}

