package ro.ase.acs.builder;

import java.util.Date;

public class ProductBuilderV2 {
    private String name;
    private float price;
    private  long barCode;
    private int quantity;
    private Date expireDate;
    private int discount;
    private  boolean isVeganFriendly;
    private boolean isVegetarianFriendly;
    private boolean isGlutenFree;

    public ProductBuilderV2 addName(String name){
        this.name = name;
        return this;
    }

    public ProductBuilderV2 addPrice(int price){
        this.price = price;
        return this;
    }

    public ProductBuilderV2 addBarCode(long barCode){
        this.barCode = barCode;
        return this;
    }
    public ProductBuilderV2 addQuantity(int quantity){
        this.quantity = quantity;
        return this;
    }

    public ProductBuilderV2 addExpireDate(Date date){
        this.expireDate = date;
        return this;
    }

    public ProductBuilderV2 addDiscount(int discount){
        this.discount = discount;
        return this;
    }

    public ProductBuilderV2 addIsVeganFriendly(boolean isVegan){
        this.isVeganFriendly = isVegan;
        return this;
    }
    public ProductBuilderV2 addIsVegetarianFriendly(boolean isVegetarian){
        this.isVegetarianFriendly = isVegetarian;
        return this;
    }
    public ProductBuilderV2 addIsGlutenFree(boolean isGlutenFree){
        this.isGlutenFree = isGlutenFree;
        return this;
    }

    public Product build(){

        return new Product(name, price, barCode, quantity, expireDate, discount,isVeganFriendly, isVegetarianFriendly, isGlutenFree);
    }

}
