package mavenTest.pojo;

public class Order {
    private int o_id;
    private String o_name;
    private String o_date;
    private double o_price;
    private String o_user;

    public void setO_id(int o_id) { this.o_id = o_id; }
    public void setO_name(String o_name) { this.o_name = o_name; }
    public void setO_date(String o_date) { this.o_date = o_date; }
    public void setO_price(double o_price) { this.o_price = o_price; }
    public void setO_user(String o_user) { this.o_user = o_user; }

    public int getO_id() { return o_id; }
    public String getO_name() { return o_name; }
    public String getO_date() { return o_date; }
    public double getO_price() { return o_price; }
    public String getO_user() { return o_user; }

    @Override
    public String toString() {
        return o_id + "\t" + o_name + "\t" + o_date + "\t" + o_price + "\t" + o_user;
    }
}
