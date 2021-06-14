package sample.Service;

public class BooleanRoom {
    private  Boolean status;

    public String getStatus() {
        if (status){
            return "Đang sử dụng";
        }else {
            return "Trống";
        }
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public BooleanRoom(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return getStatus();
    }
}
