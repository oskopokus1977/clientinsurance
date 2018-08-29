package com.model;

public class Customer {


    private int id;
    private String surname;
    private String name;
    private String secondName;
    private String address;
    private String cellNumber;
    private String birthDay;
    private int idCode;
    private String docType;
    private String docNumber;
    private String docDate;

    public Customer() {}

    public Customer(int id,
                    String surname,
                    String name,
                    String secondName,
                    String address,
                    String cellNumber,
                    String birthDay,
                    int idCode,
                    String docType,
                    String docNumber,
                    String docDate) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.cellNumber = cellNumber;
        this.birthDay = birthDay;
        this.idCode = idCode;
        this.docType = docType;
        this.docNumber = docNumber;
        this.docDate = docDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }
}
