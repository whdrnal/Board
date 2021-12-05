package com.pjg.exam.board;

import java.util.Scanner;

//스캐너 저장소로 인해 sc. 를 마음대로쓸수있다.
public class Container {
  static Scanner sc;
  static UsrArticleController usrArticleController;
  static UsrMemberController usrMemberController;

  static {
    sc = new Scanner(System.in);
    usrArticleController = new UsrArticleController();
    usrMemberController = new UsrMemberController();
  }
}