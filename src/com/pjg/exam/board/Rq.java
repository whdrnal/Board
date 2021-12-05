package com.pjg.exam.board;

import java.util.Map;

//Rq데이터 저장소 현재 url 과 param = ( key , value )

public class Rq {
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

  public Map<String, String> getParams() {
    return params;
  }

  public String getParam(String paramName, String defaultValue) {
    if ( params.containsKey(paramName) == false ) {
      return defaultValue;
    }

    return params.get(paramName);
  }

  public int getIntParam(String paramName, int defaultValue) {
    if ( params.containsKey(paramName) == false ) {
      return defaultValue;
    }

    try {
      return Integer.parseInt(params.get(paramName));
    }
    catch ( NumberFormatException e ) {
      return defaultValue;
    }
  }

  public String getUrlPath() {
    return urlPath;
  }
}