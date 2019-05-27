package com.zx.business.pojo;

import java.util.ArrayList;
import java.util.List;

public class ParkCompanyStructExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParkCompanyStructExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andNongLinMYIndustryIsNull() {
            addCriterion("nong_lin_m_y_industry is null");
            return (Criteria) this;
        }

        public Criteria andNongLinMYIndustryIsNotNull() {
            addCriterion("nong_lin_m_y_industry is not null");
            return (Criteria) this;
        }

        public Criteria andNongLinMYIndustryEqualTo(Integer value) {
            addCriterion("nong_lin_m_y_industry =", value, "nongLinMYIndustry");
            return (Criteria) this;
        }

        public Criteria andNongLinMYIndustryNotEqualTo(Integer value) {
            addCriterion("nong_lin_m_y_industry <>", value, "nongLinMYIndustry");
            return (Criteria) this;
        }

        public Criteria andNongLinMYIndustryGreaterThan(Integer value) {
            addCriterion("nong_lin_m_y_industry >", value, "nongLinMYIndustry");
            return (Criteria) this;
        }

        public Criteria andNongLinMYIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("nong_lin_m_y_industry >=", value, "nongLinMYIndustry");
            return (Criteria) this;
        }

        public Criteria andNongLinMYIndustryLessThan(Integer value) {
            addCriterion("nong_lin_m_y_industry <", value, "nongLinMYIndustry");
            return (Criteria) this;
        }

        public Criteria andNongLinMYIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("nong_lin_m_y_industry <=", value, "nongLinMYIndustry");
            return (Criteria) this;
        }

        public Criteria andNongLinMYIndustryIn(List<Integer> values) {
            addCriterion("nong_lin_m_y_industry in", values, "nongLinMYIndustry");
            return (Criteria) this;
        }

        public Criteria andNongLinMYIndustryNotIn(List<Integer> values) {
            addCriterion("nong_lin_m_y_industry not in", values, "nongLinMYIndustry");
            return (Criteria) this;
        }

        public Criteria andNongLinMYIndustryBetween(Integer value1, Integer value2) {
            addCriterion("nong_lin_m_y_industry between", value1, value2, "nongLinMYIndustry");
            return (Criteria) this;
        }

        public Criteria andNongLinMYIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("nong_lin_m_y_industry not between", value1, value2, "nongLinMYIndustry");
            return (Criteria) this;
        }

        public Criteria andCaiKuangIndustryIsNull() {
            addCriterion("cai_kuang_industry is null");
            return (Criteria) this;
        }

        public Criteria andCaiKuangIndustryIsNotNull() {
            addCriterion("cai_kuang_industry is not null");
            return (Criteria) this;
        }

        public Criteria andCaiKuangIndustryEqualTo(Integer value) {
            addCriterion("cai_kuang_industry =", value, "caiKuangIndustry");
            return (Criteria) this;
        }

        public Criteria andCaiKuangIndustryNotEqualTo(Integer value) {
            addCriterion("cai_kuang_industry <>", value, "caiKuangIndustry");
            return (Criteria) this;
        }

        public Criteria andCaiKuangIndustryGreaterThan(Integer value) {
            addCriterion("cai_kuang_industry >", value, "caiKuangIndustry");
            return (Criteria) this;
        }

        public Criteria andCaiKuangIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("cai_kuang_industry >=", value, "caiKuangIndustry");
            return (Criteria) this;
        }

        public Criteria andCaiKuangIndustryLessThan(Integer value) {
            addCriterion("cai_kuang_industry <", value, "caiKuangIndustry");
            return (Criteria) this;
        }

        public Criteria andCaiKuangIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("cai_kuang_industry <=", value, "caiKuangIndustry");
            return (Criteria) this;
        }

        public Criteria andCaiKuangIndustryIn(List<Integer> values) {
            addCriterion("cai_kuang_industry in", values, "caiKuangIndustry");
            return (Criteria) this;
        }

        public Criteria andCaiKuangIndustryNotIn(List<Integer> values) {
            addCriterion("cai_kuang_industry not in", values, "caiKuangIndustry");
            return (Criteria) this;
        }

        public Criteria andCaiKuangIndustryBetween(Integer value1, Integer value2) {
            addCriterion("cai_kuang_industry between", value1, value2, "caiKuangIndustry");
            return (Criteria) this;
        }

        public Criteria andCaiKuangIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("cai_kuang_industry not between", value1, value2, "caiKuangIndustry");
            return (Criteria) this;
        }

        public Criteria andProduceIndustryIsNull() {
            addCriterion("produce_industry is null");
            return (Criteria) this;
        }

        public Criteria andProduceIndustryIsNotNull() {
            addCriterion("produce_industry is not null");
            return (Criteria) this;
        }

        public Criteria andProduceIndustryEqualTo(Integer value) {
            addCriterion("produce_industry =", value, "produceIndustry");
            return (Criteria) this;
        }

        public Criteria andProduceIndustryNotEqualTo(Integer value) {
            addCriterion("produce_industry <>", value, "produceIndustry");
            return (Criteria) this;
        }

        public Criteria andProduceIndustryGreaterThan(Integer value) {
            addCriterion("produce_industry >", value, "produceIndustry");
            return (Criteria) this;
        }

        public Criteria andProduceIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("produce_industry >=", value, "produceIndustry");
            return (Criteria) this;
        }

        public Criteria andProduceIndustryLessThan(Integer value) {
            addCriterion("produce_industry <", value, "produceIndustry");
            return (Criteria) this;
        }

        public Criteria andProduceIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("produce_industry <=", value, "produceIndustry");
            return (Criteria) this;
        }

        public Criteria andProduceIndustryIn(List<Integer> values) {
            addCriterion("produce_industry in", values, "produceIndustry");
            return (Criteria) this;
        }

        public Criteria andProduceIndustryNotIn(List<Integer> values) {
            addCriterion("produce_industry not in", values, "produceIndustry");
            return (Criteria) this;
        }

        public Criteria andProduceIndustryBetween(Integer value1, Integer value2) {
            addCriterion("produce_industry between", value1, value2, "produceIndustry");
            return (Criteria) this;
        }

        public Criteria andProduceIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("produce_industry not between", value1, value2, "produceIndustry");
            return (Criteria) this;
        }

        public Criteria andDianReRqSGIndustryIsNull() {
            addCriterion("dian_re_rq_s_g_industry is null");
            return (Criteria) this;
        }

        public Criteria andDianReRqSGIndustryIsNotNull() {
            addCriterion("dian_re_rq_s_g_industry is not null");
            return (Criteria) this;
        }

        public Criteria andDianReRqSGIndustryEqualTo(Integer value) {
            addCriterion("dian_re_rq_s_g_industry =", value, "dianReRqSGIndustry");
            return (Criteria) this;
        }

        public Criteria andDianReRqSGIndustryNotEqualTo(Integer value) {
            addCriterion("dian_re_rq_s_g_industry <>", value, "dianReRqSGIndustry");
            return (Criteria) this;
        }

        public Criteria andDianReRqSGIndustryGreaterThan(Integer value) {
            addCriterion("dian_re_rq_s_g_industry >", value, "dianReRqSGIndustry");
            return (Criteria) this;
        }

        public Criteria andDianReRqSGIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("dian_re_rq_s_g_industry >=", value, "dianReRqSGIndustry");
            return (Criteria) this;
        }

        public Criteria andDianReRqSGIndustryLessThan(Integer value) {
            addCriterion("dian_re_rq_s_g_industry <", value, "dianReRqSGIndustry");
            return (Criteria) this;
        }

        public Criteria andDianReRqSGIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("dian_re_rq_s_g_industry <=", value, "dianReRqSGIndustry");
            return (Criteria) this;
        }

        public Criteria andDianReRqSGIndustryIn(List<Integer> values) {
            addCriterion("dian_re_rq_s_g_industry in", values, "dianReRqSGIndustry");
            return (Criteria) this;
        }

        public Criteria andDianReRqSGIndustryNotIn(List<Integer> values) {
            addCriterion("dian_re_rq_s_g_industry not in", values, "dianReRqSGIndustry");
            return (Criteria) this;
        }

        public Criteria andDianReRqSGIndustryBetween(Integer value1, Integer value2) {
            addCriterion("dian_re_rq_s_g_industry between", value1, value2, "dianReRqSGIndustry");
            return (Criteria) this;
        }

        public Criteria andDianReRqSGIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("dian_re_rq_s_g_industry not between", value1, value2, "dianReRqSGIndustry");
            return (Criteria) this;
        }

        public Criteria andBuildingIndustryIsNull() {
            addCriterion("building_industry is null");
            return (Criteria) this;
        }

        public Criteria andBuildingIndustryIsNotNull() {
            addCriterion("building_industry is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingIndustryEqualTo(Integer value) {
            addCriterion("building_industry =", value, "buildingIndustry");
            return (Criteria) this;
        }

        public Criteria andBuildingIndustryNotEqualTo(Integer value) {
            addCriterion("building_industry <>", value, "buildingIndustry");
            return (Criteria) this;
        }

        public Criteria andBuildingIndustryGreaterThan(Integer value) {
            addCriterion("building_industry >", value, "buildingIndustry");
            return (Criteria) this;
        }

        public Criteria andBuildingIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("building_industry >=", value, "buildingIndustry");
            return (Criteria) this;
        }

        public Criteria andBuildingIndustryLessThan(Integer value) {
            addCriterion("building_industry <", value, "buildingIndustry");
            return (Criteria) this;
        }

        public Criteria andBuildingIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("building_industry <=", value, "buildingIndustry");
            return (Criteria) this;
        }

        public Criteria andBuildingIndustryIn(List<Integer> values) {
            addCriterion("building_industry in", values, "buildingIndustry");
            return (Criteria) this;
        }

        public Criteria andBuildingIndustryNotIn(List<Integer> values) {
            addCriterion("building_industry not in", values, "buildingIndustry");
            return (Criteria) this;
        }

        public Criteria andBuildingIndustryBetween(Integer value1, Integer value2) {
            addCriterion("building_industry between", value1, value2, "buildingIndustry");
            return (Criteria) this;
        }

        public Criteria andBuildingIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("building_industry not between", value1, value2, "buildingIndustry");
            return (Criteria) this;
        }

        public Criteria andPifaLsIndustryIsNull() {
            addCriterion("pifa_ls_industry is null");
            return (Criteria) this;
        }

        public Criteria andPifaLsIndustryIsNotNull() {
            addCriterion("pifa_ls_industry is not null");
            return (Criteria) this;
        }

        public Criteria andPifaLsIndustryEqualTo(Integer value) {
            addCriterion("pifa_ls_industry =", value, "pifaLsIndustry");
            return (Criteria) this;
        }

        public Criteria andPifaLsIndustryNotEqualTo(Integer value) {
            addCriterion("pifa_ls_industry <>", value, "pifaLsIndustry");
            return (Criteria) this;
        }

        public Criteria andPifaLsIndustryGreaterThan(Integer value) {
            addCriterion("pifa_ls_industry >", value, "pifaLsIndustry");
            return (Criteria) this;
        }

        public Criteria andPifaLsIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("pifa_ls_industry >=", value, "pifaLsIndustry");
            return (Criteria) this;
        }

        public Criteria andPifaLsIndustryLessThan(Integer value) {
            addCriterion("pifa_ls_industry <", value, "pifaLsIndustry");
            return (Criteria) this;
        }

        public Criteria andPifaLsIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("pifa_ls_industry <=", value, "pifaLsIndustry");
            return (Criteria) this;
        }

        public Criteria andPifaLsIndustryIn(List<Integer> values) {
            addCriterion("pifa_ls_industry in", values, "pifaLsIndustry");
            return (Criteria) this;
        }

        public Criteria andPifaLsIndustryNotIn(List<Integer> values) {
            addCriterion("pifa_ls_industry not in", values, "pifaLsIndustry");
            return (Criteria) this;
        }

        public Criteria andPifaLsIndustryBetween(Integer value1, Integer value2) {
            addCriterion("pifa_ls_industry between", value1, value2, "pifaLsIndustry");
            return (Criteria) this;
        }

        public Criteria andPifaLsIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("pifa_ls_industry not between", value1, value2, "pifaLsIndustry");
            return (Criteria) this;
        }

        public Criteria andTrafficHouseMailIndustryIsNull() {
            addCriterion("traffic_house_mail_industry is null");
            return (Criteria) this;
        }

        public Criteria andTrafficHouseMailIndustryIsNotNull() {
            addCriterion("traffic_house_mail_industry is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficHouseMailIndustryEqualTo(Integer value) {
            addCriterion("traffic_house_mail_industry =", value, "trafficHouseMailIndustry");
            return (Criteria) this;
        }

        public Criteria andTrafficHouseMailIndustryNotEqualTo(Integer value) {
            addCriterion("traffic_house_mail_industry <>", value, "trafficHouseMailIndustry");
            return (Criteria) this;
        }

        public Criteria andTrafficHouseMailIndustryGreaterThan(Integer value) {
            addCriterion("traffic_house_mail_industry >", value, "trafficHouseMailIndustry");
            return (Criteria) this;
        }

        public Criteria andTrafficHouseMailIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("traffic_house_mail_industry >=", value, "trafficHouseMailIndustry");
            return (Criteria) this;
        }

        public Criteria andTrafficHouseMailIndustryLessThan(Integer value) {
            addCriterion("traffic_house_mail_industry <", value, "trafficHouseMailIndustry");
            return (Criteria) this;
        }

        public Criteria andTrafficHouseMailIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("traffic_house_mail_industry <=", value, "trafficHouseMailIndustry");
            return (Criteria) this;
        }

        public Criteria andTrafficHouseMailIndustryIn(List<Integer> values) {
            addCriterion("traffic_house_mail_industry in", values, "trafficHouseMailIndustry");
            return (Criteria) this;
        }

        public Criteria andTrafficHouseMailIndustryNotIn(List<Integer> values) {
            addCriterion("traffic_house_mail_industry not in", values, "trafficHouseMailIndustry");
            return (Criteria) this;
        }

        public Criteria andTrafficHouseMailIndustryBetween(Integer value1, Integer value2) {
            addCriterion("traffic_house_mail_industry between", value1, value2, "trafficHouseMailIndustry");
            return (Criteria) this;
        }

        public Criteria andTrafficHouseMailIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("traffic_house_mail_industry not between", value1, value2, "trafficHouseMailIndustry");
            return (Criteria) this;
        }

        public Criteria andHostelCateringIndustryIsNull() {
            addCriterion("hostel_catering_industry is null");
            return (Criteria) this;
        }

        public Criteria andHostelCateringIndustryIsNotNull() {
            addCriterion("hostel_catering_industry is not null");
            return (Criteria) this;
        }

        public Criteria andHostelCateringIndustryEqualTo(Integer value) {
            addCriterion("hostel_catering_industry =", value, "hostelCateringIndustry");
            return (Criteria) this;
        }

        public Criteria andHostelCateringIndustryNotEqualTo(Integer value) {
            addCriterion("hostel_catering_industry <>", value, "hostelCateringIndustry");
            return (Criteria) this;
        }

        public Criteria andHostelCateringIndustryGreaterThan(Integer value) {
            addCriterion("hostel_catering_industry >", value, "hostelCateringIndustry");
            return (Criteria) this;
        }

        public Criteria andHostelCateringIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("hostel_catering_industry >=", value, "hostelCateringIndustry");
            return (Criteria) this;
        }

        public Criteria andHostelCateringIndustryLessThan(Integer value) {
            addCriterion("hostel_catering_industry <", value, "hostelCateringIndustry");
            return (Criteria) this;
        }

        public Criteria andHostelCateringIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("hostel_catering_industry <=", value, "hostelCateringIndustry");
            return (Criteria) this;
        }

        public Criteria andHostelCateringIndustryIn(List<Integer> values) {
            addCriterion("hostel_catering_industry in", values, "hostelCateringIndustry");
            return (Criteria) this;
        }

        public Criteria andHostelCateringIndustryNotIn(List<Integer> values) {
            addCriterion("hostel_catering_industry not in", values, "hostelCateringIndustry");
            return (Criteria) this;
        }

        public Criteria andHostelCateringIndustryBetween(Integer value1, Integer value2) {
            addCriterion("hostel_catering_industry between", value1, value2, "hostelCateringIndustry");
            return (Criteria) this;
        }

        public Criteria andHostelCateringIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("hostel_catering_industry not between", value1, value2, "hostelCateringIndustry");
            return (Criteria) this;
        }

        public Criteria andInfoTranSoftItIndustryIsNull() {
            addCriterion("info_tran_soft_it_industry is null");
            return (Criteria) this;
        }

        public Criteria andInfoTranSoftItIndustryIsNotNull() {
            addCriterion("info_tran_soft_it_industry is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTranSoftItIndustryEqualTo(Integer value) {
            addCriterion("info_tran_soft_it_industry =", value, "infoTranSoftItIndustry");
            return (Criteria) this;
        }

        public Criteria andInfoTranSoftItIndustryNotEqualTo(Integer value) {
            addCriterion("info_tran_soft_it_industry <>", value, "infoTranSoftItIndustry");
            return (Criteria) this;
        }

        public Criteria andInfoTranSoftItIndustryGreaterThan(Integer value) {
            addCriterion("info_tran_soft_it_industry >", value, "infoTranSoftItIndustry");
            return (Criteria) this;
        }

        public Criteria andInfoTranSoftItIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_tran_soft_it_industry >=", value, "infoTranSoftItIndustry");
            return (Criteria) this;
        }

        public Criteria andInfoTranSoftItIndustryLessThan(Integer value) {
            addCriterion("info_tran_soft_it_industry <", value, "infoTranSoftItIndustry");
            return (Criteria) this;
        }

        public Criteria andInfoTranSoftItIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("info_tran_soft_it_industry <=", value, "infoTranSoftItIndustry");
            return (Criteria) this;
        }

        public Criteria andInfoTranSoftItIndustryIn(List<Integer> values) {
            addCriterion("info_tran_soft_it_industry in", values, "infoTranSoftItIndustry");
            return (Criteria) this;
        }

        public Criteria andInfoTranSoftItIndustryNotIn(List<Integer> values) {
            addCriterion("info_tran_soft_it_industry not in", values, "infoTranSoftItIndustry");
            return (Criteria) this;
        }

        public Criteria andInfoTranSoftItIndustryBetween(Integer value1, Integer value2) {
            addCriterion("info_tran_soft_it_industry between", value1, value2, "infoTranSoftItIndustry");
            return (Criteria) this;
        }

        public Criteria andInfoTranSoftItIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("info_tran_soft_it_industry not between", value1, value2, "infoTranSoftItIndustry");
            return (Criteria) this;
        }

        public Criteria andBankingIndustryIsNull() {
            addCriterion("banking_industry is null");
            return (Criteria) this;
        }

        public Criteria andBankingIndustryIsNotNull() {
            addCriterion("banking_industry is not null");
            return (Criteria) this;
        }

        public Criteria andBankingIndustryEqualTo(Integer value) {
            addCriterion("banking_industry =", value, "bankingIndustry");
            return (Criteria) this;
        }

        public Criteria andBankingIndustryNotEqualTo(Integer value) {
            addCriterion("banking_industry <>", value, "bankingIndustry");
            return (Criteria) this;
        }

        public Criteria andBankingIndustryGreaterThan(Integer value) {
            addCriterion("banking_industry >", value, "bankingIndustry");
            return (Criteria) this;
        }

        public Criteria andBankingIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("banking_industry >=", value, "bankingIndustry");
            return (Criteria) this;
        }

        public Criteria andBankingIndustryLessThan(Integer value) {
            addCriterion("banking_industry <", value, "bankingIndustry");
            return (Criteria) this;
        }

        public Criteria andBankingIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("banking_industry <=", value, "bankingIndustry");
            return (Criteria) this;
        }

        public Criteria andBankingIndustryIn(List<Integer> values) {
            addCriterion("banking_industry in", values, "bankingIndustry");
            return (Criteria) this;
        }

        public Criteria andBankingIndustryNotIn(List<Integer> values) {
            addCriterion("banking_industry not in", values, "bankingIndustry");
            return (Criteria) this;
        }

        public Criteria andBankingIndustryBetween(Integer value1, Integer value2) {
            addCriterion("banking_industry between", value1, value2, "bankingIndustry");
            return (Criteria) this;
        }

        public Criteria andBankingIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("banking_industry not between", value1, value2, "bankingIndustry");
            return (Criteria) this;
        }

        public Criteria andFangdichanIndustryIsNull() {
            addCriterion("fangdichan_industry is null");
            return (Criteria) this;
        }

        public Criteria andFangdichanIndustryIsNotNull() {
            addCriterion("fangdichan_industry is not null");
            return (Criteria) this;
        }

        public Criteria andFangdichanIndustryEqualTo(Integer value) {
            addCriterion("fangdichan_industry =", value, "fangdichanIndustry");
            return (Criteria) this;
        }

        public Criteria andFangdichanIndustryNotEqualTo(Integer value) {
            addCriterion("fangdichan_industry <>", value, "fangdichanIndustry");
            return (Criteria) this;
        }

        public Criteria andFangdichanIndustryGreaterThan(Integer value) {
            addCriterion("fangdichan_industry >", value, "fangdichanIndustry");
            return (Criteria) this;
        }

        public Criteria andFangdichanIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("fangdichan_industry >=", value, "fangdichanIndustry");
            return (Criteria) this;
        }

        public Criteria andFangdichanIndustryLessThan(Integer value) {
            addCriterion("fangdichan_industry <", value, "fangdichanIndustry");
            return (Criteria) this;
        }

        public Criteria andFangdichanIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("fangdichan_industry <=", value, "fangdichanIndustry");
            return (Criteria) this;
        }

        public Criteria andFangdichanIndustryIn(List<Integer> values) {
            addCriterion("fangdichan_industry in", values, "fangdichanIndustry");
            return (Criteria) this;
        }

        public Criteria andFangdichanIndustryNotIn(List<Integer> values) {
            addCriterion("fangdichan_industry not in", values, "fangdichanIndustry");
            return (Criteria) this;
        }

        public Criteria andFangdichanIndustryBetween(Integer value1, Integer value2) {
            addCriterion("fangdichan_industry between", value1, value2, "fangdichanIndustry");
            return (Criteria) this;
        }

        public Criteria andFangdichanIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("fangdichan_industry not between", value1, value2, "fangdichanIndustry");
            return (Criteria) this;
        }

        public Criteria andRentBusinessIndustryIsNull() {
            addCriterion("rent_business_industry is null");
            return (Criteria) this;
        }

        public Criteria andRentBusinessIndustryIsNotNull() {
            addCriterion("rent_business_industry is not null");
            return (Criteria) this;
        }

        public Criteria andRentBusinessIndustryEqualTo(Integer value) {
            addCriterion("rent_business_industry =", value, "rentBusinessIndustry");
            return (Criteria) this;
        }

        public Criteria andRentBusinessIndustryNotEqualTo(Integer value) {
            addCriterion("rent_business_industry <>", value, "rentBusinessIndustry");
            return (Criteria) this;
        }

        public Criteria andRentBusinessIndustryGreaterThan(Integer value) {
            addCriterion("rent_business_industry >", value, "rentBusinessIndustry");
            return (Criteria) this;
        }

        public Criteria andRentBusinessIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent_business_industry >=", value, "rentBusinessIndustry");
            return (Criteria) this;
        }

        public Criteria andRentBusinessIndustryLessThan(Integer value) {
            addCriterion("rent_business_industry <", value, "rentBusinessIndustry");
            return (Criteria) this;
        }

        public Criteria andRentBusinessIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("rent_business_industry <=", value, "rentBusinessIndustry");
            return (Criteria) this;
        }

        public Criteria andRentBusinessIndustryIn(List<Integer> values) {
            addCriterion("rent_business_industry in", values, "rentBusinessIndustry");
            return (Criteria) this;
        }

        public Criteria andRentBusinessIndustryNotIn(List<Integer> values) {
            addCriterion("rent_business_industry not in", values, "rentBusinessIndustry");
            return (Criteria) this;
        }

        public Criteria andRentBusinessIndustryBetween(Integer value1, Integer value2) {
            addCriterion("rent_business_industry between", value1, value2, "rentBusinessIndustry");
            return (Criteria) this;
        }

        public Criteria andRentBusinessIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("rent_business_industry not between", value1, value2, "rentBusinessIndustry");
            return (Criteria) this;
        }

        public Criteria andScienceTechnologyIndustryIsNull() {
            addCriterion("science_technology_industry is null");
            return (Criteria) this;
        }

        public Criteria andScienceTechnologyIndustryIsNotNull() {
            addCriterion("science_technology_industry is not null");
            return (Criteria) this;
        }

        public Criteria andScienceTechnologyIndustryEqualTo(Integer value) {
            addCriterion("science_technology_industry =", value, "scienceTechnologyIndustry");
            return (Criteria) this;
        }

        public Criteria andScienceTechnologyIndustryNotEqualTo(Integer value) {
            addCriterion("science_technology_industry <>", value, "scienceTechnologyIndustry");
            return (Criteria) this;
        }

        public Criteria andScienceTechnologyIndustryGreaterThan(Integer value) {
            addCriterion("science_technology_industry >", value, "scienceTechnologyIndustry");
            return (Criteria) this;
        }

        public Criteria andScienceTechnologyIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("science_technology_industry >=", value, "scienceTechnologyIndustry");
            return (Criteria) this;
        }

        public Criteria andScienceTechnologyIndustryLessThan(Integer value) {
            addCriterion("science_technology_industry <", value, "scienceTechnologyIndustry");
            return (Criteria) this;
        }

        public Criteria andScienceTechnologyIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("science_technology_industry <=", value, "scienceTechnologyIndustry");
            return (Criteria) this;
        }

        public Criteria andScienceTechnologyIndustryIn(List<Integer> values) {
            addCriterion("science_technology_industry in", values, "scienceTechnologyIndustry");
            return (Criteria) this;
        }

        public Criteria andScienceTechnologyIndustryNotIn(List<Integer> values) {
            addCriterion("science_technology_industry not in", values, "scienceTechnologyIndustry");
            return (Criteria) this;
        }

        public Criteria andScienceTechnologyIndustryBetween(Integer value1, Integer value2) {
            addCriterion("science_technology_industry between", value1, value2, "scienceTechnologyIndustry");
            return (Criteria) this;
        }

        public Criteria andScienceTechnologyIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("science_technology_industry not between", value1, value2, "scienceTechnologyIndustry");
            return (Criteria) this;
        }

        public Criteria andWaterEnvironmentPublicIndustryIsNull() {
            addCriterion("water_environment_public_industry is null");
            return (Criteria) this;
        }

        public Criteria andWaterEnvironmentPublicIndustryIsNotNull() {
            addCriterion("water_environment_public_industry is not null");
            return (Criteria) this;
        }

        public Criteria andWaterEnvironmentPublicIndustryEqualTo(Integer value) {
            addCriterion("water_environment_public_industry =", value, "waterEnvironmentPublicIndustry");
            return (Criteria) this;
        }

        public Criteria andWaterEnvironmentPublicIndustryNotEqualTo(Integer value) {
            addCriterion("water_environment_public_industry <>", value, "waterEnvironmentPublicIndustry");
            return (Criteria) this;
        }

        public Criteria andWaterEnvironmentPublicIndustryGreaterThan(Integer value) {
            addCriterion("water_environment_public_industry >", value, "waterEnvironmentPublicIndustry");
            return (Criteria) this;
        }

        public Criteria andWaterEnvironmentPublicIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("water_environment_public_industry >=", value, "waterEnvironmentPublicIndustry");
            return (Criteria) this;
        }

        public Criteria andWaterEnvironmentPublicIndustryLessThan(Integer value) {
            addCriterion("water_environment_public_industry <", value, "waterEnvironmentPublicIndustry");
            return (Criteria) this;
        }

        public Criteria andWaterEnvironmentPublicIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("water_environment_public_industry <=", value, "waterEnvironmentPublicIndustry");
            return (Criteria) this;
        }

        public Criteria andWaterEnvironmentPublicIndustryIn(List<Integer> values) {
            addCriterion("water_environment_public_industry in", values, "waterEnvironmentPublicIndustry");
            return (Criteria) this;
        }

        public Criteria andWaterEnvironmentPublicIndustryNotIn(List<Integer> values) {
            addCriterion("water_environment_public_industry not in", values, "waterEnvironmentPublicIndustry");
            return (Criteria) this;
        }

        public Criteria andWaterEnvironmentPublicIndustryBetween(Integer value1, Integer value2) {
            addCriterion("water_environment_public_industry between", value1, value2, "waterEnvironmentPublicIndustry");
            return (Criteria) this;
        }

        public Criteria andWaterEnvironmentPublicIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("water_environment_public_industry not between", value1, value2, "waterEnvironmentPublicIndustry");
            return (Criteria) this;
        }

        public Criteria andNeighbourRepairOtherIndustryIsNull() {
            addCriterion("neighbour_repair_other_industry is null");
            return (Criteria) this;
        }

        public Criteria andNeighbourRepairOtherIndustryIsNotNull() {
            addCriterion("neighbour_repair_other_industry is not null");
            return (Criteria) this;
        }

        public Criteria andNeighbourRepairOtherIndustryEqualTo(Integer value) {
            addCriterion("neighbour_repair_other_industry =", value, "neighbourRepairOtherIndustry");
            return (Criteria) this;
        }

        public Criteria andNeighbourRepairOtherIndustryNotEqualTo(Integer value) {
            addCriterion("neighbour_repair_other_industry <>", value, "neighbourRepairOtherIndustry");
            return (Criteria) this;
        }

        public Criteria andNeighbourRepairOtherIndustryGreaterThan(Integer value) {
            addCriterion("neighbour_repair_other_industry >", value, "neighbourRepairOtherIndustry");
            return (Criteria) this;
        }

        public Criteria andNeighbourRepairOtherIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("neighbour_repair_other_industry >=", value, "neighbourRepairOtherIndustry");
            return (Criteria) this;
        }

        public Criteria andNeighbourRepairOtherIndustryLessThan(Integer value) {
            addCriterion("neighbour_repair_other_industry <", value, "neighbourRepairOtherIndustry");
            return (Criteria) this;
        }

        public Criteria andNeighbourRepairOtherIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("neighbour_repair_other_industry <=", value, "neighbourRepairOtherIndustry");
            return (Criteria) this;
        }

        public Criteria andNeighbourRepairOtherIndustryIn(List<Integer> values) {
            addCriterion("neighbour_repair_other_industry in", values, "neighbourRepairOtherIndustry");
            return (Criteria) this;
        }

        public Criteria andNeighbourRepairOtherIndustryNotIn(List<Integer> values) {
            addCriterion("neighbour_repair_other_industry not in", values, "neighbourRepairOtherIndustry");
            return (Criteria) this;
        }

        public Criteria andNeighbourRepairOtherIndustryBetween(Integer value1, Integer value2) {
            addCriterion("neighbour_repair_other_industry between", value1, value2, "neighbourRepairOtherIndustry");
            return (Criteria) this;
        }

        public Criteria andNeighbourRepairOtherIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("neighbour_repair_other_industry not between", value1, value2, "neighbourRepairOtherIndustry");
            return (Criteria) this;
        }

        public Criteria andEducationIndustryIsNull() {
            addCriterion("education_industry is null");
            return (Criteria) this;
        }

        public Criteria andEducationIndustryIsNotNull() {
            addCriterion("education_industry is not null");
            return (Criteria) this;
        }

        public Criteria andEducationIndustryEqualTo(Integer value) {
            addCriterion("education_industry =", value, "educationIndustry");
            return (Criteria) this;
        }

        public Criteria andEducationIndustryNotEqualTo(Integer value) {
            addCriterion("education_industry <>", value, "educationIndustry");
            return (Criteria) this;
        }

        public Criteria andEducationIndustryGreaterThan(Integer value) {
            addCriterion("education_industry >", value, "educationIndustry");
            return (Criteria) this;
        }

        public Criteria andEducationIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("education_industry >=", value, "educationIndustry");
            return (Criteria) this;
        }

        public Criteria andEducationIndustryLessThan(Integer value) {
            addCriterion("education_industry <", value, "educationIndustry");
            return (Criteria) this;
        }

        public Criteria andEducationIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("education_industry <=", value, "educationIndustry");
            return (Criteria) this;
        }

        public Criteria andEducationIndustryIn(List<Integer> values) {
            addCriterion("education_industry in", values, "educationIndustry");
            return (Criteria) this;
        }

        public Criteria andEducationIndustryNotIn(List<Integer> values) {
            addCriterion("education_industry not in", values, "educationIndustry");
            return (Criteria) this;
        }

        public Criteria andEducationIndustryBetween(Integer value1, Integer value2) {
            addCriterion("education_industry between", value1, value2, "educationIndustry");
            return (Criteria) this;
        }

        public Criteria andEducationIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("education_industry not between", value1, value2, "educationIndustry");
            return (Criteria) this;
        }

        public Criteria andHealthSocialWorkIsNull() {
            addCriterion("health_social_work is null");
            return (Criteria) this;
        }

        public Criteria andHealthSocialWorkIsNotNull() {
            addCriterion("health_social_work is not null");
            return (Criteria) this;
        }

        public Criteria andHealthSocialWorkEqualTo(Integer value) {
            addCriterion("health_social_work =", value, "healthSocialWork");
            return (Criteria) this;
        }

        public Criteria andHealthSocialWorkNotEqualTo(Integer value) {
            addCriterion("health_social_work <>", value, "healthSocialWork");
            return (Criteria) this;
        }

        public Criteria andHealthSocialWorkGreaterThan(Integer value) {
            addCriterion("health_social_work >", value, "healthSocialWork");
            return (Criteria) this;
        }

        public Criteria andHealthSocialWorkGreaterThanOrEqualTo(Integer value) {
            addCriterion("health_social_work >=", value, "healthSocialWork");
            return (Criteria) this;
        }

        public Criteria andHealthSocialWorkLessThan(Integer value) {
            addCriterion("health_social_work <", value, "healthSocialWork");
            return (Criteria) this;
        }

        public Criteria andHealthSocialWorkLessThanOrEqualTo(Integer value) {
            addCriterion("health_social_work <=", value, "healthSocialWork");
            return (Criteria) this;
        }

        public Criteria andHealthSocialWorkIn(List<Integer> values) {
            addCriterion("health_social_work in", values, "healthSocialWork");
            return (Criteria) this;
        }

        public Criteria andHealthSocialWorkNotIn(List<Integer> values) {
            addCriterion("health_social_work not in", values, "healthSocialWork");
            return (Criteria) this;
        }

        public Criteria andHealthSocialWorkBetween(Integer value1, Integer value2) {
            addCriterion("health_social_work between", value1, value2, "healthSocialWork");
            return (Criteria) this;
        }

        public Criteria andHealthSocialWorkNotBetween(Integer value1, Integer value2) {
            addCriterion("health_social_work not between", value1, value2, "healthSocialWork");
            return (Criteria) this;
        }

        public Criteria andCultureSportAmusementIndustryIsNull() {
            addCriterion("culture_sport_amusement_industry is null");
            return (Criteria) this;
        }

        public Criteria andCultureSportAmusementIndustryIsNotNull() {
            addCriterion("culture_sport_amusement_industry is not null");
            return (Criteria) this;
        }

        public Criteria andCultureSportAmusementIndustryEqualTo(Integer value) {
            addCriterion("culture_sport_amusement_industry =", value, "cultureSportAmusementIndustry");
            return (Criteria) this;
        }

        public Criteria andCultureSportAmusementIndustryNotEqualTo(Integer value) {
            addCriterion("culture_sport_amusement_industry <>", value, "cultureSportAmusementIndustry");
            return (Criteria) this;
        }

        public Criteria andCultureSportAmusementIndustryGreaterThan(Integer value) {
            addCriterion("culture_sport_amusement_industry >", value, "cultureSportAmusementIndustry");
            return (Criteria) this;
        }

        public Criteria andCultureSportAmusementIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("culture_sport_amusement_industry >=", value, "cultureSportAmusementIndustry");
            return (Criteria) this;
        }

        public Criteria andCultureSportAmusementIndustryLessThan(Integer value) {
            addCriterion("culture_sport_amusement_industry <", value, "cultureSportAmusementIndustry");
            return (Criteria) this;
        }

        public Criteria andCultureSportAmusementIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("culture_sport_amusement_industry <=", value, "cultureSportAmusementIndustry");
            return (Criteria) this;
        }

        public Criteria andCultureSportAmusementIndustryIn(List<Integer> values) {
            addCriterion("culture_sport_amusement_industry in", values, "cultureSportAmusementIndustry");
            return (Criteria) this;
        }

        public Criteria andCultureSportAmusementIndustryNotIn(List<Integer> values) {
            addCriterion("culture_sport_amusement_industry not in", values, "cultureSportAmusementIndustry");
            return (Criteria) this;
        }

        public Criteria andCultureSportAmusementIndustryBetween(Integer value1, Integer value2) {
            addCriterion("culture_sport_amusement_industry between", value1, value2, "cultureSportAmusementIndustry");
            return (Criteria) this;
        }

        public Criteria andCultureSportAmusementIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("culture_sport_amusement_industry not between", value1, value2, "cultureSportAmusementIndustry");
            return (Criteria) this;
        }

        public Criteria andPublicSocialSeSocialOrIsNull() {
            addCriterion("public_social_se_social_or is null");
            return (Criteria) this;
        }

        public Criteria andPublicSocialSeSocialOrIsNotNull() {
            addCriterion("public_social_se_social_or is not null");
            return (Criteria) this;
        }

        public Criteria andPublicSocialSeSocialOrEqualTo(Integer value) {
            addCriterion("public_social_se_social_or =", value, "publicSocialSeSocialOr");
            return (Criteria) this;
        }

        public Criteria andPublicSocialSeSocialOrNotEqualTo(Integer value) {
            addCriterion("public_social_se_social_or <>", value, "publicSocialSeSocialOr");
            return (Criteria) this;
        }

        public Criteria andPublicSocialSeSocialOrGreaterThan(Integer value) {
            addCriterion("public_social_se_social_or >", value, "publicSocialSeSocialOr");
            return (Criteria) this;
        }

        public Criteria andPublicSocialSeSocialOrGreaterThanOrEqualTo(Integer value) {
            addCriterion("public_social_se_social_or >=", value, "publicSocialSeSocialOr");
            return (Criteria) this;
        }

        public Criteria andPublicSocialSeSocialOrLessThan(Integer value) {
            addCriterion("public_social_se_social_or <", value, "publicSocialSeSocialOr");
            return (Criteria) this;
        }

        public Criteria andPublicSocialSeSocialOrLessThanOrEqualTo(Integer value) {
            addCriterion("public_social_se_social_or <=", value, "publicSocialSeSocialOr");
            return (Criteria) this;
        }

        public Criteria andPublicSocialSeSocialOrIn(List<Integer> values) {
            addCriterion("public_social_se_social_or in", values, "publicSocialSeSocialOr");
            return (Criteria) this;
        }

        public Criteria andPublicSocialSeSocialOrNotIn(List<Integer> values) {
            addCriterion("public_social_se_social_or not in", values, "publicSocialSeSocialOr");
            return (Criteria) this;
        }

        public Criteria andPublicSocialSeSocialOrBetween(Integer value1, Integer value2) {
            addCriterion("public_social_se_social_or between", value1, value2, "publicSocialSeSocialOr");
            return (Criteria) this;
        }

        public Criteria andPublicSocialSeSocialOrNotBetween(Integer value1, Integer value2) {
            addCriterion("public_social_se_social_or not between", value1, value2, "publicSocialSeSocialOr");
            return (Criteria) this;
        }

        public Criteria andInternationalOrganizationIsNull() {
            addCriterion("international_organization is null");
            return (Criteria) this;
        }

        public Criteria andInternationalOrganizationIsNotNull() {
            addCriterion("international_organization is not null");
            return (Criteria) this;
        }

        public Criteria andInternationalOrganizationEqualTo(Integer value) {
            addCriterion("international_organization =", value, "internationalOrganization");
            return (Criteria) this;
        }

        public Criteria andInternationalOrganizationNotEqualTo(Integer value) {
            addCriterion("international_organization <>", value, "internationalOrganization");
            return (Criteria) this;
        }

        public Criteria andInternationalOrganizationGreaterThan(Integer value) {
            addCriterion("international_organization >", value, "internationalOrganization");
            return (Criteria) this;
        }

        public Criteria andInternationalOrganizationGreaterThanOrEqualTo(Integer value) {
            addCriterion("international_organization >=", value, "internationalOrganization");
            return (Criteria) this;
        }

        public Criteria andInternationalOrganizationLessThan(Integer value) {
            addCriterion("international_organization <", value, "internationalOrganization");
            return (Criteria) this;
        }

        public Criteria andInternationalOrganizationLessThanOrEqualTo(Integer value) {
            addCriterion("international_organization <=", value, "internationalOrganization");
            return (Criteria) this;
        }

        public Criteria andInternationalOrganizationIn(List<Integer> values) {
            addCriterion("international_organization in", values, "internationalOrganization");
            return (Criteria) this;
        }

        public Criteria andInternationalOrganizationNotIn(List<Integer> values) {
            addCriterion("international_organization not in", values, "internationalOrganization");
            return (Criteria) this;
        }

        public Criteria andInternationalOrganizationBetween(Integer value1, Integer value2) {
            addCriterion("international_organization between", value1, value2, "internationalOrganization");
            return (Criteria) this;
        }

        public Criteria andInternationalOrganizationNotBetween(Integer value1, Integer value2) {
            addCriterion("international_organization not between", value1, value2, "internationalOrganization");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}