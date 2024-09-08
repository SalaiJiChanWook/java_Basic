package Project;

public class Product {
    private String productID, productName, receivedDate, productType;
    private int productLength, productWidth, productHeight, quantity;
    private String rack, bay;

    //constructor
    public Product(String productID, String productName, String productType, 
            int productLength, int productWidth, int productHeight, 
            int quantity, String receivedDate, String rack, String bay) {
        this.productID = productID;
        this.productName = productName;
        this.productType = productType;
        this.productLength = productLength;
        this.productWidth = productWidth;
        this.productHeight = productHeight;
        this.quantity = quantity;
        this.receivedDate = receivedDate;
        this.rack = rack;
        this.bay = bay;
    }

    //getter and setter methods
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductLength() {
        return productLength;
    }

    public void setProductLength(int productLength) {
        this.productLength = productLength;
    }

    public int getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(int productWidth) {
        this.productWidth = productWidth;
    }

    public int getProductHeight() {
        return productHeight;
    }

    public void setProductHeight(int productHeight) {
        this.productHeight = productHeight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getRack() {
        return rack;
    }

    public void setRack(String rack) {
        this.rack = rack;
    }

    public String getBay() {
        return bay;
    }

    public void setBay(String bay) {
        this.bay = bay;
    }
}
