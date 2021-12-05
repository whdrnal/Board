package com.pjg.exam.board;

import java.util.ArrayList;
import java.util.List;

public class UsrBookController {
  private int id = 0;
  private int bookLastId;
  private List<Book> books;

  UsrBookController() {
    bookLastId = 0;
    books = new ArrayList<>();
    books.add(new Book(id, "제목" + id, "내용" + id));

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
  public void bookActionWrite(Rq rq) {
    System.out.println("- 책생성 -");
    System.out.printf("책이름: ");
    String bookName = Container.sc.nextLine();
    System.out.printf("책 출판사: ");
    String bookAddress = Container.sc.nextLine();

    int id = bookLastId + 1;
    bookLastId = id;

    System.out.printf("%d번 책이 생성되었다.\n", id);

    Book book = new Book(id, bookName, bookAddress);
    books.add(book);
    }

  public void bookActionList(Rq rq) {

    makeTestData();
    System.out.println("나와랏");
  }
}


