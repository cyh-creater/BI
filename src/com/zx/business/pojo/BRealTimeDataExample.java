package com.zx.business.pojo;

import java.util.ArrayList;
import java.util.List;

public class BRealTimeDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BRealTimeDataExample() {
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

        public Criteria andRTypeIsNull() {
            addCriterion("r_type is null");
            return (Criteria) this;
        }

        public Criteria andRTypeIsNotNull() {
            addCriterion("r_type is not null");
            return (Criteria) this;
        }

        public Criteria andRTypeEqualTo(String value) {
            addCriterion("r_type =", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotEqualTo(String value) {
            addCriterion("r_type <>", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThan(String value) {
            addCriterion("r_type >", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThanOrEqualTo(String value) {
            addCriterion("r_type >=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThan(String value) {
            addCriterion("r_type <", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThanOrEqualTo(String value) {
            addCriterion("r_type <=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLike(String value) {
            addCriterion("r_type like", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotLike(String value) {
            addCriterion("r_type not like", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeIn(List<String> values) {
            addCriterion("r_type in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotIn(List<String> values) {
            addCriterion("r_type not in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeBetween(String value1, String value2) {
            addCriterion("r_type between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotBetween(String value1, String value2) {
            addCriterion("r_type not between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andRNumberIsNull() {
            addCriterion("r_number is null");
            return (Criteria) this;
        }

        public Criteria andRNumberIsNotNull() {
            addCriterion("r_number is not null");
            return (Criteria) this;
        }

        public Criteria andRNumberEqualTo(String value) {
            addCriterion("r_number =", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotEqualTo(String value) {
            addCriterion("r_number <>", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberGreaterThan(String value) {
            addCriterion("r_number >", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberGreaterThanOrEqualTo(String value) {
            addCriterion("r_number >=", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLessThan(String value) {
            addCriterion("r_number <", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLessThanOrEqualTo(String value) {
            addCriterion("r_number <=", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLike(String value) {
            addCriterion("r_number like", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotLike(String value) {
            addCriterion("r_number not like", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberIn(List<String> values) {
            addCriterion("r_number in", values, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotIn(List<String> values) {
            addCriterion("r_number not in", values, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberBetween(String value1, String value2) {
            addCriterion("r_number between", value1, value2, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotBetween(String value1, String value2) {
            addCriterion("r_number not between", value1, value2, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRRisingIsNull() {
            addCriterion("r_rising is null");
            return (Criteria) this;
        }

        public Criteria andRRisingIsNotNull() {
            addCriterion("r_rising is not null");
            return (Criteria) this;
        }

        public Criteria andRRisingEqualTo(String value) {
            addCriterion("r_rising =", value, "rRising");
            return (Criteria) this;
        }

        public Criteria andRRisingNotEqualTo(String value) {
            addCriterion("r_rising <>", value, "rRising");
            return (Criteria) this;
        }

        public Criteria andRRisingGreaterThan(String value) {
            addCriterion("r_rising >", value, "rRising");
            return (Criteria) this;
        }

        public Criteria andRRisingGreaterThanOrEqualTo(String value) {
            addCriterion("r_rising >=", value, "rRising");
            return (Criteria) this;
        }

        public Criteria andRRisingLessThan(String value) {
            addCriterion("r_rising <", value, "rRising");
            return (Criteria) this;
        }

        public Criteria andRRisingLessThanOrEqualTo(String value) {
            addCriterion("r_rising <=", value, "rRising");
            return (Criteria) this;
        }

        public Criteria andRRisingLike(String value) {
            addCriterion("r_rising like", value, "rRising");
            return (Criteria) this;
        }

        public Criteria andRRisingNotLike(String value) {
            addCriterion("r_rising not like", value, "rRising");
            return (Criteria) this;
        }

        public Criteria andRRisingIn(List<String> values) {
            addCriterion("r_rising in", values, "rRising");
            return (Criteria) this;
        }

        public Criteria andRRisingNotIn(List<String> values) {
            addCriterion("r_rising not in", values, "rRising");
            return (Criteria) this;
        }

        public Criteria andRRisingBetween(String value1, String value2) {
            addCriterion("r_rising between", value1, value2, "rRising");
            return (Criteria) this;
        }

        public Criteria andRRisingNotBetween(String value1, String value2) {
            addCriterion("r_rising not between", value1, value2, "rRising");
            return (Criteria) this;
        }

        public Criteria andRQnumberIsNull() {
            addCriterion("r_qnumber is null");
            return (Criteria) this;
        }

        public Criteria andRQnumberIsNotNull() {
            addCriterion("r_qnumber is not null");
            return (Criteria) this;
        }

        public Criteria andRQnumberEqualTo(String value) {
            addCriterion("r_qnumber =", value, "rQnumber");
            return (Criteria) this;
        }

        public Criteria andRQnumberNotEqualTo(String value) {
            addCriterion("r_qnumber <>", value, "rQnumber");
            return (Criteria) this;
        }

        public Criteria andRQnumberGreaterThan(String value) {
            addCriterion("r_qnumber >", value, "rQnumber");
            return (Criteria) this;
        }

        public Criteria andRQnumberGreaterThanOrEqualTo(String value) {
            addCriterion("r_qnumber >=", value, "rQnumber");
            return (Criteria) this;
        }

        public Criteria andRQnumberLessThan(String value) {
            addCriterion("r_qnumber <", value, "rQnumber");
            return (Criteria) this;
        }

        public Criteria andRQnumberLessThanOrEqualTo(String value) {
            addCriterion("r_qnumber <=", value, "rQnumber");
            return (Criteria) this;
        }

        public Criteria andRQnumberLike(String value) {
            addCriterion("r_qnumber like", value, "rQnumber");
            return (Criteria) this;
        }

        public Criteria andRQnumberNotLike(String value) {
            addCriterion("r_qnumber not like", value, "rQnumber");
            return (Criteria) this;
        }

        public Criteria andRQnumberIn(List<String> values) {
            addCriterion("r_qnumber in", values, "rQnumber");
            return (Criteria) this;
        }

        public Criteria andRQnumberNotIn(List<String> values) {
            addCriterion("r_qnumber not in", values, "rQnumber");
            return (Criteria) this;
        }

        public Criteria andRQnumberBetween(String value1, String value2) {
            addCriterion("r_qnumber between", value1, value2, "rQnumber");
            return (Criteria) this;
        }

        public Criteria andRQnumberNotBetween(String value1, String value2) {
            addCriterion("r_qnumber not between", value1, value2, "rQnumber");
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