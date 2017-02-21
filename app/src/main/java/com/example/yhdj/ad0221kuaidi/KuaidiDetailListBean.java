package com.example.yhdj.ad0221kuaidi;

import java.util.List;

/**
 * Created by yhdj on 2017/2/21.
 */

public class KuaidiDetailListBean {

    /**
     * resultcode : 200
     * reason : 成功的返回
     * result : {"company":"申通","com":"sto","no":"3323474618203","status":"1","list":[{"datetime":"2017-02-17 20:24:59","remark":"【收件】【湖北武汉暨济商城分部】的【邵乔】已收件,扫描员是【邵乔】","zone":""},{"datetime":"2017-02-17 22:21:17","remark":"【到件】快件到达【湖北武汉航空部】,上一站是【沈威】,扫描员是【长丰3号扫描员】","zone":""},{"datetime":"2017-02-17 22:46:41","remark":"【发件】快件在【湖北武汉航空部】由【长丰4号发件员】扫描发往【广东广州中转部】","zone":""},{"datetime":"2017-02-17 22:46:53","remark":"【装袋】【湖北武汉航空部】已进行【装袋】扫描,袋号【900395002124】单号【3323474618203】","zone":""},{"datetime":"2017-02-17 22:46:53","remark":"【发件】快件在【湖北武汉航空部】由【长丰4号发件员】扫描发往【广东广州中转部】","zone":""},{"datetime":"2017-02-18 19:55:50","remark":"【发件】快件在【湖北武汉航空部】由【航空8】扫描发往【广东共和中转部】","zone":""},{"datetime":"2017-02-20 00:41:25","remark":"【发件】快件在【广东共和中转部】由【黄玩】扫描发往【广东新会公司】","zone":""},{"datetime":"2017-02-20 10:18:50","remark":"【到件】快件到达【广东新会公司】,上一站是【】,扫描员是【广东新会】","zone":""},{"datetime":"2017-02-20 10:25:49","remark":"【到件】快件到达【广东新会公司】,上一站是【】,扫描员是【广东新会】","zone":""},{"datetime":"2017-02-20 17:58:16","remark":"【疑难件】【广东新会公司】正在进行【疑难件】扫描,原因是：【送无人,电话联系不上明日送】","zone":""},{"datetime":"2017-02-21 08:59:49","remark":"【到件】快件到达【广东新会公司】,上一站是【】,扫描员是【广东新会】","zone":""},{"datetime":"2017-02-21 09:01:56","remark":"【到件】快件到达【广东新会公司】,上一站是【】,扫描员是【广东新会】","zone":""},{"datetime":"2017-02-21 10:15:48","remark":"【派件】【广东新会公司】的【民营工业园】正在派件,扫描员是【广东新会】","zone":""},{"datetime":"2017-02-21 18:02:16","remark":"【签收】已签收,签收人是:【他人谭耀详】","zone":""}]}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    /**
     * company : 申通
     * com : sto
     * no : 3323474618203
     * status : 1
     * list : [{"datetime":"2017-02-17 20:24:59","remark":"【收件】【湖北武汉暨济商城分部】的【邵乔】已收件,扫描员是【邵乔】","zone":""},{"datetime":"2017-02-17 22:21:17","remark":"【到件】快件到达【湖北武汉航空部】,上一站是【沈威】,扫描员是【长丰3号扫描员】","zone":""},{"datetime":"2017-02-17 22:46:41","remark":"【发件】快件在【湖北武汉航空部】由【长丰4号发件员】扫描发往【广东广州中转部】","zone":""},{"datetime":"2017-02-17 22:46:53","remark":"【装袋】【湖北武汉航空部】已进行【装袋】扫描,袋号【900395002124】单号【3323474618203】","zone":""},{"datetime":"2017-02-17 22:46:53","remark":"【发件】快件在【湖北武汉航空部】由【长丰4号发件员】扫描发往【广东广州中转部】","zone":""},{"datetime":"2017-02-18 19:55:50","remark":"【发件】快件在【湖北武汉航空部】由【航空8】扫描发往【广东共和中转部】","zone":""},{"datetime":"2017-02-20 00:41:25","remark":"【发件】快件在【广东共和中转部】由【黄玩】扫描发往【广东新会公司】","zone":""},{"datetime":"2017-02-20 10:18:50","remark":"【到件】快件到达【广东新会公司】,上一站是【】,扫描员是【广东新会】","zone":""},{"datetime":"2017-02-20 10:25:49","remark":"【到件】快件到达【广东新会公司】,上一站是【】,扫描员是【广东新会】","zone":""},{"datetime":"2017-02-20 17:58:16","remark":"【疑难件】【广东新会公司】正在进行【疑难件】扫描,原因是：【送无人,电话联系不上明日送】","zone":""},{"datetime":"2017-02-21 08:59:49","remark":"【到件】快件到达【广东新会公司】,上一站是【】,扫描员是【广东新会】","zone":""},{"datetime":"2017-02-21 09:01:56","remark":"【到件】快件到达【广东新会公司】,上一站是【】,扫描员是【广东新会】","zone":""},{"datetime":"2017-02-21 10:15:48","remark":"【派件】【广东新会公司】的【民营工业园】正在派件,扫描员是【广东新会】","zone":""},{"datetime":"2017-02-21 18:02:16","remark":"【签收】已签收,签收人是:【他人谭耀详】","zone":""}]
     */

    private ResultBean result;
    private int error_code;
    private List<ResultBean> resultDetail;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getDeatil(){
        return resultDetail;
    }

    public void setResultDetail(List<ResultBean> resultDetail){
        this.resultDetail = resultDetail;

    }

    public static class ResultBean {
        private String company;
        private String com;
        private String no;
        private String status;
        /**
         * datetime : 2017-02-17 20:24:59
         * remark : 【收件】【湖北武汉暨济商城分部】的【邵乔】已收件,扫描员是【邵乔】
         * zone :
         */

        private List<ListBean> list;

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCom() {
            return com;
        }

        public void setCom(String com) {
            this.com = com;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String datetime;
            private String remark;
            private String zone;

            public String getDatetime() {
                return datetime;
            }

            public void setDatetime(String datetime) {
                this.datetime = datetime;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getZone() {
                return zone;
            }

            public void setZone(String zone) {
                this.zone = zone;
            }
        }
    }
}
