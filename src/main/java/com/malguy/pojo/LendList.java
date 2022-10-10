package com.malguy.pojo;

public class LendList {

 private Long id;
 private long bookId;
 private long readerId;
 private java.sql.Date lendDate;
 private java.sql.Date backDate;
 private long backType;
 private String backRemarks;


 public long getId() {
   return id;
 }

 public void setId(long id) {
   this.id = id;
 }


 public long getBookId() {
   return bookId;
 }

 public void setBookId(long bookId) {
   this.bookId = bookId;
 }


 public long getReaderId() {
   return readerId;
 }

 public void setReaderId(long readerId) {
   this.readerId = readerId;
 }


 public java.sql.Date getLendDate() {
   return lendDate;
 }

 public void setLendDate(java.sql.Date lendDate) {
   this.lendDate = lendDate;
 }


 public java.sql.Date getBackDate() {
   return backDate;
 }

 public void setBackDate(java.sql.Date backDate) {
   this.backDate = backDate;
 }


 public long getBackType() {
   return backType;
 }

 public void setBackType(long backType) {
   this.backType = backType;
 }


 public String getBackRemarks() {
   return backRemarks;
 }

 public void setBackRemarks(String backRemarks) {
   this.backRemarks = backRemarks;
 }

}
