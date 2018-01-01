package cn.et.web.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.et.web.dao.NewsDao;
import cn.et.web.entity.News;
@Repository
public class NewsDaoImpl implements NewsDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<News> getNewsAll(String sql) {
		return query(sql);
	}
	public List<News> getNewsByContent(String sql) {
		return query(sql);
	}
	public News getNewsById(String sql) {
		return query(sql).get(0);
	}
	public void add(String sql) {
		jdbcTemplate.execute(sql);
	}
	public List<News> query(String sql){
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<News>(News.class));
	}
}
