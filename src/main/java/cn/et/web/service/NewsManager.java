package cn.et.web.service;

import java.util.List;

import cn.et.web.entity.News;

public interface NewsManager {
	/**
	 * ������������ ����ָ��������������
	 * @param lineNum   �������ݿ���������
	 * @return
	 */
	public List<News> getNewsAll(String lineNum);
	/**
	 * �������ݷ�����������������  list
	 * @param content ��Ҫ�鿴������
	 * @param lineNum ���ص�����
	 * @return
	 */
	public List<News> getNewsByContent(String content,String lineNum);
	/**
	 * ����id ����һ��
	 * @param id ��Ҫ��ѯ��ID
	 * @return
	 */
	public News getNewsById(String id);
	/**
	 * ����һ��������ӵ����ݿ�
	 * @param news
	 * @return
	 */
	public boolean add(News news);
}
