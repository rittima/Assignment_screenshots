package CollectionAssignments;

public class ProductClasss {
    String proname;
    String probrand;
    Integer prosize;

    public ProductClasss(String proname,String probrand, Integer prosize) {
        this.proname = proname;
        this.probrand = probrand;
        this.prosize = prosize;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getProbrand() {
        return probrand;
    }

    public void setProbrand(String probrand) {
        this.probrand = probrand;
    }

    public Integer getProsize() {
        return prosize;
    }

    public void setProsize(Integer prosize) {
        this.prosize = prosize;
    }
    @Override
   public String toString() {
        return "ProductClasss{" +
                "proname='" + proname + '\'' +
                ", probrand='" + probrand + '\'' +
                ", prosize=" + prosize +
                '}';
    }
}