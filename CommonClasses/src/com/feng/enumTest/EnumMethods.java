package com.feng.enumTest;

import org.junit.Test;

/**
 * Enum类的主要方法:
 * 	values()方法:返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
 * 	valueOf(String str):可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字”。如不是，会有运行时异常:
 * 	lllegalArgumentException。
 * 	tostring():返回当前枚举类对象常量的名称
 */
public class EnumMethods {
    @Test
    public void test1(){
        Season23 season23 = Season23.SUMMER;
        System.out.println(season23);

        System.out.println("-----------------------");

        Season23[] values = Season23.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        System.out.println("------------------------");

        Season23 valueOf = Season23.valueOf("WINTER");
        System.out.println(valueOf);
    }
}

enum Season23{
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","冰天雪地");
    private final String seasonName;
    private final String seasonDesc;

    private Season23(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }



    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }


}