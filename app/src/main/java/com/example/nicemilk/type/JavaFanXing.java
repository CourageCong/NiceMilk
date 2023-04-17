package com.example.nicemilk.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fucong on 2023/4/12
 * Usage:
 * Doc:
 */
public class JavaFanXing {
    public class Math<T>{
        T num;
        public T getNum(){
            return num;
        }
    }

    public class I extends Math<Integer>{
        @Override
        public Integer getNum() {
            return super.getNum();
        }
    }

    public class Car<T> extends Math{
        @Override
        public Object getNum() {//todo 没有声明泛型类型时用Object填充了
            return super.getNum();
        }
    }

    //------
    public class Fruit{
        public String name;
        public String getName(){
            return name;
        }
    }

    public class Banana extends Fruit implements Serializable{}

    public class Factory<T extends Fruit& Serializable>{
        public T getFruit(T t){
            return t;
        }
    }


    Factory f = new Factory<Banana>();

    /**
     * 泛型函数
     * */
    public static <B> B getB(B b){
        return b;
    }

    public void fun(){
        JavaFanXing.<Integer>getB(3);
        getB(4);
    }

    public static <T> List<T> parseData(String json, Class<T> clazz){
        return new ArrayList<T>();
    }

    public <C> C[] getArray(C... data){
        return data;
    }
}
