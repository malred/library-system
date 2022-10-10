package com.malguy.pojo;

import javax.xml.soap.SAAJResult;

public class BookInfo {

  private Long id;
  private String code;
  private String name;
  private String author;
  private String publish;
  private String introduction;
  private String language;
  private Double price;
  private java.sql.Date publishDate;
  private Integer typeId;
  private Long status;
  private String typeName;

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public String getPublish() {
    return publish;
  }

  public void setPublish(String publish) {
    this.publish = publish;
  }


  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public java.sql.Date getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(java.sql.Date publishDate) {
    this.publishDate = publishDate;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "BookInfo{" +
            "id=" + id +
            ", code='" + code + '\'' +
            ", name='" + name + '\'' +
            ", author='" + author + '\'' +
            ", publish='" + publish + '\'' +
            ", introduction='" + introduction + '\'' +
            ", language='" + language + '\'' +
            ", price=" + price +
            ", publishDate=" + publishDate +
            ", typeId=" + typeId +
            ", status=" + status +
            ", typeName='" + typeName + '\'' +
            '}';
  }
}
