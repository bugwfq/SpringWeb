package cn.et.web.dao;

import java.util.List;

import cn.et.web.entity.News;

public interface NewsDao {
	/**
	 * ����sql��䷵�ز�ѯ��˵������
	 * @param sql
	 * @return
	 */
	public List<News> getNewsAll(String sql);
	/**
	 * ����sql��䷵��ָ��������
	 * @param sql
	 * @return
	 */
	public List<News> getNewsByContent(String sql);
	/**
	 * ����sql��䷵��һ��News
	 * @param sql
	 * @return
	 */
	public News getNewsById(String sql);
	/**
	 * ����sql������y8ge����
	 * @param sql
	 */
	public void add(String sql);
}
