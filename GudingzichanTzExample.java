package com.zx.business.pojo;

import java.util.ArrayList;
import java.util.List;

public class GudingzichanTzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GudingzichanTzExample() {
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

        public Criteria andGudingZctzIsNull() {
            addCriterion("guding_zctz is null");
            return (Criteria) this;
        }

        public Criteria andGudingZctzIsNotNull() {
            addCriterion("guding_zctz is not null");
            return (Criteria) this;
        }

        public Criteria andGudingZctzEqualTo(Float value) {
            addCriterion("guding_zctz =", value, "gudingZctz");
            return (Criteria) this;
        }

        public Criteria andGudingZctzNotEqualTo(Float value) {
            addCriterion("guding_zctz <>", value, "gudingZctz");
            return (Criteria) this;
        }

        public Criteria andGudingZctzGreaterThan(Float value) {
            addCriterion("guding_zctz >", value, "gudingZctz");
            return (Criteria) this;
        }

        public Criteria andGudingZctzGreaterThanOrEqualTo(Float value) {
            addCriterion("guding_zctz >=", value, "gudingZctz");
            return (Criteria) this;
        }

        public Criteria andGudingZctzLessThan(Float value) {
            addCriterion("guding_zctz <", value, "gudingZctz");
            return (Criteria) this;
        }

        public Criteria andGudingZctzLessThanOrEqualTo(Float value) {
            addCriterion("guding_zctz <=", value, "gudingZctz");
            return (Criteria) this;
        }

        public Criteria andGudingZctzIn(List<Float> values) {
            addCriterion("guding_zctz in", values, "gudingZctz");
            return (Criteria) this;
        }

        public Criteria andGudingZctzNotIn(List<Float> values) {
            addCriterion("guding_zctz not in", values, "gudingZctz");
            return (Criteria) this;
        }

        public Criteria andGudingZctzBetween(Float value1, Float value2) {
            addCriterion("guding_zctz between", value1, value2, "gudingZctz");
            return (Criteria) this;
        }

        public Criteria andGudingZctzNotBetween(Float value1, Float value2) {
            addCriterion("guding_zctz not between", value1, value2, "gudingZctz");
            return (Criteria) this;
        }

        public Criteria andFirstIndustryIsNull() {
            addCriterion("first_industry is null");
            return (Criteria) this;
        }

        public Criteria andFirstIndustryIsNotNull() {
            addCriterion("first_industry is not null");
            return (Criteria) this;
        }

        public Criteria andFirstIndustryEqualTo(Float value) {
            addCriterion("first_industry =", value, "firstIndustry");
            return (Criteria) this;
        }

        public Criteria andFirstIndustryNotEqualTo(Float value) {
            addCriterion("first_industry <>", value, "firstIndustry");
            return (Criteria) this;
        }

        public Criteria andFirstIndustryGreaterThan(Float value) {
            addCriterion("first_industry >", value, "firstIndustry");
            return (Criteria) this;
        }

        public Criteria andFirstIndustryGreaterThanOrEqualTo(Float value) {
            addCriterion("first_industry >=", value, "firstIndustry");
            return (Criteria) this;
        }

        public Criteria andFirstIndustryLessThan(Float value) {
            addCriterion("first_industry <", value, "firstIndustry");
            return (Criteria) this;
        }

        public Criteria andFirstIndustryLessThanOrEqualTo(Float value) {
            addCriterion("first_industry <=", value, "firstIndustry");
            return (Criteria) this;
        }

        public Criteria andFirstIndustryIn(List<Float> values) {
            addCriterion("first_industry in", values, "firstIndustry");
            return (Criteria) this;
        }

        public Criteria andFirstIndustryNotIn(List<Float> values) {
            addCriterion("first_industry not in", values, "firstIndustry");
            return (Criteria) this;
        }

        public Criteria andFirstIndustryBetween(Float value1, Float value2) {
            addCriterion("first_industry between", value1, value2, "firstIndustry");
            return (Criteria) this;
        }

        public Criteria andFirstIndustryNotBetween(Float value1, Float value2) {
            addCriterion("first_industry not between", value1, value2, "firstIndustry");
            return (Criteria) this;
        }

        public Criteria andSecondIndustryIsNull() {
            addCriterion("second_industry is null");
            return (Criteria) this;
        }

        public Criteria andSecondIndustryIsNotNull() {
            addCriterion("second_industry is not null");
            return (Criteria) this;
        }

        public Criteria andSecondIndustryEqualTo(Float value) {
            addCriterion("second_industry =", value, "secondIndustry");
            return (Criteria) this;
        }

        public Criteria andSecondIndustryNotEqualTo(Float value) {
            addCriterion("second_industry <>", value, "secondIndustry");
            return (Criteria) this;
        }

        public Criteria andSecondIndustryGreaterThan(Float value) {
            addCriterion("second_industry >", value, "secondIndustry");
            return (Criteria) this;
        }

        public Criteria andSecondIndustryGreaterThanOrEqualTo(Float value) {
            addCriterion("second_industry >=", value, "secondIndustry");
            return (Criteria) this;
        }

        public Criteria andSecondIndustryLessThan(Float value) {
            addCriterion("second_industry <", value, "secondIndustry");
            return (Criteria) this;
        }

        public Criteria andSecondIndustryLessThanOrEqualTo(Float value) {
            addCriterion("second_industry <=", value, "secondIndustry");
            return (Criteria) this;
        }

        public Criteria andSecondIndustryIn(List<Float> values) {
            addCriterion("second_industry in", values, "secondIndustry");
            return (Criteria) this;
        }

        public Criteria andSecondIndustryNotIn(List<Float> values) {
            addCriterion("second_industry not in", values, "secondIndustry");
            return (Criteria) this;
        }

        public Criteria andSecondIndustryBetween(Float value1, Float value2) {
            addCriterion("second_industry between", value1, value2, "secondIndustry");
            return (Criteria) this;
        }

        public Criteria andSecondIndustryNotBetween(Float value1, Float value2) {
            addCriterion("second_industry not between", value1, value2, "secondIndustry");
            return (Criteria) this;
        }

        public Criteria andThirdIndustryIsNull() {
            addCriterion("third_industry is null");
            return (Criteria) this;
        }

        public Criteria andThirdIndustryIsNotNull() {
            addCriterion("third_industry is not null");
            return (Criteria) this;
        }

        public Criteria andThirdIndustryEqualTo(Float value) {
            addCriterion("third_industry =", value, "thirdIndustry");
            return (Criteria) this;
        }

        public Criteria andThirdIndustryNotEqualTo(Float value) {
            addCriterion("third_industry <>", value, "thirdIndustry");
            return (Criteria) this;
        }

        public Criteria andThirdIndustryGreaterThan(Float value) {
            addCriterion("third_industry >", value, "thirdIndustry");
            return (Criteria) this;
        }

        public Criteria andThirdIndustryGreaterThanOrEqualTo(Float value) {
            addCriterion("third_industry >=", value, "thirdIndustry");
            return (Criteria) this;
        }

        public Criteria andThirdIndustryLessThan(Float value) {
            addCriterion("third_industry <", value, "thirdIndustry");
            return (Criteria) this;
        }

        public Criteria andThirdIndustryLessThanOrEqualTo(Float value) {
            addCriterion("third_industry <=", value, "thirdIndustry");
            return (Criteria) this;
        }

        public Criteria andThirdIndustryIn(List<Float> values) {
            addCriterion("third_industry in", values, "thirdIndustry");
            return (Criteria) this;
        }

        public Criteria andThirdIndustryNotIn(List<Float> values) {
            addCriterion("third_industry not in", values, "thirdIndustry");
            return (Criteria) this;
        }

        public Criteria andThirdIndustryBetween(Float value1, Float value2) {
            addCriterion("third_industry between", value1, value2, "thirdIndustry");
            return (Criteria) this;
        }

        public Criteria andThirdIndustryNotBetween(Float value1, Float value2) {
            addCriterion("third_industry not between", value1, value2, "thirdIndustry");
            return (Criteria) this;
        }

        public Criteria andFangdichanIsNull() {
            addCriterion("fangdichan is null");
            return (Criteria) this;
        }

        public Criteria andFangdichanIsNotNull() {
            addCriterion("fangdichan is not null");
            return (Criteria) this;
        }

        public Criteria andFangdichanEqualTo(Float value) {
            addCriterion("fangdichan =", value, "fangdichan");
            return (Criteria) this;
        }

        public Criteria andFangdichanNotEqualTo(Float value) {
            addCriterion("fangdichan <>", value, "fangdichan");
            return (Criteria) this;
        }

        public Criteria andFangdichanGreaterThan(Float value) {
            addCriterion("fangdichan >", value, "fangdichan");
            return (Criteria) this;
        }

        public Criteria andFangdichanGreaterThanOrEqualTo(Float value) {
            addCriterion("fangdichan >=", value, "fangdichan");
            return (Criteria) this;
        }

        public Criteria andFangdichanLessThan(Float value) {
            addCriterion("fangdichan <", value, "fangdichan");
            return (Criteria) this;
        }

        public Criteria andFangdichanLessThanOrEqualTo(Float value) {
            addCriterion("fangdichan <=", value, "fangdichan");
            return (Criteria) this;
        }

        public Criteria andFangdichanIn(List<Float> values) {
            addCriterion("fangdichan in", values, "fangdichan");
            return (Criteria) this;
        }

        public Criteria andFangdichanNotIn(List<Float> values) {
            addCriterion("fangdichan not in", values, "fangdichan");
            return (Criteria) this;
        }

        public Criteria andFangdichanBetween(Float value1, Float value2) {
            addCriterion("fangdichan between", value1, value2, "fangdichan");
            return (Criteria) this;
        }

        public Criteria andFangdichanNotBetween(Float value1, Float value2) {
            addCriterion("fangdichan not between", value1, value2, "fangdichan");
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