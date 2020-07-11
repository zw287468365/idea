package springboot.demo.POJO;

import java.util.Date;

/**
 * @author wei
 * @date 2020/7/6 0006 -  21:04
 */
public class sbinfoPOJO {
    //http://localhost:8080/sbinfo/insert?sbmc=4&sblxid=4&sbjg=4444&sblxmc=4
    Integer id;
    String sbmc;
    Integer sblxid;
    Date sbscrq;
    double sbjg;
    sblx sbl;

    public sblx getSbl() {
        return sbl;
    }

    public void setSbl(sblx sbl) {
        this.sbl = sbl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSbmc() {
        return sbmc;
    }

    public void setSbmc(String sbmc) {
        this.sbmc = sbmc;
    }

    public int getSblxid() {
        return sblxid;
    }

    public void setSblxid(int sblxid) {
        this.sblxid = sblxid;
    }

    public Date getSbscrq() {
        return sbscrq;
    }

    public void setSbscrq(Date sbscrq) {
        this.sbscrq = sbscrq;
    }

    public double getSbjg() {
        return sbjg;
    }

    public void setSbjg(double sbjg) {
        this.sbjg = sbjg;
    }

    @Override
    public String toString() {
        return "sbinfoPOJO{" +
                "id=" + id +
                ", sbmc='" + sbmc + '\'' +
                ", sblxid=" + sblxid +
                ", sbscrq=" + sbscrq +
                ", sbjg=" + sbjg +
                ", sbl=" + sbl +
                '}';
    }
}
