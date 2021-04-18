package com.example.demo.service;


//@FunctionalInterface
public interface HelloWorldService {
     void hello();
    default void defaultTest(){
         System.out.println("HelloWorldService.defaultTest");
    }
     static void staticTest(){
          System.out.println("HelloWorldService.staticTest");
     }
}
