package com.example.administrator.helloworldtest;

public class Person {
    private String reason;
    private String result;
    private String data;
    private String content;
    private String hashId;
    private int unixtime;
    private int updatetime;
    public Person(){
        super();
    }
    public Person(String reason, String result, String data, String content, String hashId, int unixtime, int updatetime){
        super();
        this.reason = reason;
        this.result = result;
        this.data = data;
        this.content = content;
        this.hashId = hashId;
        this.unixtime = unixtime;
        this.updatetime = updatetime;
    }

    public String getReason() {
        return reason;
    }
    public void setReason(){
       this. reason = reason;
    }

    public String getResult() {
        return result;
    }
    public void setResult(){
        this.result = result;
    }

    public String getContent() {
        return content;
    }
    public void setContent(){
        this.content = content;
    }

    public String getHashId() {
        return hashId;
    }
    public void setHashId(){
        this.hashId =hashId;
    }

    public int getUnixtime() {
        return unixtime;
    }
    public void setUnixtime(){
        this.unixtime = unixtime;
    }

    public int getUpdatetime() {
        return updatetime;
    }
    public void setUpdatetime(){
        this.updatetime = updatetime;
    }
    @Override
    public String toString(){
        return "Person[reason="+reason+",result="+result+",content="+content+",hashId="+hashId+",unixtime="
                +unixtime+",updatetime="+updatetime+"]";
    }
}
