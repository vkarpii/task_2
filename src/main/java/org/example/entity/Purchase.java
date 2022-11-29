package org.example.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Purchase {
    protected String name;
    protected double cost;
}
