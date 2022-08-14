package DTO;

import java.util.Date;

public class Order extends BaseObject {
    private Long idCustomer;
    private String nameCustomer;
    private String phoneNumber;

    public Order() {
    }

    public Order(Long id, Date creatDate) {
        super(id, creatDate);
    }

    public Order(Long idCustomer, String nameCustomer, String phoneNumber) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.phoneNumber = phoneNumber;
    }

    public Order(Long id, Date creatDate, Long idCustomer, String nameCustomer, String phoneNumber) {
        super(id, creatDate);
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.phoneNumber = phoneNumber;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
