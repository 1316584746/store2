package com.mgb.pojo;


public class Event {

  private long etNo;
  private String etTypename;
  private String etDescript;
  private long etState;


  public long getEtNo() {
    return etNo;
  }

  public void setEtNo(long etNo) {
    this.etNo = etNo;
  }


  public String getEtTypename() {
    return etTypename;
  }

  public void setEtTypename(String etTypename) {
    this.etTypename = etTypename;
  }


  public String getEtDescript() {
    return etDescript;
  }

  public void setEtDescript(String etDescript) {
    this.etDescript = etDescript;
  }


  public long getEtState() {
    return etState;
  }

  public void setEtState(long etState) {
    this.etState = etState;
  }

}
