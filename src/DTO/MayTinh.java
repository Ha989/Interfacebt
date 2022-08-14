package DTO;

import java.util.Date;

public class MayTinh extends BaseObject {
    private  Long idMay;
    private String tenMay;
    private int quantity;
    private float price;


    public MayTinh() {
    }

    public MayTinh(Long id, Date creatDate) {
        super(id, creatDate);
    }

    public MayTinh(Long idMay, String tenMay, int quantity, float price) {
        this.idMay = idMay;
        this.tenMay = tenMay;
        this.quantity = quantity;
        this.price = price;
    }

    public MayTinh(Long id, Date creatDate, Long idMay, String tenMay, int quantity, float price) {
        super(id, creatDate);
        this.idMay = idMay;
        this.tenMay = tenMay;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getIdMay() {
        return idMay;
    }

    public void setIdMay(Long idMay) {
        this.idMay = idMay;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
