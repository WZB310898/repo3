package cn.itcast.Test;

public class sdsdsds {
    public static void main(String[] args) {

        String excelYearName = "跨半年执行协议量维护2020下半年 (4dqwddwqqdwqdq).xls";

        if(excelYearName.indexOf("跨半年执行协议量维护")==0){
            String std=excelYearName.substring(10,17);
            System.out.println(std);
        }else {
            String std=excelYearName.substring(10,17);
            System.out.println(std);
        }


        String sddd="2020下半年";

        System.out.println(sddd.substring(0,4));
        System.out.println(sddd.substring(4,7));
        System.out.println(sddd.length());





    }
}
