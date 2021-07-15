package org.apache.ibatis.demo;

public class Blog {

  private Integer id;
  private String username;
  private String content;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "Blog{" +
      "id=" + id +
      ", username='" + username + '\'' +
      ", content='" + content + '\'' +
      '}';
  }
}
