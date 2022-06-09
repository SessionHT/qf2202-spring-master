package com.cos.s1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: COS
 * @time: 2022/6/2 11:16
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
   private String address;
   public void live(){
       System.out.println("我就住"+address);
   }
}
