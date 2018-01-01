package cn.et.web.dao;

import java.util.List;

import cn.et.web.entity.News;

public interface NewsDao {
	/**
	 * 根据sql语句返回查询的说有新闻
	 * @param sql
	 * @return
	 */
	public List<News> getNewsAll(String sql);
	/**
	 * 根据sql语句返回指定的行数
	 * @param sql
	 * @return
	 */
	public List<News> getNewsByContent(String sql);
	/**
	 * 根据sql语句返回一个News
	 * @param sql
	 * @return
	 */
	public News getNewsById(String sql);
	/**
	 * 根据sql语句添加y8ge对象
	 * @param sql
	 */
	public void add(String sql);
}
