package com.cn.mycode.modules.io.zip;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;


/**
 * <B>文件名称：</B>GzipUtils.java<BR>
 * <B>文件描述：</B><BR>
 * <BR>
 * <B>版权声明：</B>(C)2014-2015<BR>
 * <B>公司部门：</B> <BR>
 * <B>创建时间：</B>2014年7月13日<BR>
 * 
 * @author 高振鹏 gaozhenpeng@aliyun.com
 * @version 
 */
public class GzipUtils implements Serializable{

    public void serializeAddress(String street, String country){
        
        Address address = new Address();
        address.setStreet(street);
        address.setCountry(country);
  
        try{
  
            FileOutputStream fos = new FileOutputStream("D:/apk/20.apk");
            GZIPOutputStream gz = new GZIPOutputStream(fos);
  
            ObjectOutputStream oos = new ObjectOutputStream(gz);
  
            oos.writeObject(address);
            oos.close();
  
            System.out.println("Done");
  
        }catch(Exception ex){
            ex.printStackTrace();
        }     
    }
    
    public static void main(String[] args) {

        GzipUtils gu = new GzipUtils();
        gu.serializeAddress("hello", "word");
    }
    
}
