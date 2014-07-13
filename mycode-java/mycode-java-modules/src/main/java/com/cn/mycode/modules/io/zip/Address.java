package com.cn.mycode.modules.io.zip;

import java.io.Serializable;


/**
 * <B>文件名称：</B>Address.java<BR>
 * <B>文件描述：</B><BR>
 * <BR>
 * <B>版权声明：</B>(C)2014-2015<BR>
 * <B>公司部门：</B> <BR>
 * <B>创建时间：</B>2014年7月13日<BR>
 * 
 * @author 高振鹏 gaozhenpeng@aliyun.com
 * @version 
 */
public class Address implements Serializable{

    String street;
    String country;

    public void setStreet(String street){
        this.street = street;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getStreet(){
        return this.street;
    }

    public String getCountry(){
        return this.country;
    }

    @Override
    public String toString() {
        return new StringBuffer(" Street : ")
        .append(this.street)
        .append(" Country : ")
        .append(this.country).toString();
    }

}
