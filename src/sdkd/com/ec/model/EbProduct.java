package sdkd.com.ec.model;

/**
 * Created by sdust on 2016/7/6.
 */
public class EbProduct {
    private Integer ep_id;
    private String ep_name;
    private String ep_description;
    private double ep_price;
    private Integer ep_stock;
    private Integer epc_id;
    private Integer ep_views;
    private Integer epc_child_id;
    private String ep_file_name;
    private int ep_discount;
    public int getEp_discount() {
        return ep_discount;
    }

    public void setEp_discount(int ep_discount) {
        this.ep_discount = ep_discount;
    }


    public Integer getEp_views() {
        return ep_views;
    }

    public void setEp_views(Integer ep_views) {
        this.ep_views = ep_views;
    }

    public Integer getEp_id() {
        return ep_id;
    }

    public void setEp_id(Integer ep_id) {
        this.ep_id = ep_id;
    }

    public String getEp_description() {
        return ep_description;
    }

    public void setEp_description(String ep_description) {
        this.ep_description = ep_description;
    }

    public String getEp_file_name() {
        return ep_file_name;
    }

    public void setEp_file_name(String ep_file_name) {
        this.ep_file_name = ep_file_name;
    }

    public String getEp_name() {
        return ep_name;
    }

    public void setEp_name(String ep_name) {
        this.ep_name = ep_name;
    }

    public double getEp_price() {
        return ep_price;
    }

    public void setEp_price(double ep_price) {
        this.ep_price = ep_price;
    }

    public Integer getEp_stock() {
        return ep_stock;
    }

    public void setEp_stock(Integer ep_stock) {
        this.ep_stock = ep_stock;
    }

    public Integer getEpc_child_id() {
        return epc_child_id;
    }

    public void setEpc_child_id(Integer epc_child_id) {
        this.epc_child_id = epc_child_id;
    }

    public Integer getEpc_id() {
        return epc_id;
    }

    public void setEpc_id(Integer epc_id) {
        this.epc_id = epc_id;
    }
}
