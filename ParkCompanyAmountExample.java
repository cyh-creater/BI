package com.zx.business.pojo;

import java.util.ArrayList;
import java.util.List;

public class ParkCompanyAmountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParkCompanyAmountExample() {
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

        public Criteria andPublicCompanyIsNull() {
            addCriterion("public_company is null");
            return (Criteria) this;
        }

        public Criteria andPublicCompanyIsNotNull() {
            addCriterion("public_company is not null");
            return (Criteria) this;
        }

        public Criteria andPublicCompanyEqualTo(Integer value) {
            addCriterion("public_company =", value, "publicCompany");
            return (Criteria) this;
        }

        public Criteria andPublicCompanyNotEqualTo(Integer value) {
            addCriterion("public_company <>", value, "publicCompany");
            return (Criteria) this;
        }

        public Criteria andPublicCompanyGreaterThan(Integer value) {
            addCriterion("public_company >", value, "publicCompany");
            return (Criteria) this;
        }

        public Criteria andPublicCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("public_company >=", value, "publicCompany");
            return (Criteria) this;
        }

        public Criteria andPublicCompanyLessThan(Integer value) {
            addCriterion("public_company <", value, "publicCompany");
            return (Criteria) this;
        }

        public Criteria andPublicCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("public_company <=", value, "publicCompany");
            return (Criteria) this;
        }

        public Criteria andPublicCompanyIn(List<Integer> values) {
            addCriterion("public_company in", values, "publicCompany");
            return (Criteria) this;
        }

        public Criteria andPublicCompanyNotIn(List<Integer> values) {
            addCriterion("public_company not in", values, "publicCompany");
            return (Criteria) this;
        }

        public Criteria andPublicCompanyBetween(Integer value1, Integer value2) {
            addCriterion("public_company between", value1, value2, "publicCompany");
            return (Criteria) this;
        }

        public Criteria andPublicCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("public_company not between", value1, value2, "publicCompany");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyIsNull() {
            addCriterion("group_company is null");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyIsNotNull() {
            addCriterion("group_company is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyEqualTo(Integer value) {
            addCriterion("group_company =", value, "groupCompany");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNotEqualTo(Integer value) {
            addCriterion("group_company <>", value, "groupCompany");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyGreaterThan(Integer value) {
            addCriterion("group_company >", value, "groupCompany");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_company >=", value, "groupCompany");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyLessThan(Integer value) {
            addCriterion("group_company <", value, "groupCompany");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("group_company <=", value, "groupCompany");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyIn(List<Integer> values) {
            addCriterion("group_company in", values, "groupCompany");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNotIn(List<Integer> values) {
            addCriterion("group_company not in", values, "groupCompany");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyBetween(Integer value1, Integer value2) {
            addCriterion("group_company between", value1, value2, "groupCompany");
            return (Criteria) this;
        }

        public Criteria andGroupCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("group_company not between", value1, value2, "groupCompany");
            return (Criteria) this;
        }

        public Criteria andShareCooperateCompanyIsNull() {
            addCriterion("share_cooperate_company is null");
            return (Criteria) this;
        }

        public Criteria andShareCooperateCompanyIsNotNull() {
            addCriterion("share_cooperate_company is not null");
            return (Criteria) this;
        }

        public Criteria andShareCooperateCompanyEqualTo(Integer value) {
            addCriterion("share_cooperate_company =", value, "shareCooperateCompany");
            return (Criteria) this;
        }

        public Criteria andShareCooperateCompanyNotEqualTo(Integer value) {
            addCriterion("share_cooperate_company <>", value, "shareCooperateCompany");
            return (Criteria) this;
        }

        public Criteria andShareCooperateCompanyGreaterThan(Integer value) {
            addCriterion("share_cooperate_company >", value, "shareCooperateCompany");
            return (Criteria) this;
        }

        public Criteria andShareCooperateCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_cooperate_company >=", value, "shareCooperateCompany");
            return (Criteria) this;
        }

        public Criteria andShareCooperateCompanyLessThan(Integer value) {
            addCriterion("share_cooperate_company <", value, "shareCooperateCompany");
            return (Criteria) this;
        }

        public Criteria andShareCooperateCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("share_cooperate_company <=", value, "shareCooperateCompany");
            return (Criteria) this;
        }

        public Criteria andShareCooperateCompanyIn(List<Integer> values) {
            addCriterion("share_cooperate_company in", values, "shareCooperateCompany");
            return (Criteria) this;
        }

        public Criteria andShareCooperateCompanyNotIn(List<Integer> values) {
            addCriterion("share_cooperate_company not in", values, "shareCooperateCompany");
            return (Criteria) this;
        }

        public Criteria andShareCooperateCompanyBetween(Integer value1, Integer value2) {
            addCriterion("share_cooperate_company between", value1, value2, "shareCooperateCompany");
            return (Criteria) this;
        }

        public Criteria andShareCooperateCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("share_cooperate_company not between", value1, value2, "shareCooperateCompany");
            return (Criteria) this;
        }

        public Criteria andLianYingCompanyIsNull() {
            addCriterion("lian_ying_company is null");
            return (Criteria) this;
        }

        public Criteria andLianYingCompanyIsNotNull() {
            addCriterion("lian_ying_company is not null");
            return (Criteria) this;
        }

        public Criteria andLianYingCompanyEqualTo(Integer value) {
            addCriterion("lian_ying_company =", value, "lianYingCompany");
            return (Criteria) this;
        }

        public Criteria andLianYingCompanyNotEqualTo(Integer value) {
            addCriterion("lian_ying_company <>", value, "lianYingCompany");
            return (Criteria) this;
        }

        public Criteria andLianYingCompanyGreaterThan(Integer value) {
            addCriterion("lian_ying_company >", value, "lianYingCompany");
            return (Criteria) this;
        }

        public Criteria andLianYingCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("lian_ying_company >=", value, "lianYingCompany");
            return (Criteria) this;
        }

        public Criteria andLianYingCompanyLessThan(Integer value) {
            addCriterion("lian_ying_company <", value, "lianYingCompany");
            return (Criteria) this;
        }

        public Criteria andLianYingCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("lian_ying_company <=", value, "lianYingCompany");
            return (Criteria) this;
        }

        public Criteria andLianYingCompanyIn(List<Integer> values) {
            addCriterion("lian_ying_company in", values, "lianYingCompany");
            return (Criteria) this;
        }

        public Criteria andLianYingCompanyNotIn(List<Integer> values) {
            addCriterion("lian_ying_company not in", values, "lianYingCompany");
            return (Criteria) this;
        }

        public Criteria andLianYingCompanyBetween(Integer value1, Integer value2) {
            addCriterion("lian_ying_company between", value1, value2, "lianYingCompany");
            return (Criteria) this;
        }

        public Criteria andLianYingCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("lian_ying_company not between", value1, value2, "lianYingCompany");
            return (Criteria) this;
        }

        public Criteria andLimitedLiabilityCompanyIsNull() {
            addCriterion("limited_liability_company is null");
            return (Criteria) this;
        }

        public Criteria andLimitedLiabilityCompanyIsNotNull() {
            addCriterion("limited_liability_company is not null");
            return (Criteria) this;
        }

        public Criteria andLimitedLiabilityCompanyEqualTo(Integer value) {
            addCriterion("limited_liability_company =", value, "limitedLiabilityCompany");
            return (Criteria) this;
        }

        public Criteria andLimitedLiabilityCompanyNotEqualTo(Integer value) {
            addCriterion("limited_liability_company <>", value, "limitedLiabilityCompany");
            return (Criteria) this;
        }

        public Criteria andLimitedLiabilityCompanyGreaterThan(Integer value) {
            addCriterion("limited_liability_company >", value, "limitedLiabilityCompany");
            return (Criteria) this;
        }

        public Criteria andLimitedLiabilityCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("limited_liability_company >=", value, "limitedLiabilityCompany");
            return (Criteria) this;
        }

        public Criteria andLimitedLiabilityCompanyLessThan(Integer value) {
            addCriterion("limited_liability_company <", value, "limitedLiabilityCompany");
            return (Criteria) this;
        }

        public Criteria andLimitedLiabilityCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("limited_liability_company <=", value, "limitedLiabilityCompany");
            return (Criteria) this;
        }

        public Criteria andLimitedLiabilityCompanyIn(List<Integer> values) {
            addCriterion("limited_liability_company in", values, "limitedLiabilityCompany");
            return (Criteria) this;
        }

        public Criteria andLimitedLiabilityCompanyNotIn(List<Integer> values) {
            addCriterion("limited_liability_company not in", values, "limitedLiabilityCompany");
            return (Criteria) this;
        }

        public Criteria andLimitedLiabilityCompanyBetween(Integer value1, Integer value2) {
            addCriterion("limited_liability_company between", value1, value2, "limitedLiabilityCompany");
            return (Criteria) this;
        }

        public Criteria andLimitedLiabilityCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("limited_liability_company not between", value1, value2, "limitedLiabilityCompany");
            return (Criteria) this;
        }

        public Criteria andShareLimitedCompanyIsNull() {
            addCriterion("share_limited_company is null");
            return (Criteria) this;
        }

        public Criteria andShareLimitedCompanyIsNotNull() {
            addCriterion("share_limited_company is not null");
            return (Criteria) this;
        }

        public Criteria andShareLimitedCompanyEqualTo(Integer value) {
            addCriterion("share_limited_company =", value, "shareLimitedCompany");
            return (Criteria) this;
        }

        public Criteria andShareLimitedCompanyNotEqualTo(Integer value) {
            addCriterion("share_limited_company <>", value, "shareLimitedCompany");
            return (Criteria) this;
        }

        public Criteria andShareLimitedCompanyGreaterThan(Integer value) {
            addCriterion("share_limited_company >", value, "shareLimitedCompany");
            return (Criteria) this;
        }

        public Criteria andShareLimitedCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_limited_company >=", value, "shareLimitedCompany");
            return (Criteria) this;
        }

        public Criteria andShareLimitedCompanyLessThan(Integer value) {
            addCriterion("share_limited_company <", value, "shareLimitedCompany");
            return (Criteria) this;
        }

        public Criteria andShareLimitedCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("share_limited_company <=", value, "shareLimitedCompany");
            return (Criteria) this;
        }

        public Criteria andShareLimitedCompanyIn(List<Integer> values) {
            addCriterion("share_limited_company in", values, "shareLimitedCompany");
            return (Criteria) this;
        }

        public Criteria andShareLimitedCompanyNotIn(List<Integer> values) {
            addCriterion("share_limited_company not in", values, "shareLimitedCompany");
            return (Criteria) this;
        }

        public Criteria andShareLimitedCompanyBetween(Integer value1, Integer value2) {
            addCriterion("share_limited_company between", value1, value2, "shareLimitedCompany");
            return (Criteria) this;
        }

        public Criteria andShareLimitedCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("share_limited_company not between", value1, value2, "shareLimitedCompany");
            return (Criteria) this;
        }

        public Criteria andPrivateCompanyIsNull() {
            addCriterion("private_company is null");
            return (Criteria) this;
        }

        public Criteria andPrivateCompanyIsNotNull() {
            addCriterion("private_company is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateCompanyEqualTo(Integer value) {
            addCriterion("private_company =", value, "privateCompany");
            return (Criteria) this;
        }

        public Criteria andPrivateCompanyNotEqualTo(Integer value) {
            addCriterion("private_company <>", value, "privateCompany");
            return (Criteria) this;
        }

        public Criteria andPrivateCompanyGreaterThan(Integer value) {
            addCriterion("private_company >", value, "privateCompany");
            return (Criteria) this;
        }

        public Criteria andPrivateCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("private_company >=", value, "privateCompany");
            return (Criteria) this;
        }

        public Criteria andPrivateCompanyLessThan(Integer value) {
            addCriterion("private_company <", value, "privateCompany");
            return (Criteria) this;
        }

        public Criteria andPrivateCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("private_company <=", value, "privateCompany");
            return (Criteria) this;
        }

        public Criteria andPrivateCompanyIn(List<Integer> values) {
            addCriterion("private_company in", values, "privateCompany");
            return (Criteria) this;
        }

        public Criteria andPrivateCompanyNotIn(List<Integer> values) {
            addCriterion("private_company not in", values, "privateCompany");
            return (Criteria) this;
        }

        public Criteria andPrivateCompanyBetween(Integer value1, Integer value2) {
            addCriterion("private_company between", value1, value2, "privateCompany");
            return (Criteria) this;
        }

        public Criteria andPrivateCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("private_company not between", value1, value2, "privateCompany");
            return (Criteria) this;
        }

        public Criteria andHkMTCompanyIsNull() {
            addCriterion("hk_m_t_company is null");
            return (Criteria) this;
        }

        public Criteria andHkMTCompanyIsNotNull() {
            addCriterion("hk_m_t_company is not null");
            return (Criteria) this;
        }

        public Criteria andHkMTCompanyEqualTo(Integer value) {
            addCriterion("hk_m_t_company =", value, "hkMTCompany");
            return (Criteria) this;
        }

        public Criteria andHkMTCompanyNotEqualTo(Integer value) {
            addCriterion("hk_m_t_company <>", value, "hkMTCompany");
            return (Criteria) this;
        }

        public Criteria andHkMTCompanyGreaterThan(Integer value) {
            addCriterion("hk_m_t_company >", value, "hkMTCompany");
            return (Criteria) this;
        }

        public Criteria andHkMTCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("hk_m_t_company >=", value, "hkMTCompany");
            return (Criteria) this;
        }

        public Criteria andHkMTCompanyLessThan(Integer value) {
            addCriterion("hk_m_t_company <", value, "hkMTCompany");
            return (Criteria) this;
        }

        public Criteria andHkMTCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("hk_m_t_company <=", value, "hkMTCompany");
            return (Criteria) this;
        }

        public Criteria andHkMTCompanyIn(List<Integer> values) {
            addCriterion("hk_m_t_company in", values, "hkMTCompany");
            return (Criteria) this;
        }

        public Criteria andHkMTCompanyNotIn(List<Integer> values) {
            addCriterion("hk_m_t_company not in", values, "hkMTCompany");
            return (Criteria) this;
        }

        public Criteria andHkMTCompanyBetween(Integer value1, Integer value2) {
            addCriterion("hk_m_t_company between", value1, value2, "hkMTCompany");
            return (Criteria) this;
        }

        public Criteria andHkMTCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("hk_m_t_company not between", value1, value2, "hkMTCompany");
            return (Criteria) this;
        }

        public Criteria andForeignCompanyIsNull() {
            addCriterion("foreign_company is null");
            return (Criteria) this;
        }

        public Criteria andForeignCompanyIsNotNull() {
            addCriterion("foreign_company is not null");
            return (Criteria) this;
        }

        public Criteria andForeignCompanyEqualTo(Integer value) {
            addCriterion("foreign_company =", value, "foreignCompany");
            return (Criteria) this;
        }

        public Criteria andForeignCompanyNotEqualTo(Integer value) {
            addCriterion("foreign_company <>", value, "foreignCompany");
            return (Criteria) this;
        }

        public Criteria andForeignCompanyGreaterThan(Integer value) {
            addCriterion("foreign_company >", value, "foreignCompany");
            return (Criteria) this;
        }

        public Criteria andForeignCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("foreign_company >=", value, "foreignCompany");
            return (Criteria) this;
        }

        public Criteria andForeignCompanyLessThan(Integer value) {
            addCriterion("foreign_company <", value, "foreignCompany");
            return (Criteria) this;
        }

        public Criteria andForeignCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("foreign_company <=", value, "foreignCompany");
            return (Criteria) this;
        }

        public Criteria andForeignCompanyIn(List<Integer> values) {
            addCriterion("foreign_company in", values, "foreignCompany");
            return (Criteria) this;
        }

        public Criteria andForeignCompanyNotIn(List<Integer> values) {
            addCriterion("foreign_company not in", values, "foreignCompany");
            return (Criteria) this;
        }

        public Criteria andForeignCompanyBetween(Integer value1, Integer value2) {
            addCriterion("foreign_company between", value1, value2, "foreignCompany");
            return (Criteria) this;
        }

        public Criteria andForeignCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("foreign_company not between", value1, value2, "foreignCompany");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(Integer value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(Integer value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(Integer value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(Integer value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(Integer value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(Integer value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<Integer> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<Integer> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(Integer value1, Integer value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(Integer value1, Integer value2) {
            addCriterion("other not between", value1, value2, "other");
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