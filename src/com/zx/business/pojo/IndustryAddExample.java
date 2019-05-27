package com.zx.business.pojo;

import java.util.ArrayList;
import java.util.List;

public class IndustryAddExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndustryAddExample() {
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

        public Criteria andBigIndustryAddIsNull() {
            addCriterion("big_industry_add is null");
            return (Criteria) this;
        }

        public Criteria andBigIndustryAddIsNotNull() {
            addCriterion("big_industry_add is not null");
            return (Criteria) this;
        }

        public Criteria andBigIndustryAddEqualTo(Float value) {
            addCriterion("big_industry_add =", value, "bigIndustryAdd");
            return (Criteria) this;
        }

        public Criteria andBigIndustryAddNotEqualTo(Float value) {
            addCriterion("big_industry_add <>", value, "bigIndustryAdd");
            return (Criteria) this;
        }

        public Criteria andBigIndustryAddGreaterThan(Float value) {
            addCriterion("big_industry_add >", value, "bigIndustryAdd");
            return (Criteria) this;
        }

        public Criteria andBigIndustryAddGreaterThanOrEqualTo(Float value) {
            addCriterion("big_industry_add >=", value, "bigIndustryAdd");
            return (Criteria) this;
        }

        public Criteria andBigIndustryAddLessThan(Float value) {
            addCriterion("big_industry_add <", value, "bigIndustryAdd");
            return (Criteria) this;
        }

        public Criteria andBigIndustryAddLessThanOrEqualTo(Float value) {
            addCriterion("big_industry_add <=", value, "bigIndustryAdd");
            return (Criteria) this;
        }

        public Criteria andBigIndustryAddIn(List<Float> values) {
            addCriterion("big_industry_add in", values, "bigIndustryAdd");
            return (Criteria) this;
        }

        public Criteria andBigIndustryAddNotIn(List<Float> values) {
            addCriterion("big_industry_add not in", values, "bigIndustryAdd");
            return (Criteria) this;
        }

        public Criteria andBigIndustryAddBetween(Float value1, Float value2) {
            addCriterion("big_industry_add between", value1, value2, "bigIndustryAdd");
            return (Criteria) this;
        }

        public Criteria andBigIndustryAddNotBetween(Float value1, Float value2) {
            addCriterion("big_industry_add not between", value1, value2, "bigIndustryAdd");
            return (Criteria) this;
        }

        public Criteria andBigZxqyAddIsNull() {
            addCriterion("big_zxqy_add is null");
            return (Criteria) this;
        }

        public Criteria andBigZxqyAddIsNotNull() {
            addCriterion("big_zxqy_add is not null");
            return (Criteria) this;
        }

        public Criteria andBigZxqyAddEqualTo(Float value) {
            addCriterion("big_zxqy_add =", value, "bigZxqyAdd");
            return (Criteria) this;
        }

        public Criteria andBigZxqyAddNotEqualTo(Float value) {
            addCriterion("big_zxqy_add <>", value, "bigZxqyAdd");
            return (Criteria) this;
        }

        public Criteria andBigZxqyAddGreaterThan(Float value) {
            addCriterion("big_zxqy_add >", value, "bigZxqyAdd");
            return (Criteria) this;
        }

        public Criteria andBigZxqyAddGreaterThanOrEqualTo(Float value) {
            addCriterion("big_zxqy_add >=", value, "bigZxqyAdd");
            return (Criteria) this;
        }

        public Criteria andBigZxqyAddLessThan(Float value) {
            addCriterion("big_zxqy_add <", value, "bigZxqyAdd");
            return (Criteria) this;
        }

        public Criteria andBigZxqyAddLessThanOrEqualTo(Float value) {
            addCriterion("big_zxqy_add <=", value, "bigZxqyAdd");
            return (Criteria) this;
        }

        public Criteria andBigZxqyAddIn(List<Float> values) {
            addCriterion("big_zxqy_add in", values, "bigZxqyAdd");
            return (Criteria) this;
        }

        public Criteria andBigZxqyAddNotIn(List<Float> values) {
            addCriterion("big_zxqy_add not in", values, "bigZxqyAdd");
            return (Criteria) this;
        }

        public Criteria andBigZxqyAddBetween(Float value1, Float value2) {
            addCriterion("big_zxqy_add between", value1, value2, "bigZxqyAdd");
            return (Criteria) this;
        }

        public Criteria andBigZxqyAddNotBetween(Float value1, Float value2) {
            addCriterion("big_zxqy_add not between", value1, value2, "bigZxqyAdd");
            return (Criteria) this;
        }

        public Criteria andIndustryCpxslIsNull() {
            addCriterion("industry_cpxsl is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCpxslIsNotNull() {
            addCriterion("industry_cpxsl is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCpxslEqualTo(Float value) {
            addCriterion("industry_cpxsl =", value, "industryCpxsl");
            return (Criteria) this;
        }

        public Criteria andIndustryCpxslNotEqualTo(Float value) {
            addCriterion("industry_cpxsl <>", value, "industryCpxsl");
            return (Criteria) this;
        }

        public Criteria andIndustryCpxslGreaterThan(Float value) {
            addCriterion("industry_cpxsl >", value, "industryCpxsl");
            return (Criteria) this;
        }

        public Criteria andIndustryCpxslGreaterThanOrEqualTo(Float value) {
            addCriterion("industry_cpxsl >=", value, "industryCpxsl");
            return (Criteria) this;
        }

        public Criteria andIndustryCpxslLessThan(Float value) {
            addCriterion("industry_cpxsl <", value, "industryCpxsl");
            return (Criteria) this;
        }

        public Criteria andIndustryCpxslLessThanOrEqualTo(Float value) {
            addCriterion("industry_cpxsl <=", value, "industryCpxsl");
            return (Criteria) this;
        }

        public Criteria andIndustryCpxslIn(List<Float> values) {
            addCriterion("industry_cpxsl in", values, "industryCpxsl");
            return (Criteria) this;
        }

        public Criteria andIndustryCpxslNotIn(List<Float> values) {
            addCriterion("industry_cpxsl not in", values, "industryCpxsl");
            return (Criteria) this;
        }

        public Criteria andIndustryCpxslBetween(Float value1, Float value2) {
            addCriterion("industry_cpxsl between", value1, value2, "industryCpxsl");
            return (Criteria) this;
        }

        public Criteria andIndustryCpxslNotBetween(Float value1, Float value2) {
            addCriterion("industry_cpxsl not between", value1, value2, "industryCpxsl");
            return (Criteria) this;
        }

        public Criteria andFadianliangIsNull() {
            addCriterion("fadianliang is null");
            return (Criteria) this;
        }

        public Criteria andFadianliangIsNotNull() {
            addCriterion("fadianliang is not null");
            return (Criteria) this;
        }

        public Criteria andFadianliangEqualTo(Float value) {
            addCriterion("fadianliang =", value, "fadianliang");
            return (Criteria) this;
        }

        public Criteria andFadianliangNotEqualTo(Float value) {
            addCriterion("fadianliang <>", value, "fadianliang");
            return (Criteria) this;
        }

        public Criteria andFadianliangGreaterThan(Float value) {
            addCriterion("fadianliang >", value, "fadianliang");
            return (Criteria) this;
        }

        public Criteria andFadianliangGreaterThanOrEqualTo(Float value) {
            addCriterion("fadianliang >=", value, "fadianliang");
            return (Criteria) this;
        }

        public Criteria andFadianliangLessThan(Float value) {
            addCriterion("fadianliang <", value, "fadianliang");
            return (Criteria) this;
        }

        public Criteria andFadianliangLessThanOrEqualTo(Float value) {
            addCriterion("fadianliang <=", value, "fadianliang");
            return (Criteria) this;
        }

        public Criteria andFadianliangIn(List<Float> values) {
            addCriterion("fadianliang in", values, "fadianliang");
            return (Criteria) this;
        }

        public Criteria andFadianliangNotIn(List<Float> values) {
            addCriterion("fadianliang not in", values, "fadianliang");
            return (Criteria) this;
        }

        public Criteria andFadianliangBetween(Float value1, Float value2) {
            addCriterion("fadianliang between", value1, value2, "fadianliang");
            return (Criteria) this;
        }

        public Criteria andFadianliangNotBetween(Float value1, Float value2) {
            addCriterion("fadianliang not between", value1, value2, "fadianliang");
            return (Criteria) this;
        }

        public Criteria andYuanquGyydlIsNull() {
            addCriterion("yuanqu_gyydl is null");
            return (Criteria) this;
        }

        public Criteria andYuanquGyydlIsNotNull() {
            addCriterion("yuanqu_gyydl is not null");
            return (Criteria) this;
        }

        public Criteria andYuanquGyydlEqualTo(Float value) {
            addCriterion("yuanqu_gyydl =", value, "yuanquGyydl");
            return (Criteria) this;
        }

        public Criteria andYuanquGyydlNotEqualTo(Float value) {
            addCriterion("yuanqu_gyydl <>", value, "yuanquGyydl");
            return (Criteria) this;
        }

        public Criteria andYuanquGyydlGreaterThan(Float value) {
            addCriterion("yuanqu_gyydl >", value, "yuanquGyydl");
            return (Criteria) this;
        }

        public Criteria andYuanquGyydlGreaterThanOrEqualTo(Float value) {
            addCriterion("yuanqu_gyydl >=", value, "yuanquGyydl");
            return (Criteria) this;
        }

        public Criteria andYuanquGyydlLessThan(Float value) {
            addCriterion("yuanqu_gyydl <", value, "yuanquGyydl");
            return (Criteria) this;
        }

        public Criteria andYuanquGyydlLessThanOrEqualTo(Float value) {
            addCriterion("yuanqu_gyydl <=", value, "yuanquGyydl");
            return (Criteria) this;
        }

        public Criteria andYuanquGyydlIn(List<Float> values) {
            addCriterion("yuanqu_gyydl in", values, "yuanquGyydl");
            return (Criteria) this;
        }

        public Criteria andYuanquGyydlNotIn(List<Float> values) {
            addCriterion("yuanqu_gyydl not in", values, "yuanquGyydl");
            return (Criteria) this;
        }

        public Criteria andYuanquGyydlBetween(Float value1, Float value2) {
            addCriterion("yuanqu_gyydl between", value1, value2, "yuanquGyydl");
            return (Criteria) this;
        }

        public Criteria andYuanquGyydlNotBetween(Float value1, Float value2) {
            addCriterion("yuanqu_gyydl not between", value1, value2, "yuanquGyydl");
            return (Criteria) this;
        }

        public Criteria andRailHylIsNull() {
            addCriterion("rail_hyl is null");
            return (Criteria) this;
        }

        public Criteria andRailHylIsNotNull() {
            addCriterion("rail_hyl is not null");
            return (Criteria) this;
        }

        public Criteria andRailHylEqualTo(Float value) {
            addCriterion("rail_hyl =", value, "railHyl");
            return (Criteria) this;
        }

        public Criteria andRailHylNotEqualTo(Float value) {
            addCriterion("rail_hyl <>", value, "railHyl");
            return (Criteria) this;
        }

        public Criteria andRailHylGreaterThan(Float value) {
            addCriterion("rail_hyl >", value, "railHyl");
            return (Criteria) this;
        }

        public Criteria andRailHylGreaterThanOrEqualTo(Float value) {
            addCriterion("rail_hyl >=", value, "railHyl");
            return (Criteria) this;
        }

        public Criteria andRailHylLessThan(Float value) {
            addCriterion("rail_hyl <", value, "railHyl");
            return (Criteria) this;
        }

        public Criteria andRailHylLessThanOrEqualTo(Float value) {
            addCriterion("rail_hyl <=", value, "railHyl");
            return (Criteria) this;
        }

        public Criteria andRailHylIn(List<Float> values) {
            addCriterion("rail_hyl in", values, "railHyl");
            return (Criteria) this;
        }

        public Criteria andRailHylNotIn(List<Float> values) {
            addCriterion("rail_hyl not in", values, "railHyl");
            return (Criteria) this;
        }

        public Criteria andRailHylBetween(Float value1, Float value2) {
            addCriterion("rail_hyl between", value1, value2, "railHyl");
            return (Criteria) this;
        }

        public Criteria andRailHylNotBetween(Float value1, Float value2) {
            addCriterion("rail_hyl not between", value1, value2, "railHyl");
            return (Criteria) this;
        }

        public Criteria andRoadHylIsNull() {
            addCriterion("road_hyl is null");
            return (Criteria) this;
        }

        public Criteria andRoadHylIsNotNull() {
            addCriterion("road_hyl is not null");
            return (Criteria) this;
        }

        public Criteria andRoadHylEqualTo(Float value) {
            addCriterion("road_hyl =", value, "roadHyl");
            return (Criteria) this;
        }

        public Criteria andRoadHylNotEqualTo(Float value) {
            addCriterion("road_hyl <>", value, "roadHyl");
            return (Criteria) this;
        }

        public Criteria andRoadHylGreaterThan(Float value) {
            addCriterion("road_hyl >", value, "roadHyl");
            return (Criteria) this;
        }

        public Criteria andRoadHylGreaterThanOrEqualTo(Float value) {
            addCriterion("road_hyl >=", value, "roadHyl");
            return (Criteria) this;
        }

        public Criteria andRoadHylLessThan(Float value) {
            addCriterion("road_hyl <", value, "roadHyl");
            return (Criteria) this;
        }

        public Criteria andRoadHylLessThanOrEqualTo(Float value) {
            addCriterion("road_hyl <=", value, "roadHyl");
            return (Criteria) this;
        }

        public Criteria andRoadHylIn(List<Float> values) {
            addCriterion("road_hyl in", values, "roadHyl");
            return (Criteria) this;
        }

        public Criteria andRoadHylNotIn(List<Float> values) {
            addCriterion("road_hyl not in", values, "roadHyl");
            return (Criteria) this;
        }

        public Criteria andRoadHylBetween(Float value1, Float value2) {
            addCriterion("road_hyl between", value1, value2, "roadHyl");
            return (Criteria) this;
        }

        public Criteria andRoadHylNotBetween(Float value1, Float value2) {
            addCriterion("road_hyl not between", value1, value2, "roadHyl");
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