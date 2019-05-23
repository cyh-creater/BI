package com.zx.business.pojo;

import java.util.ArrayList;
import java.util.List;

public class TotalExportImportVolumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalExportImportVolumeExample() {
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

        public Criteria andTotalExportImportVolumeIsNull() {
            addCriterion("total_export_import_volume is null");
            return (Criteria) this;
        }

        public Criteria andTotalExportImportVolumeIsNotNull() {
            addCriterion("total_export_import_volume is not null");
            return (Criteria) this;
        }

        public Criteria andTotalExportImportVolumeEqualTo(Float value) {
            addCriterion("total_export_import_volume =", value, "totalExportImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportImportVolumeNotEqualTo(Float value) {
            addCriterion("total_export_import_volume <>", value, "totalExportImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportImportVolumeGreaterThan(Float value) {
            addCriterion("total_export_import_volume >", value, "totalExportImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportImportVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("total_export_import_volume >=", value, "totalExportImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportImportVolumeLessThan(Float value) {
            addCriterion("total_export_import_volume <", value, "totalExportImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportImportVolumeLessThanOrEqualTo(Float value) {
            addCriterion("total_export_import_volume <=", value, "totalExportImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportImportVolumeIn(List<Float> values) {
            addCriterion("total_export_import_volume in", values, "totalExportImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportImportVolumeNotIn(List<Float> values) {
            addCriterion("total_export_import_volume not in", values, "totalExportImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportImportVolumeBetween(Float value1, Float value2) {
            addCriterion("total_export_import_volume between", value1, value2, "totalExportImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportImportVolumeNotBetween(Float value1, Float value2) {
            addCriterion("total_export_import_volume not between", value1, value2, "totalExportImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportVolumeIsNull() {
            addCriterion("total_export_volume is null");
            return (Criteria) this;
        }

        public Criteria andTotalExportVolumeIsNotNull() {
            addCriterion("total_export_volume is not null");
            return (Criteria) this;
        }

        public Criteria andTotalExportVolumeEqualTo(Float value) {
            addCriterion("total_export_volume =", value, "totalExportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportVolumeNotEqualTo(Float value) {
            addCriterion("total_export_volume <>", value, "totalExportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportVolumeGreaterThan(Float value) {
            addCriterion("total_export_volume >", value, "totalExportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("total_export_volume >=", value, "totalExportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportVolumeLessThan(Float value) {
            addCriterion("total_export_volume <", value, "totalExportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportVolumeLessThanOrEqualTo(Float value) {
            addCriterion("total_export_volume <=", value, "totalExportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportVolumeIn(List<Float> values) {
            addCriterion("total_export_volume in", values, "totalExportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportVolumeNotIn(List<Float> values) {
            addCriterion("total_export_volume not in", values, "totalExportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportVolumeBetween(Float value1, Float value2) {
            addCriterion("total_export_volume between", value1, value2, "totalExportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalExportVolumeNotBetween(Float value1, Float value2) {
            addCriterion("total_export_volume not between", value1, value2, "totalExportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalImportVolumeIsNull() {
            addCriterion("total_import_volume is null");
            return (Criteria) this;
        }

        public Criteria andTotalImportVolumeIsNotNull() {
            addCriterion("total_import_volume is not null");
            return (Criteria) this;
        }

        public Criteria andTotalImportVolumeEqualTo(Float value) {
            addCriterion("total_import_volume =", value, "totalImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalImportVolumeNotEqualTo(Float value) {
            addCriterion("total_import_volume <>", value, "totalImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalImportVolumeGreaterThan(Float value) {
            addCriterion("total_import_volume >", value, "totalImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalImportVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("total_import_volume >=", value, "totalImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalImportVolumeLessThan(Float value) {
            addCriterion("total_import_volume <", value, "totalImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalImportVolumeLessThanOrEqualTo(Float value) {
            addCriterion("total_import_volume <=", value, "totalImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalImportVolumeIn(List<Float> values) {
            addCriterion("total_import_volume in", values, "totalImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalImportVolumeNotIn(List<Float> values) {
            addCriterion("total_import_volume not in", values, "totalImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalImportVolumeBetween(Float value1, Float value2) {
            addCriterion("total_import_volume between", value1, value2, "totalImportVolume");
            return (Criteria) this;
        }

        public Criteria andTotalImportVolumeNotBetween(Float value1, Float value2) {
            addCriterion("total_import_volume not between", value1, value2, "totalImportVolume");
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