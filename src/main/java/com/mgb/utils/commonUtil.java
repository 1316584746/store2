package com.mgb.utils;

/**
 * @auther 煤小二
 * @Date 2019/10/12 16:20
 */
public class commonUtil {
     public  static  String creatEmplNum(Integer level,String emplNum){

          //判断是否走0001开始, emplNum是否为空
         if(emplNum ==null|| emplNum.isEmpty()){
             return  (level.equals(99) ? "GL" : "SY")+"0001";
         }
         //如果emplNum不为空  需要自增SY0001
         //拆分emplNum 把字母和数字拆开
         if(!emplNum.startsWith("GL") && !emplNum.startsWith("SY")){
             //说明不存在
             return  null;
         }
         //获得员工编号的前缀:英文字母
         String prefix= emplNum.substring(0,2);
         //获得编号的后缀:数字
         String suffix=emplNum.substring(2);
         //将后缀的数字字符转换为数字整形
         Integer suffixnum = Integer.valueOf(suffix);
         //编号进行自动增加
         suffixnum++;
         //高位补0;
         //注意:a=001,执行a++后 a 的值是 2!!
         int length = (suffixnum + "").length();
         //返回员工的编号 后得到新的后缀
         String  newsuffix =""+suffixnum;
         for (int i = 0; i <4-length ; i++) {
             newsuffix="0"+newsuffix;
         }
         return  prefix+newsuffix;
     }


}
