package com.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)
public class Dept {
    private Long deptno;
    private String dname;
    private String db_source;

    public static void main(String[] args) {
        Dept aa = new Dept();
    }
}
