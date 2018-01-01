package cn.et.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.web.dao.NewsDao;
import cn.et.web.entity.News;
import cn.et.web.service.NewsManager;
@Service
public class NewsManagerImpl implements NewsManager {
	@Autowired
	private NewsDao userDao;

	public List<News> getNewsAll(String lineNum) {
		String temp="";
		if(lineNum!=null&&!"".equals(lineNum)){
			temp = " limit"+lineNum;
		}
		String sql = "select * from news Order By nid Desc "+temp;
		return userDao.getNewsAll(sql);
	}

	public List<News> getNewsByContent(String content, String lineNum) {
		if(content==null){
			content = "";
		}
		String temp="";
		if(lineNum!=null&&!"".equals(lineNum)){
			temp = " limit"+lineNum;
		}
		String sql = "select * from news where content like '%"+content+"%' Order By nid Desc "+temp;
		return userDao.getNewsByContent(sql);
	}

	public News getNewsById(String id) {
		String sql = "select * from news where nid="+id;
		return userDao.getNewsById(sql);
	}

	public boolean add(News news) {
		if(news==null || news.getContent()==null){
			return false;
		}
		String sql = "insert into news(title,content,htmlPath,writerDate) values("+news.getTitle()+","+news.getContent()+","+news.getHtmlPath()+","+news.getWriterDate()+")";
		userDao.add(sql);
		return true;
	}
	
}
