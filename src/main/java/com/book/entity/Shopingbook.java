package com.book.entity;

import com.book.dao.BookMapper;
import com.book.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class Shopingbook {
 public List<Book> bookList;

 public List<Book> getBookList() {
  return this.bookList;
 }

 public void setBookList(List<Book> bookList) {
  this.bookList = bookList;
 }

 public Shopingbook(){
  this.bookList=new ArrayList<>();
 }

public void add(String id){
 SqlSession sqlSession= MybatisUtil.getSession();
 BookMapper mapper=sqlSession.getMapper(BookMapper.class);

 boolean found=false;
 for(Book book1:this.bookList){
  if(book1.getId().equals(id)){
   found=true;
   break;
  }

 }if (found==false){
  mapper.selectnot(Integer.parseInt(id));
  this.bookList.add(mapper.selectoneBookByid(id));
 }



}
public  void remover(String id){
//  for(int i=0;i<this.bookList.size();i++)
//  {
//   if(this.bookList.get(i).getId().equals(id)){
//    this.bookList.remove(i);
//   }
// }
 SqlSession sqlSession= MybatisUtil.getSession();
 BookMapper mapper=sqlSession.getMapper(BookMapper.class);
 for(Book book:this.bookList){
  if(book.getId().equals(id)){
   mapper.selecthave(Integer.parseInt(id));
   this.bookList.remove(book);

    break;
  }
 }
}

}
