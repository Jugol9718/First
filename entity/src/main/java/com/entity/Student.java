package com.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zlp
 * @date 14:55  2019/10/22
 */
@Data
@Setter
@Getter
public class Student {
    private String name;
    private String main;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", main='" + main + '\'' +
                '}';
    }
}
