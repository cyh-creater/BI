package com.zx.business.pojo;

import java.util.ArrayList;
import java.util.List;

public class ParkTaxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParkTaxExample() {
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

        public Criteria andParkNameIsNull() {
            addCriterion("park_name is null");
            return (Criteria) this;
        }

        public Criteria andParkNameIsNotNull() {
            addCriterion("park_name is not null");
            return (Criteria) this;
        }

        public Criteria andParkNameEqualTo(String value) {
            addCriterion("park_name =", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotEqualTo(String value) {
            addCriterion("park_name <>", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameGreaterThan(String value) {
            addCriterion("park_name >", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameGreaterThanOrEqualTo(String value) {
            addCriterion("park_name >=", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLessThan(String value) {
            addCriterion("park_name <", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLessThanOrEqualTo(String value) {
            addCriterion("park_name <=", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLike(String value) {
            addCriterion("park_name like", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotLike(String value) {
            addCriterion("park_name not like", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameIn(List<String> values) {
            addCriterion("park_name in", values, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotIn(List<String> values) {
            addCriterion("park_name not in", values, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameBetween(String value1, String value2) {
            addCriterion("park_name between", value1, value2, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotBetween(String value1, String value2) {
            addCriterion("park_name not between", value1, value2, "parkName");
            return (Criteria) this;
        }

        public Criteria andPTaxIsNull() {
            addCriterion("p_tax is null");
            return (Criteria) this;
        }

        public Criteria andPTaxIsNotNull() {
            addCriterion("p_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPTaxEqualTo(String value) {
            addCriterion("p_tax =", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxNotEqualTo(String value) {
            addCriterion("p_tax <>", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxGreaterThan(String value) {
            addCriterion("p_tax >", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxGreaterThanOrEqualTo(String value) {
            addCriterion("p_tax >=", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxLessThan(String value) {
            addCriterion("p_tax <", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxLessThanOrEqualTo(String value) {
            addCriterion("p_tax <=", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxLike(String value) {
            addCriterion("p_tax like", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxNotLike(String value) {
            addCriterion("p_tax not like", value, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxIn(List<String> values) {
            addCriterion("p_tax in", values, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxNotIn(List<String> values) {
            addCriterion("p_tax not in", values, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxBetween(String value1, String value2) {
            addCriterion("p_tax between", value1, value2, "pTax");
            return (Criteria) this;
        }

        public Criteria andPTaxNotBetween(String value1, String value2) {
            addCriterion("p_tax not between", value1, value2, "pTax");
            return (Criteria) this;
        }

        public Criteria andPElectricIsNull() {
            addCriterion("P_electric is null");
            return (Criteria) this;
        }

        public Criteria andPElectricIsNotNull() {
            addCriterion("P_electric is not null");
            return (Criteria) this;
        }

        public Criteria andPElectricEqualTo(String value) {
            addCriterion("P_electric =", value, "pElectric");
            return (Criteria) this;
        }

        public Criteria andPElectricNotEqualTo(String value) {
            addCriterion("P_electric <>", value, "pElectric");
            return (Criteria) this;
        }

        public Criteria andPElectricGreaterThan(String value) {
            addCriterion("P_electric >", value, "pElectric");
            return (Criteria) this;
        }

        public Criteria andPElectricGreaterThanOrEqualTo(String value) {
            addCriterion("P_electric >=", value, "pElectric");
            return (Criteria) this;
        }

        public Criteria andPElectricLessThan(String value) {
            addCriterion("P_electric <", value, "pElectric");
            return (Criteria) this;
        }

        public Criteria andPElectricLessThanOrEqualTo(String value) {
            addCriterion("P_electric <=", value, "pElectric");
            return (Criteria) this;
        }

        public Criteria andPElectricLike(String value) {
            addCriterion("P_electric like", value, "pElectric");
            return (Criteria) this;
        }

        public Criteria andPElectricNotLike(String value) {
            addCriterion("P_electric not like", value, "pElectric");
            return (Criteria) this;
        }

        public Criteria andPElectricIn(List<String> values) {
            addCriterion("P_electric in", values, "pElectric");
            return (Criteria) this;
        }

        public Criteria andPElectricNotIn(List<String> values) {
            addCriterion("P_electric not in", values, "pElectric");
            return (Criteria) this;
        }

        public Criteria andPElectricBetween(String value1, String value2) {
            addCriterion("P_electric between", value1, value2, "pElectric");
            return (Criteria) this;
        }

        public Criteria andPElectricNotBetween(String value1, String value2) {
            addCriterion("P_electric not between", value1, value2, "pElectric");
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