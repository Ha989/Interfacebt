package DTO;

import java.util.Date;

public abstract class BaseObject {
    private Long id;
    private Date CreatDate;

    public BaseObject() {
    }

    public BaseObject(Long id, Date creatDate) {
        this.id = id;
        CreatDate = creatDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatDate() {
        return CreatDate;
    }

    public void setCreatDate(Date creatDate) {
        CreatDate = creatDate;
    }
    }

