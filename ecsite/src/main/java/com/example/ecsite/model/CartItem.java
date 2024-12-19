package com.example.ecsite.model;

public class CartItem {
    private Product product; // 商品情報
    private int quantity;    // 商品の数量

    // コンストラクタ
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // 商品を取得するための Getter
    public Product getProduct() {
        return product;
    }

    // 商品を設定するための Setter
    public void setProduct(Product product) {
        this.product = product;
    }

    // 数量を取得するための Getter
    public int getQuantity() {
        return quantity;
    }

    // 数量を設定するための Setter
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
