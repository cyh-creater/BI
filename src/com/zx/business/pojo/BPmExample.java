package com.zx.business.pojo;

import java.util.ArrayList;
import java.util.List;

public class BPmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BPmExample() {
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

        public Criteria andPmDataIsNull() {
            addCriterion("pm_data is null");
            return (Criteria) this;
        }

        public Criteria andPmDataIsNotNull() {
            addCriterion("pm_data is not null");
            return (Criteria) this;
        }

        public Criteria andPmDataEqualTo(String value) {
            addCriterion("pm_data =", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataNotEqualTo(String value) {
            addCriterion("pm_data <>", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataGreaterThan(String value) {
            addCriterion("pm_data >", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataGreaterThanOrEqualTo(String value) {
            addCriterion("pm_data >=", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataLessThan(String value) {
            addCriterion("pm_data <", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataLessThanOrEqualTo(String value) {
            addCriterion("pm_data <=", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataLike(String value) {
            addCriterion("pm_data like", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataNotLike(String value) {
            addCriterion("pm_data not like", value, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataIn(List<String> values) {
            addCriterion("pm_data in", values, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataNotIn(List<String> values) {
            addCriterion("pm_data not in", values, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataBetween(String value1, String value2) {
            addCriterion("pm_data between", value1, value2, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmDataNotBetween(String value1, String value2) {
            addCriterion("pm_data not between", value1, value2, "pmData");
            return (Criteria) this;
        }

        public Criteria andPmTaxIsNull() {
            addCriterion("pm_tax is null");
            return (Criteria) this;
        }

        public Criteria andPmTaxIsNotNull() {
            addCriterion("pm_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPmTaxEqualTo(String value) {
            addCriterion("pm_tax =", value, "pmTax");
            return (Criteria) this;
        }

        public Criteria andPmTaxNotEqualTo(String value) {
            addCriterion("pm_tax <>", value, "pmTax");
            return (Criteria) this;
        }

        public Criteria andPmTaxGreaterThan(String value) {
            addCriterion("pm_tax >", value, "pmTax");
            return (Criteria) this;
        }

        public Criteria andPmTaxGreaterThanOrEqualTo(String value) {
            addCriterion("pm_tax >=", value, "pmTax");
            return (Criteria) this;
        }

        public Criteria andPmTaxLessThan(String value) {
            addCriterion("pm_tax <", value, "pmTax");
            return (Criteria) this;
        }

        public Criteria andPmTaxLessThanOrEqualTo(String value) {
            addCriterion("pm_tax <=", value, "pmTax");
            return (Criteria) this;
        }

        public Criteria andPmTaxLike(String value) {
            addCriterion("pm_tax like", value, "pmTax");
            return (Criteria) this;
        }

        public Criteria andPmTaxNotLike(String value) {
            addCriterion("pm_tax not like", value, "pmTax");
            return (Criteria) this;
        }

        public Criteria andPmTaxIn(List<String> values) {
            addCriterion("pm_tax in", values, "pmTax");
            return (Criteria) this;
        }

        public Criteria andPmTaxNotIn(List<String> values) {
            addCriterion("pm_tax not in", values, "pmTax");
            return (Criteria) this;
        }

        public Criteria andPmTaxBetween(String value1, String value2) {
            addCriterion("pm_tax between", value1, value2, "pmTax");
            return (Criteria) this;
        }

        public Criteria andPmTaxNotBetween(String value1, String value2) {
            addCriterion("pm_tax not between", value1, value2, "pmTax");
            return (Criteria) this;
        }

        public Criteria andPmElectricIsNull() {
            addCriterion("pm_electric is null");
            return (Criteria) this;
        }

        public Criteria andPmElectricIsNotNull() {
            addCriterion("pm_electric is not null");
            return (Criteria) this;
        }

        public Criteria andPmElectricEqualTo(Float value) {
            addCriterion("pm_electric =", value, "pmElectric");
            return (Criteria) this;
        }

        public Criteria andPmElectricNotEqualTo(Float value) {
            addCriterion("pm_electric <>", value, "pmElectric");
            return (Criteria) this;
        }

        public Criteria andPmElectricGreaterThan(Float value) {
            addCriterion("pm_electric >", value, "pmElectric");
            return (Criteria) this;
        }

        public Criteria andPmElectricGreaterThanOrEqualTo(Float value) {
            addCriterion("pm_electric >=", value, "pmElectric");
            return (Criteria) this;
        }

        public Criteria andPmElectricLessThan(Float value) {
            addCriterion("pm_electric <", value, "pmElectric");
            return (Criteria) this;
        }

        public Criteria andPmElectricLessThanOrEqualTo(Float value) {
            addCriterion("pm_electric <=", value, "pmElectric");
            return (Criteria) this;
        }

        public Criteria andPmElectricIn(List<Float> values) {
            addCriterion("pm_electric in", values, "pmElectric");
            return (Criteria) this;
        }

        public Criteria andPmElectricNotIn(List<Float> values) {
            addCriterion("pm_electric not in", values, "pmElectric");
            return (Criteria) this;
        }

        public Criteria andPmElectricBetween(Float value1, Float value2) {
            addCriterion("pm_electric between", value1, value2, "pmElectric");
            return (Criteria) this;
        }

        public Criteria andPmElectricNotBetween(Float value1, Float value2) {
            addCriterion("pm_electric not between", value1, value2, "pmElectric");
            return (Criteria) this;
        }

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
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