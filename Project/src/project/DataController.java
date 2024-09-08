package Project;

public class DataController {
    public String errormessage = "";
    
    public boolean product_register(Product product) {
        DataSave dataSave = new DataSave();
        
        if(product.getProductID().isEmpty()) {
            errormessage = "Product ID is empty.";
            return false;
        }
        if(product.getProductName().isEmpty()) {
            errormessage = "Product Name is empty.";
            return false;
        }
        if(product.getProductLength() == 0) {
            errormessage = "Product Length is incorrect.";
            return false;
        }
        if(product.getProductWidth() == 0) {
            errormessage = "Product Width is incorrect.";
            return false;
        }
        if(product.getProductHeight() == 0) {
            errormessage = "Product Height is incorrect.";
            return false;
        }
        if(product.getQuantity() == 0) {
            errormessage = "Product Quantity is empty.";
            return false;
        }
        
        String productID = product.getProductID();
        String productName = product.getProductName();
        String productType = product.getProductType();
        String productLength = String.valueOf(product.getProductLength());
        String productWidth = String.valueOf(product.getProductWidth());
        String productHeight = String.valueOf(product.getProductHeight());
        String quantity = String.valueOf(product.getQuantity());
        String receivedDate = product.getReceivedDate();
        String rack = product.getRack();
        String bay = product.getBay();
        
        if(dataSave.saveData(new String[] {productID, productName, productType,
                            productLength, productWidth, productHeight,
                            quantity, receivedDate, rack, bay})) {
            return true;
        }
        else {
            errormessage = "Error in saving Product!!!";
            return false;
        }
    }
}
