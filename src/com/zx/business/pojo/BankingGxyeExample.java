package com.zx.business.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankingGxyeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankingGxyeExample() {
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

        public Criteria andBankingCkyeIsNull() {
            addCriterion("banking_ckye is null");
            return (Criteria) this;
        }

        public Criteria andBankingCkyeIsNotNull() {
            addCriterion("banking_ckye is not null");
            return (Criteria) this;
        }

        public Criteria andBankingCkyeEqualTo(Float value) {
            addCriterion("banking_ckye =", value, "bankingCkye");
            return (Criteria) this;
        }

        public Criteria andBankingCkyeNotEqualTo(Float value) {
            addCriterion("banking_ckye <>", value, "bankingCkye");
            return (Criteria) this;
        }

        public Criteria andBankingCkyeGreaterThan(Float value) {
            addCriterion("banking_ckye >", value, "bankingCkye");
            return (Criteria) this;
        }

        public Criteria andBankingCkyeGreaterThanOrEqualTo(Float value) {
            addCriterion("banking_ckye >=", value, "bankingCkye");
            return (Criteria) this;
        }

        public Criteria andBankingCkyeLessThan(Float value) {
            addCriterion("banking_ckye <", value, "bankingCkye");
            return (Criteria) this;
        }

        public Criteria andBankingCkyeLessThanOrEqualTo(Float value) {
            addCriterion("banking_ckye <=", value, "bankingCkye");
            return (Criteria) this;
        }

        public Criteria andBankingCkyeIn(List<Float> values) {
            addCriterion("banking_ckye in", values, "bankingCkye");
            return (Criteria) this;
        }

        public Criteria andBankingCkyeNotIn(List<Float> values) {
            addCriterion("banking_ckye not in", values, "bankingCkye");
            return (Criteria) this;
        }

        public Criteria andBankingCkyeBetween(Float value1, Float value2) {
            addCriterion("banking_ckye between", value1, value2, "bankingCkye");
            return (Criteria) this;
        }

        public Criteria andBankingCkyeNotBetween(Float value1, Float value2) {
            addCriterion("banking_ckye not between", value1, value2, "bankingCkye");
            return (Criteria) this;
        }

        public Criteria andBankingDkyeIsNull() {
            addCriterion("banking_dkye is null");
            return (Criteria) this;
        }

        public Criteria andBankingDkyeIsNotNull() {
            addCriterion("banking_dkye is not null");
            return (Criteria) this;
        }

        public Criteria andBankingDkyeEqualTo(Float value) {
            addCriterion("banking_dkye =", value, "bankingDkye");
            return (Criteria) this;
        }

        public Criteria andBankingDkyeNotEqualTo(Float value) {
            addCriterion("banking_dkye <>", value, "bankingDkye");
            return (Criteria) this;
        }

        public Criteria andBankingDkyeGreaterThan(Float value) {
            addCriterion("banking_dkye >", value, "bankingDkye");
            return (Criteria) this;
        }

        public Criteria andBankingDkyeGreaterThanOrEqualTo(Float value) {
            addCriterion("banking_dkye >=", value, "bankingDkye");
            return (Criteria) this;
        }

        public Criteria andBankingDkyeLessThan(Float value) {
            addCriterion("banking_dkye <", value, "bankingDkye");
            return (Criteria) this;
        }

        public Criteria andBankingDkyeLessThanOrEqualTo(Float value) {
            addCriterion("banking_dkye <=", value, "bankingDkye");
            return (Criteria) this;
        }

        public Criteria andBankingDkyeIn(List<Float> values) {
            addCriterion("banking_dkye in", values, "bankingDkye");
            return (Criteria) this;
        }

        public Criteria andBankingDkyeNotIn(List<Float> values) {
            addCriterion("banking_dkye not in", values, "bankingDkye");
            return (Criteria) this;
        }

        public Criteria andBankingDkyeBetween(Float value1, Float value2) {
            addCriterion("banking_dkye between", value1, value2, "bankingDkye");
            return (Criteria) this;
        }

        public Criteria andBankingDkyeNotBetween(Float value1, Float value2) {
            addCriterion("banking_dkye not between", value1, value2, "bankingDkye");
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