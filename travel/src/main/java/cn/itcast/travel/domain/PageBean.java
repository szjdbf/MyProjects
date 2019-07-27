package cn.itcast.travel.domain;

import java.util.List;

public class PageBean<T> {
    //总条数
    private Integer totalCount;
    //总页数
    private Integer totalPage;
    //当前页码
    private Integer currentPage;
    //每页显示条数
    private Integer rows;
    //分类的ID
    private String cid;
    //当前显示的数据
    private List<T> list;


    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", currentPage=" + currentPage +
                ", rows=" + rows +
                ", cid='" + cid + '\'' +
                ", list=" + list +
                '}';
    }
}
