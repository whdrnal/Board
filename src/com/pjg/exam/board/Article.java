package com.pjg.exam.board;

//Article 데이터 저장소 @Override 으로 참조주소를 보여준것 막가따 써도된다.
public class Article {
  int id;
  String title;
  String body;

  Article(int id, String title, String body) {
    this.id = id;
    this.title = title;
    this.body = body;
  }

  @Override
  public String toString() {
    return String.format("{id: %d, title: \"%s\", body: \"%s\"}", id, title, body);
  }
}