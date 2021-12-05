package com.pjg.exam.board;

public class Book {
  int bookId;
  String bookName;
  String bookAddress;

  public Book(int bookId, String bookName, String bookAddress){
    this.bookId = bookId;
    this.bookName = bookName;
    this.bookAddress = bookAddress;
  }

  @Override
  public String toString(){
    return String.format("bookId: %d , bookName : \"%s\" , bookAddress : \"%s\"",bookId,bookName,bookAddress);
  }
}
