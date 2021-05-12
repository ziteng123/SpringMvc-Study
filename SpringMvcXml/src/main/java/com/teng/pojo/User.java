package com.teng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 全参构造
@NoArgsConstructor // 无参构造
public class User {
    private int id;
    private String name;
}
