package com.mgb.dto;

/**
 * @auther 煤小二
 * @Date 2019/10/4 16:55
 *
 * dto:数据传输
 */


public class ResultDto<T> {
   private  Integer code;
   private  String  msg;
   /**
    * 返回前端的数据
    */
   private  T data;

   public ResultDto() {
   }

   public ResultDto(Integer code, String msg) {
      this.code = code;
      this.msg = msg;
   }

   public ResultDto(Integer code, String msg, T data) {
      this.code = code;
      this.msg = msg;
      this.data = data;
   }

   public Integer getCode() {
      return code;
   }

   public void setCode(Integer code) {
      this.code = code;
   }

   public String getMsg() {
      return msg;
   }

   public void setMsg(String msg) {
      this.msg = msg;
   }

   public T getData() {
      return data;
   }

   public void setData(T data) {
      this.data = data;
   }

   @Override
   public String toString() {
      return "ResultDto{" +
              "code=" + code +
              ", msg='" + msg + '\'' +
              ", data=" + data +
              '}';
   }
}
