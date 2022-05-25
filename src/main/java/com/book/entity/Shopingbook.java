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
//判断是否重复加入
 }if (found==false){
  mapper.selectnot(Integer.parseInt(id));//图书状态更改
  this.bookList.add(mapper.selectoneBookByid(id));
 }



}
public void add1(String id){
 SqlSession sqlSession= MybatisUtil.getSession();
 BookMapper mapper=sqlSession.getMapper(BookMapper.class);

 boolean found=false;
 for(Book book1:this.bookList){
  if(book1.getId().equals(id)){
   found=true;
   break;
  }

 }if (found==false){

  this.bookList.add(mapper.selectoneBookByid(id));
 }
}
public  void remover(String id){
 SqlSession sqlSession= MybatisUtil.getSession();
 BookMapper mapper=sqlSession.getMapper(BookMapper.class);
 for(Book book:this.bookList){
  if(book.getId().equals(id)){

   this.bookList.remove(book);
    break;
  }
 }//判断是否重复加入
}
public  void remover1(String id){
 SqlSession sqlSession= MybatisUtil.getSession();
 BookMapper mapper=sqlSession.getMapper(BookMapper.class);
 for(Book book:this.bookList){
  if(book.getId().equals(id)){
   mapper.updatehave(Integer.parseInt(id));//图书状态更改为有货
   this.bookList.remove(book);
    break;
  }
 }
}

}
