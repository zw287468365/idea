package springboot.demo.POJO;

import java.util.List;

public class pageVO<T> {
    private Integer rowCount;
    private Integer pageCount;
    private Integer pageCurrent;
    private Integer pageSize;
    private List<T> data;

    public pageVO() {
    }

    public pageVO(Integer rowCount, Integer pageCount, Integer pageCurrent, Integer pageSize, List<T> data) {
        this.rowCount = rowCount;
        this.pageCount = pageCount;
        this.pageCurrent = pageCurrent;
        this.pageSize = pageSize;
        this.data = data;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(Integer pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "pageVO{" +
                "rowCount=" + rowCount +
                ", pageCount=" + pageCount +
                ", pageCurrent=" + pageCurrent +
                ", pageSize=" + pageSize +
                ", data=" + data +
                '}';
    }
}
