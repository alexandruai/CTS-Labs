package ro.ase.acs.builder;

import java.util.Date;

public class Product {
    private String name;
    private float price;
    private  long barCode;
    private int quantity;
    private Date expireDate;
    private int discount;
    private  boolean isVeganFriendly;
    private boolean isVegetarianFriendly;
    private boolean isGlutenFree;

    Product(String name, float price, long barCode,
                   int quantity, Date expireDate, int discount, boolean isVeganFriendly,
                   boolean isVegetarianFriendly, boolean isGlutenFree) {
        this.name = name;
        this.price = price;
        this.barCode = barCode;
        this.quantity = quantity;
        this.expireDate = expireDate;
        this.discount = discount;
        this.isVeganFriendly = isVeganFriendly;
        this.isVegetarianFriendly = isVegetarianFriendly;
        this.isGlutenFree = isGlutenFree;
    }

    Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public float getPrice() {
        return price;
    }

//    public void setPrice(float price) {
//        this.price = price;
//    }

    public long getBarCode() {
        return barCode;
    }

//    public void setBarCode(long barCode) {
//        this.barCode = barCode;
//    }

    public int getQuantity() {
        return quantity;
    }

//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }

    public Date getExpireDate() {
        return expireDate;
    }

//    public void setExpireDate(Date expireDate) {
//        this.expireDate = expireDate;
//    }

    public boolean isVeganFriendly() {
        return isVeganFriendly;
    }

//    public void setVeganFriendly(boolean veganFriendly) {
//        isVeganFriendly = veganFriendly;
//    }

    public boolean isVegetarianFriendly() {
        return isVegetarianFriendly;
    }

//    public void setVegetarianFriendly(boolean vegetarianFriendly) {
//        isVegetarianFriendly = vegetarianFriendly;
//    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

//    public void setGlutenFree(boolean glutenFree) {
//        isGlutenFree = glutenFree;
//    }

    // in java ai nestedb classes daca le faci statice in interiorul altei clase
    public static class ProductBuilder{
        private Product product;

        public ProductBuilder() {
            this.product = new Product(null, 0);
        }

        //faci clasa in clasa ca sa ai acces la campuri si cineva din afara nu
        public ProductBuilder addName(String name){
            this.product.name = name;
            return this;
        }

        public ProductBuilder addPrice(int price){
            this.product.price = price;
            return this;
        }

        public ProductBuilder addBarCode(long barCode){
            this.product.barCode = barCode;
            return this;
        }
        public ProductBuilder addQuantity(int quantity){
            this.product.quantity = quantity;
            return this;
        }

        public ProductBuilder addExpireDate(Date date){
            this.product.expireDate = date;
            return this;
        }

        public ProductBuilder addDiscount(int discount){
            this.product.discount = discount;
            return this;
        }

        public ProductBuilder addIsVeganFriendly(boolean isVegan){
            this.product.isVeganFriendly = isVegan;
            return this;
        }
        public ProductBuilder addIsVegetarianFriendly(boolean isVegetarian){
            this.product.isVegetarianFriendly = isVegetarian;
            return this;
        }
        public ProductBuilder addIsGlutenFree(boolean isGlutenFree){
            this.product.isGlutenFree = isGlutenFree;
            return this;
        }

        public Product build(){
            return this.product;
        }
    }
}
