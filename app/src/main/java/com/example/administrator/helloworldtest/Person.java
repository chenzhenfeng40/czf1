package com.example.administrator.helloworldtest;

import java.util.List;

public class Person {
    private String reason;
    private Result result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    @Override
    public String toString() {
        return "Person{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }

    /* private String content;
        private String hashId;
        private int unixtime;
        private int updatetime;*/
  /*  public Person(){
        super();
    }
    public Person(String reason, List<Result> result,int error_code){
        super();
        this.reason = reason;
        this.result = result;
      this.data = data;
        this.content = content;
        this.hashId = hashId;
        this.unixtime = unixtime;
        this.updatetime = updatetime;*//*
        this.error_code=error_code;
    }*/


   /* public String getContent() {
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
        return "Person[reason="+reason+",result="+result+",error_code"+error_code+"]";
    }*/

    static class Result{
    private List<Data> data;

        public List<Data> getData() {
            return data;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "data=" + data +
                    '}';
        }
    }

     static class Data {
         private String content;
         private String hashId;
         private String unixtime;
         private String updatetime;

         public String getContent() {
             return content;
         }

         public void setContent() {
             this.content = content;
         }

         public String getHashId() {
             return hashId;
         }

         public void setHashId() {
             this.hashId = hashId;
         }

         public void setContent(String content) {
             this.content = content;
         }

         public void setHashId(String hashId) {
             this.hashId = hashId;
         }

         public String getUnixtime() {
             return unixtime;
         }

         public void setUnixtime(String unixtime) {
             this.unixtime = unixtime;
         }

         public String getUpdatetime() {
             return updatetime;
         }

         public void setUpdatetime(String updatetime) {
             this.updatetime = updatetime;
         }

         @Override
         public String toString() {
             return "Data{" +
                     "content='" + content + '\'' +
                     ", hashId='" + hashId + '\'' +
                     ", unixtime='" + unixtime + '\'' +
                     ", updatetime='" + updatetime + '\'' +
                     '}';
         }
     }
}




