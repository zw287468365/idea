package springboot.demo.POJO;

/**
 * @author wei
 * @date 2020/7/7 0007 -  10:14
 */
public class sblx {
    Integer id;
    String sblxmc;

    public sblx(Integer id, String sblxmc) {
        this.id=id;
        this.sblxmc=sblxmc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSblxmc() {
        return sblxmc;
    }

    public void setSblxmc(String sblxmc) {
        this.sblxmc = sblxmc;
    }

    @Override
    public String toString() {
        return "sblx{" +
                "id=" + id +
                ", sblxmc='" + sblxmc + '\'' +
                '}';
    }
}
