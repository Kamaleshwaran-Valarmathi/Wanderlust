package com.example.Wanderlust.models;

import com.example.Wanderlust.models.enums.Membership;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Passenger extends BaseModel {
    private String name;
    private Long number;
    private Long balance;
    private Membership membership;


    public Passenger(Long id, String name, Long number, Long balance, Membership membership) {
        super(id);
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.membership = membership;
    }


    public Double calculateDiscountedPrice(double price) {
        return switch (membership) {
            case PREMIUM -> PremiumMembership.calculateDiscountedPrice(price);
            case GOLD -> GoldMembership.calculateDiscountedPrice(price);
            case STANDARD -> StandardMembership.calculateDiscountedPrice(price);
        };
    }
}
