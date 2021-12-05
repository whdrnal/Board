package com.pjg.exam.board;

import java.util.ArrayList;
import java.util.List;

public class UsrBookController {
  private int bookLastId;
  private List<Book> books;
  private Book book;

  UsrBookController() {
    bookLastId = 0;
    books = new ArrayList<>();

    makeTestData();

    if (books.size() > 0) {
      bookLastId = books.get(books.size() - 1).bookId;
    }
  }

  void makeTestData() {
    for (int i = 0; i < 3; i++) {
      int id = i + 1;
      books.add(new Book(id, "책이름" + id, "bookAddress" + id));
    }
  }
  //이 위로는 저장소
  public void Book(Rq rq) {
    System.out.println("- 책생성 -");
    System.out.printf("책이름 : ");
    String bookName = Container.sc.nextLine();
    System.out.printf("책 출판사 : ");
    String bookAddress = Container.sc.nextLine();

    int id = bookLastId + 1;
    bookLastId = id;

    System.out.printf("%d번 책이 생성되었다.\n",id);

    Member member = new Member(id, bookName, bookAddress);
    books.add(book);
  }
}
