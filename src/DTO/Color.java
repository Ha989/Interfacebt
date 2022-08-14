package DTO;

import java.util.Date;

public class Color extends BaseObject{
    private Long colorId;
    private String tenMau;

    public Color() {
    }

    public Color(Long id, Date creatDate) {
        super(id, creatDate);
    }


    public Color(Long colorId, String tenMau) {
        this.colorId = colorId;
        this.tenMau = tenMau;
    }

    public Color(Long id, Date creatDate, Long colorId, String tenMau) {
        super(id, creatDate);
        this.colorId = colorId;
        this.tenMau = tenMau;
    }

    public Long getColorId() {
        return colorId;
    }

    public void setColorId(Long colorId) {
        this.colorId = colorId;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }
}
