package cn.chenjia.core.bean;

import java.util.ArrayList;
import java.util.List;

public class BookQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public BookQuery() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("bname is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("bname is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("bname =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("bname <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("bname >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("bname >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("bname <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("bname <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("bname like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("bname not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("bname in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("bname not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("bname between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("bname not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBauthorIsNull() {
            addCriterion("bauthor is null");
            return (Criteria) this;
        }

        public Criteria andBauthorIsNotNull() {
            addCriterion("bauthor is not null");
            return (Criteria) this;
        }

        public Criteria andBauthorEqualTo(String value) {
            addCriterion("bauthor =", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorNotEqualTo(String value) {
            addCriterion("bauthor <>", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorGreaterThan(String value) {
            addCriterion("bauthor >", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorGreaterThanOrEqualTo(String value) {
            addCriterion("bauthor >=", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorLessThan(String value) {
            addCriterion("bauthor <", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorLessThanOrEqualTo(String value) {
            addCriterion("bauthor <=", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorLike(String value) {
            addCriterion("bauthor like", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorNotLike(String value) {
            addCriterion("bauthor not like", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorIn(List<String> values) {
            addCriterion("bauthor in", values, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorNotIn(List<String> values) {
            addCriterion("bauthor not in", values, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorBetween(String value1, String value2) {
            addCriterion("bauthor between", value1, value2, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorNotBetween(String value1, String value2) {
            addCriterion("bauthor not between", value1, value2, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBnationIsNull() {
            addCriterion("bnation is null");
            return (Criteria) this;
        }

        public Criteria andBnationIsNotNull() {
            addCriterion("bnation is not null");
            return (Criteria) this;
        }

        public Criteria andBnationEqualTo(String value) {
            addCriterion("bnation =", value, "bnation");
            return (Criteria) this;
        }

        public Criteria andBnationNotEqualTo(String value) {
            addCriterion("bnation <>", value, "bnation");
            return (Criteria) this;
        }

        public Criteria andBnationGreaterThan(String value) {
            addCriterion("bnation >", value, "bnation");
            return (Criteria) this;
        }

        public Criteria andBnationGreaterThanOrEqualTo(String value) {
            addCriterion("bnation >=", value, "bnation");
            return (Criteria) this;
        }

        public Criteria andBnationLessThan(String value) {
            addCriterion("bnation <", value, "bnation");
            return (Criteria) this;
        }

        public Criteria andBnationLessThanOrEqualTo(String value) {
            addCriterion("bnation <=", value, "bnation");
            return (Criteria) this;
        }

        public Criteria andBnationLike(String value) {
            addCriterion("bnation like", value, "bnation");
            return (Criteria) this;
        }

        public Criteria andBnationNotLike(String value) {
            addCriterion("bnation not like", value, "bnation");
            return (Criteria) this;
        }

        public Criteria andBnationIn(List<String> values) {
            addCriterion("bnation in", values, "bnation");
            return (Criteria) this;
        }

        public Criteria andBnationNotIn(List<String> values) {
            addCriterion("bnation not in", values, "bnation");
            return (Criteria) this;
        }

        public Criteria andBnationBetween(String value1, String value2) {
            addCriterion("bnation between", value1, value2, "bnation");
            return (Criteria) this;
        }

        public Criteria andBnationNotBetween(String value1, String value2) {
            addCriterion("bnation not between", value1, value2, "bnation");
            return (Criteria) this;
        }

        public Criteria andBpriceIsNull() {
            addCriterion("bprice is null");
            return (Criteria) this;
        }

        public Criteria andBpriceIsNotNull() {
            addCriterion("bprice is not null");
            return (Criteria) this;
        }

        public Criteria andBpriceEqualTo(Double value) {
            addCriterion("bprice =", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceNotEqualTo(Double value) {
            addCriterion("bprice <>", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceGreaterThan(Double value) {
            addCriterion("bprice >", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("bprice >=", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceLessThan(Double value) {
            addCriterion("bprice <", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceLessThanOrEqualTo(Double value) {
            addCriterion("bprice <=", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceIn(List<Double> values) {
            addCriterion("bprice in", values, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceNotIn(List<Double> values) {
            addCriterion("bprice not in", values, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceBetween(Double value1, Double value2) {
            addCriterion("bprice between", value1, value2, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceNotBetween(Double value1, Double value2) {
            addCriterion("bprice not between", value1, value2, "bprice");
            return (Criteria) this;
        }

        public Criteria andBstockIsNull() {
            addCriterion("bstock is null");
            return (Criteria) this;
        }

        public Criteria andBstockIsNotNull() {
            addCriterion("bstock is not null");
            return (Criteria) this;
        }

        public Criteria andBstockEqualTo(String value) {
            addCriterion("bstock =", value, "bstock");
            return (Criteria) this;
        }

        public Criteria andBstockNotEqualTo(String value) {
            addCriterion("bstock <>", value, "bstock");
            return (Criteria) this;
        }

        public Criteria andBstockGreaterThan(String value) {
            addCriterion("bstock >", value, "bstock");
            return (Criteria) this;
        }

        public Criteria andBstockGreaterThanOrEqualTo(String value) {
            addCriterion("bstock >=", value, "bstock");
            return (Criteria) this;
        }

        public Criteria andBstockLessThan(String value) {
            addCriterion("bstock <", value, "bstock");
            return (Criteria) this;
        }

        public Criteria andBstockLessThanOrEqualTo(String value) {
            addCriterion("bstock <=", value, "bstock");
            return (Criteria) this;
        }

        public Criteria andBstockLike(String value) {
            addCriterion("bstock like", value, "bstock");
            return (Criteria) this;
        }

        public Criteria andBstockNotLike(String value) {
            addCriterion("bstock not like", value, "bstock");
            return (Criteria) this;
        }

        public Criteria andBstockIn(List<String> values) {
            addCriterion("bstock in", values, "bstock");
            return (Criteria) this;
        }

        public Criteria andBstockNotIn(List<String> values) {
            addCriterion("bstock not in", values, "bstock");
            return (Criteria) this;
        }

        public Criteria andBstockBetween(String value1, String value2) {
            addCriterion("bstock between", value1, value2, "bstock");
            return (Criteria) this;
        }

        public Criteria andBstockNotBetween(String value1, String value2) {
            addCriterion("bstock not between", value1, value2, "bstock");
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