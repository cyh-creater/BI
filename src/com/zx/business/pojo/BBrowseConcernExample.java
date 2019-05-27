package com.zx.business.pojo;

import java.util.ArrayList;
import java.util.List;

public class BBrowseConcernExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BBrowseConcernExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBCloseIsNull() {
            addCriterion("b_close is null");
            return (Criteria) this;
        }

        public Criteria andBCloseIsNotNull() {
            addCriterion("b_close is not null");
            return (Criteria) this;
        }

        public Criteria andBCloseEqualTo(Integer value) {
            addCriterion("b_close =", value, "bClose");
            return (Criteria) this;
        }

        public Criteria andBCloseNotEqualTo(Integer value) {
            addCriterion("b_close <>", value, "bClose");
            return (Criteria) this;
        }

        public Criteria andBCloseGreaterThan(Integer value) {
            addCriterion("b_close >", value, "bClose");
            return (Criteria) this;
        }

        public Criteria andBCloseGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_close >=", value, "bClose");
            return (Criteria) this;
        }

        public Criteria andBCloseLessThan(Integer value) {
            addCriterion("b_close <", value, "bClose");
            return (Criteria) this;
        }

        public Criteria andBCloseLessThanOrEqualTo(Integer value) {
            addCriterion("b_close <=", value, "bClose");
            return (Criteria) this;
        }

        public Criteria andBCloseIn(List<Integer> values) {
            addCriterion("b_close in", values, "bClose");
            return (Criteria) this;
        }

        public Criteria andBCloseNotIn(List<Integer> values) {
            addCriterion("b_close not in", values, "bClose");
            return (Criteria) this;
        }

        public Criteria andBCloseBetween(Integer value1, Integer value2) {
            addCriterion("b_close between", value1, value2, "bClose");
            return (Criteria) this;
        }

        public Criteria andBCloseNotBetween(Integer value1, Integer value2) {
            addCriterion("b_close not between", value1, value2, "bClose");
            return (Criteria) this;
        }

        public Criteria andBReleaseInfoIsNull() {
            addCriterion("b_release_info is null");
            return (Criteria) this;
        }

        public Criteria andBReleaseInfoIsNotNull() {
            addCriterion("b_release_info is not null");
            return (Criteria) this;
        }

        public Criteria andBReleaseInfoEqualTo(Integer value) {
            addCriterion("b_release_info =", value, "bReleaseInfo");
            return (Criteria) this;
        }

        public Criteria andBReleaseInfoNotEqualTo(Integer value) {
            addCriterion("b_release_info <>", value, "bReleaseInfo");
            return (Criteria) this;
        }

        public Criteria andBReleaseInfoGreaterThan(Integer value) {
            addCriterion("b_release_info >", value, "bReleaseInfo");
            return (Criteria) this;
        }

        public Criteria andBReleaseInfoGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_release_info >=", value, "bReleaseInfo");
            return (Criteria) this;
        }

        public Criteria andBReleaseInfoLessThan(Integer value) {
            addCriterion("b_release_info <", value, "bReleaseInfo");
            return (Criteria) this;
        }

        public Criteria andBReleaseInfoLessThanOrEqualTo(Integer value) {
            addCriterion("b_release_info <=", value, "bReleaseInfo");
            return (Criteria) this;
        }

        public Criteria andBReleaseInfoIn(List<Integer> values) {
            addCriterion("b_release_info in", values, "bReleaseInfo");
            return (Criteria) this;
        }

        public Criteria andBReleaseInfoNotIn(List<Integer> values) {
            addCriterion("b_release_info not in", values, "bReleaseInfo");
            return (Criteria) this;
        }

        public Criteria andBReleaseInfoBetween(Integer value1, Integer value2) {
            addCriterion("b_release_info between", value1, value2, "bReleaseInfo");
            return (Criteria) this;
        }

        public Criteria andBReleaseInfoNotBetween(Integer value1, Integer value2) {
            addCriterion("b_release_info not between", value1, value2, "bReleaseInfo");
            return (Criteria) this;
        }

        public Criteria andBVisitIsNull() {
            addCriterion("b_visit is null");
            return (Criteria) this;
        }

        public Criteria andBVisitIsNotNull() {
            addCriterion("b_visit is not null");
            return (Criteria) this;
        }

        public Criteria andBVisitEqualTo(Integer value) {
            addCriterion("b_visit =", value, "bVisit");
            return (Criteria) this;
        }

        public Criteria andBVisitNotEqualTo(Integer value) {
            addCriterion("b_visit <>", value, "bVisit");
            return (Criteria) this;
        }

        public Criteria andBVisitGreaterThan(Integer value) {
            addCriterion("b_visit >", value, "bVisit");
            return (Criteria) this;
        }

        public Criteria andBVisitGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_visit >=", value, "bVisit");
            return (Criteria) this;
        }

        public Criteria andBVisitLessThan(Integer value) {
            addCriterion("b_visit <", value, "bVisit");
            return (Criteria) this;
        }

        public Criteria andBVisitLessThanOrEqualTo(Integer value) {
            addCriterion("b_visit <=", value, "bVisit");
            return (Criteria) this;
        }

        public Criteria andBVisitIn(List<Integer> values) {
            addCriterion("b_visit in", values, "bVisit");
            return (Criteria) this;
        }

        public Criteria andBVisitNotIn(List<Integer> values) {
            addCriterion("b_visit not in", values, "bVisit");
            return (Criteria) this;
        }

        public Criteria andBVisitBetween(Integer value1, Integer value2) {
            addCriterion("b_visit between", value1, value2, "bVisit");
            return (Criteria) this;
        }

        public Criteria andBVisitNotBetween(Integer value1, Integer value2) {
            addCriterion("b_visit not between", value1, value2, "bVisit");
            return (Criteria) this;
        }

        public Criteria andBAccVisitIsNull() {
            addCriterion("b_acc_visit is null");
            return (Criteria) this;
        }

        public Criteria andBAccVisitIsNotNull() {
            addCriterion("b_acc_visit is not null");
            return (Criteria) this;
        }

        public Criteria andBAccVisitEqualTo(Integer value) {
            addCriterion("b_acc_visit =", value, "bAccVisit");
            return (Criteria) this;
        }

        public Criteria andBAccVisitNotEqualTo(Integer value) {
            addCriterion("b_acc_visit <>", value, "bAccVisit");
            return (Criteria) this;
        }

        public Criteria andBAccVisitGreaterThan(Integer value) {
            addCriterion("b_acc_visit >", value, "bAccVisit");
            return (Criteria) this;
        }

        public Criteria andBAccVisitGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_acc_visit >=", value, "bAccVisit");
            return (Criteria) this;
        }

        public Criteria andBAccVisitLessThan(Integer value) {
            addCriterion("b_acc_visit <", value, "bAccVisit");
            return (Criteria) this;
        }

        public Criteria andBAccVisitLessThanOrEqualTo(Integer value) {
            addCriterion("b_acc_visit <=", value, "bAccVisit");
            return (Criteria) this;
        }

        public Criteria andBAccVisitIn(List<Integer> values) {
            addCriterion("b_acc_visit in", values, "bAccVisit");
            return (Criteria) this;
        }

        public Criteria andBAccVisitNotIn(List<Integer> values) {
            addCriterion("b_acc_visit not in", values, "bAccVisit");
            return (Criteria) this;
        }

        public Criteria andBAccVisitBetween(Integer value1, Integer value2) {
            addCriterion("b_acc_visit between", value1, value2, "bAccVisit");
            return (Criteria) this;
        }

        public Criteria andBAccVisitNotBetween(Integer value1, Integer value2) {
            addCriterion("b_acc_visit not between", value1, value2, "bAccVisit");
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