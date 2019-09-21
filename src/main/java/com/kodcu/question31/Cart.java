package com.kodcu.question31;

public class Cart {

    private Long id ;
    private String name;

    public Cart(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
