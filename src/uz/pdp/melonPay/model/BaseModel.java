package uz.pdp.melonPay.model;

public abstract class BaseModel {
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
