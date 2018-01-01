package cn.et.web.service;

import java.util.List;

import cn.et.web.entity.News;

public interface NewsManager {
	/**
	 * 返回所有新闻 可以指定返回最后多少行
	 * @param lineNum   返回数据库最后多少行
	 * @return
	 */
	public List<News> getNewsAll(String lineNum);
	/**
	 * 根据内容返回满足条件的新闻  list
	 * @param content 需要查看的内容
	 * @param lineNum 返回的行数
	 * @return
	 */
	public List<News> getNewsByContent(String content,String lineNum);
	/**
	 * 根据id 返回一个
	 * @param id 需要查询的ID
	 * @return
	 */
	public News getNewsById(String id);
	/**
	 * 传入一个对象添加到数据库
	 * @param news
	 * @return
	 */
	public boolean add(News news);
}
