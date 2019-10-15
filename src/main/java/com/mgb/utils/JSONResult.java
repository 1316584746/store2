package com.mgb.utils;



public class JSONResult {
     //success默认值为true
    private boolean success = true ;
    //msg获取后端传递给前端的消息
    private String msg;

    public JSONResult(boolean success, String msg) {
        super();
        this.success = success;
        this.msg = msg;
    }

    public JSONResult(String msg) {
        super();
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public JSONResult() {
        super();
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean getSuccess() {
        return success;
    }
}
