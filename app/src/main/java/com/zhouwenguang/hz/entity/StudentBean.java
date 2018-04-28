package com.zhouwenguang.hz.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;


@Entity
public class StudentBean {
   @Id
   private Long id;
   private String name;
   private Date date;
   @Generated(hash = 784258390)
   public StudentBean(Long id, String name, Date date) {
       this.id = id;
       this.name = name;
       this.date = date;
   }
   @Generated(hash = 2097171990)
   public StudentBean() {
   }
   public Long getId() {
       return this.id;
   }
   public void setId(Long id) {
       this.id = id;
   }
   public String getName() {
       return this.name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public Date getDate() {
       return this.date;
   }
   public void setDate(Date date) {
       this.date = date;
   }
}
