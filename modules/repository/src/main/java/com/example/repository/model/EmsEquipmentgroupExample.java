package com.example.repository.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmsEquipmentgroupExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    public EmsEquipmentgroupExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andGroupidIsNull() {
            addCriterion("GROUPID is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("GROUPID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(String value) {
            addCriterion("GROUPID =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(String value) {
            addCriterion("GROUPID <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(String value) {
            addCriterion("GROUPID >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPID >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(String value) {
            addCriterion("GROUPID <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(String value) {
            addCriterion("GROUPID <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLike(String value) {
            addCriterion("GROUPID like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotLike(String value) {
            addCriterion("GROUPID not like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<String> values) {
            addCriterion("GROUPID in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<String> values) {
            addCriterion("GROUPID not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(String value1, String value2) {
            addCriterion("GROUPID between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(String value1, String value2) {
            addCriterion("GROUPID not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("GROUPNAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("GROUPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("GROUPNAME =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("GROUPNAME <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("GROUPNAME >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPNAME >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("GROUPNAME <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("GROUPNAME <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("GROUPNAME like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("GROUPNAME not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("GROUPNAME in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("GROUPNAME not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("GROUPNAME between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("GROUPNAME not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andParentgroupidIsNull() {
            addCriterion("PARENTGROUPID is null");
            return (Criteria) this;
        }

        public Criteria andParentgroupidIsNotNull() {
            addCriterion("PARENTGROUPID is not null");
            return (Criteria) this;
        }

        public Criteria andParentgroupidEqualTo(String value) {
            addCriterion("PARENTGROUPID =", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidNotEqualTo(String value) {
            addCriterion("PARENTGROUPID <>", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidGreaterThan(String value) {
            addCriterion("PARENTGROUPID >", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTGROUPID >=", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidLessThan(String value) {
            addCriterion("PARENTGROUPID <", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidLessThanOrEqualTo(String value) {
            addCriterion("PARENTGROUPID <=", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidLike(String value) {
            addCriterion("PARENTGROUPID like", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidNotLike(String value) {
            addCriterion("PARENTGROUPID not like", value, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidIn(List<String> values) {
            addCriterion("PARENTGROUPID in", values, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidNotIn(List<String> values) {
            addCriterion("PARENTGROUPID not in", values, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidBetween(String value1, String value2) {
            addCriterion("PARENTGROUPID between", value1, value2, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andParentgroupidNotBetween(String value1, String value2) {
            addCriterion("PARENTGROUPID not between", value1, value2, "parentgroupid");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("AUTHOR =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("AUTHOR <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("AUTHOR >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("AUTHOR <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("AUTHOR like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("AUTHOR not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("AUTHOR in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("AUTHOR not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("AUTHOR between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("AUTHOR not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andApprovedbyIsNull() {
            addCriterion("APPROVEDBY is null");
            return (Criteria) this;
        }

        public Criteria andApprovedbyIsNotNull() {
            addCriterion("APPROVEDBY is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedbyEqualTo(String value) {
            addCriterion("APPROVEDBY =", value, "approvedby");
            return (Criteria) this;
        }

        public Criteria andApprovedbyNotEqualTo(String value) {
            addCriterion("APPROVEDBY <>", value, "approvedby");
            return (Criteria) this;
        }

        public Criteria andApprovedbyGreaterThan(String value) {
            addCriterion("APPROVEDBY >", value, "approvedby");
            return (Criteria) this;
        }

        public Criteria andApprovedbyGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVEDBY >=", value, "approvedby");
            return (Criteria) this;
        }

        public Criteria andApprovedbyLessThan(String value) {
            addCriterion("APPROVEDBY <", value, "approvedby");
            return (Criteria) this;
        }

        public Criteria andApprovedbyLessThanOrEqualTo(String value) {
            addCriterion("APPROVEDBY <=", value, "approvedby");
            return (Criteria) this;
        }

        public Criteria andApprovedbyLike(String value) {
            addCriterion("APPROVEDBY like", value, "approvedby");
            return (Criteria) this;
        }

        public Criteria andApprovedbyNotLike(String value) {
            addCriterion("APPROVEDBY not like", value, "approvedby");
            return (Criteria) this;
        }

        public Criteria andApprovedbyIn(List<String> values) {
            addCriterion("APPROVEDBY in", values, "approvedby");
            return (Criteria) this;
        }

        public Criteria andApprovedbyNotIn(List<String> values) {
            addCriterion("APPROVEDBY not in", values, "approvedby");
            return (Criteria) this;
        }

        public Criteria andApprovedbyBetween(String value1, String value2) {
            addCriterion("APPROVEDBY between", value1, value2, "approvedby");
            return (Criteria) this;
        }

        public Criteria andApprovedbyNotBetween(String value1, String value2) {
            addCriterion("APPROVEDBY not between", value1, value2, "approvedby");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIsNull() {
            addCriterion("APPROVALDATE is null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIsNotNull() {
            addCriterion("APPROVALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateEqualTo(Date value) {
            addCriterion("APPROVALDATE =", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotEqualTo(Date value) {
            addCriterion("APPROVALDATE <>", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThan(Date value) {
            addCriterion("APPROVALDATE >", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPROVALDATE >=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThan(Date value) {
            addCriterion("APPROVALDATE <", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThanOrEqualTo(Date value) {
            addCriterion("APPROVALDATE <=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIn(List<Date> values) {
            addCriterion("APPROVALDATE in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotIn(List<Date> values) {
            addCriterion("APPROVALDATE not in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateBetween(Date value1, Date value2) {
            addCriterion("APPROVALDATE between", value1, value2, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotBetween(Date value1, Date value2) {
            addCriterion("APPROVALDATE not between", value1, value2, "approvaldate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated do_not_delete_during_merge Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
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