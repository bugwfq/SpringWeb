package cn.et.web.entity;

public class News {
	private int nid;
	private String title;
	private String content;
	private String htmlPath;
	private String writerDate;
	public News() {}
	public News(int nid, String title, String content, String htmlPath, String writerDate) {
		super();
		this.nid = nid;
		this.title = title;
		this.content = content;
		this.htmlPath = htmlPath;
		this.writerDate = writerDate;
	}
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getHtmlPath() {
		return htmlPath;
	}
	public void setHtmlPath(String htmlPath) {
		this.htmlPath = htmlPath;
	}
	public String getWriterDate() {
		return writerDate;
	}
	public void setWriterDate(String writerDate) {
		this.writerDate = writerDate;
	}
	
	
}
