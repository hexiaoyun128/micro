/**
 * @author: cloudy  Date: 2018/1/28 Time: 13:51
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.vo;
import lombok.Data;

import java.util.List;
@Data
public class TableResultResponse<T> extends BaseResponse {


    TableData data;

    public TableResultResponse(long total, List<T> rows) {
        this.data = new TableData<T>(total,rows);
    }
    public TableResultResponse() {
        this.data = new TableData<T>();
    }
    TableResultResponse<T> total(int total){
        this.data.setTotal(total);
        return this;
    }
     TableResultResponse<T> total(List<T> rows){
        this.data.setRows(rows);
        return this;
     }


    class TableData<T>{
        long total;
        List<T> rows;
        public TableData(long total, List<T> rows) {
            this.total = total;
            this.rows = rows;
        }

        public TableData() {

        }
        public long getTotal() {
            return total;
        }



        public void setTotal(long total) {
            this.total = total;
        }

        public List<T> getRows() {
            return rows;
        }

        public void setRows(List<T> rows) {
            this.rows = rows;
        }
    }
}
