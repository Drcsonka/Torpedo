package controller;

import javafx.beans.property.SimpleStringProperty;

public class teszt {
    private SimpleStringProperty productName;
    private SimpleStringProperty productPrice;

        public teszt(String productName, String productPrice){
            this.productName = new SimpleStringProperty(productName);
            this.productPrice = new SimpleStringProperty(productPrice);
        }

        public String getProductName(){
            return productName.get();
        }
        public void setProductName(String productName){
            this.productName = new SimpleStringProperty(productName);
        }

        public String getProductPrice(){
            return productPrice.get();
        }

        public void setProductPrice(String productPrice){
            this.productPrice = new SimpleStringProperty(productPrice);
        }
}
