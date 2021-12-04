package com.pjg.exam.board;

import java.util.Map;

//Rq데이터 저장소 현재 url 과 param = ( key , value )
public
class Rq {
  private String url;
  private String urlPath;
  private Map<String, String> params;

  // 필드추가가능

  // 수정가능
  Rq(String url) {
    this.url = url;
    urlPath = Util.getUrlPathFromUrl(this.url);
    params = Util.getParamsFromUrl(this.url);
  }

  // 수정가능, if문 금지
  public Map<String, String> getParams() {
    return params;
  }

  // 수정가능, if문 금지

  public String getUrlPath() {
    return urlPath;
  }
}