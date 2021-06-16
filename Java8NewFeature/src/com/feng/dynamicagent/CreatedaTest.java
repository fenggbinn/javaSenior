package com.feng.dynamicagent;

import org.junit.Test;

public class CreatedaTest {
    @Test
    public void test(){
        AntaClothFactory an = new AntaClothFactory();
        ClothFactory clo = new ProxyClothFactory(an);
        clo.ProduceCloth();
    }
}

class ProxyClothFactory implements ClothFactory{
    private ClothFactory factory;

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void ProduceCloth() {
        System.out.println("开始生产衣服了");
        factory.ProduceCloth();
        System.out.println("代理工厂生产完成了");
    }
}

class AntaClothFactory implements ClothFactory{
    @Override
    public void ProduceCloth() {
        System.out.println("安踏生产衣服");
    }
}