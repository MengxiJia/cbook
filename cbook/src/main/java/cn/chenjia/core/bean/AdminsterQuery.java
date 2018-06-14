package cn.chenjia.core.bean;

import java.util.ArrayList;
import java.util.List;

public class AdminsterQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public AdminsterQuery() {
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

        public Criteria andAdidIsNull() {
            addCriterion("adid is null");
            return (Criteria) this;
        }

        public Criteria andAdidIsNotNull() {
            addCriterion("adid is not null");
            return (Criteria) this;
        }

        public Criteria andAdidEqualTo(Integer value) {
            addCriterion("adid =", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotEqualTo(Integer value) {
            addCriterion("adid <>", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidGreaterThan(Integer value) {
            addCriterion("adid >", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adid >=", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidLessThan(Integer value) {
            addCriterion("adid <", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidLessThanOrEqualTo(Integer value) {
            addCriterion("adid <=", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidIn(List<Integer> values) {
            addCriterion("adid in", values, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotIn(List<Integer> values) {
            addCriterion("adid not in", values, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidBetween(Integer value1, Integer value2) {
            addCriterion("adid between", value1, value2, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotBetween(Integer value1, Integer value2) {
            addCriterion("adid not between", value1, value2, "adid");
            return (Criteria) this;
        }

        public Criteria andAdnameIsNull() {
            addCriterion("adname is null");
            return (Criteria) this;
        }

        public Criteria andAdnameIsNotNull() {
            addCriterion("adname is not null");
            return (Criteria) this;
        }

        public Criteria andAdnameEqualTo(String value) {
            addCriterion("adname =", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotEqualTo(String value) {
            addCriterion("adname <>", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameGreaterThan(String value) {
            addCriterion("adname >", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameGreaterThanOrEqualTo(String value) {
            addCriterion("adname >=", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLessThan(String value) {
            addCriterion("adname <", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLessThanOrEqualTo(String value) {
            addCriterion("adname <=", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLike(String value) {
            addCriterion("adname like", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotLike(String value) {
            addCriterion("adname not like", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameIn(List<String> values) {
            addCriterion("adname in", values, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotIn(List<String> values) {
            addCriterion("adname not in", values, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameBetween(String value1, String value2) {
            addCriterion("adname between", value1, value2, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotBetween(String value1, String value2) {
            addCriterion("adname not between", value1, value2, "adname");
            return (Criteria) this;
        }

        public Criteria andAdpasswordIsNull() {
            addCriterion("adpassword is null");
            return (Criteria) this;
        }

        public Criteria andAdpasswordIsNotNull() {
            addCriterion("adpassword is not null");
            return (Criteria) this;
        }

        public Criteria andAdpasswordEqualTo(String value) {
            addCriterion("adpassword =", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordNotEqualTo(String value) {
            addCriterion("adpassword <>", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordGreaterThan(String value) {
            addCriterion("adpassword >", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("adpassword >=", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordLessThan(String value) {
            addCriterion("adpassword <", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordLessThanOrEqualTo(String value) {
            addCriterion("adpassword <=", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordLike(String value) {
            addCriterion("adpassword like", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordNotLike(String value) {
            addCriterion("adpassword not like", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordIn(List<String> values) {
            addCriterion("adpassword in", values, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordNotIn(List<String> values) {
            addCriterion("adpassword not in", values, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordBetween(String value1, String value2) {
            addCriterion("adpassword between", value1, value2, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordNotBetween(String value1, String value2) {
            addCriterion("adpassword not between", value1, value2, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdgenderIsNull() {
            addCriterion("adgender is null");
            return (Criteria) this;
        }

        public Criteria andAdgenderIsNotNull() {
            addCriterion("adgender is not null");
            return (Criteria) this;
        }

        public Criteria andAdgenderEqualTo(String value) {
            addCriterion("adgender =", value, "adgender");
            return (Criteria) this;
        }

        public Criteria andAdgenderNotEqualTo(String value) {
            addCriterion("adgender <>", value, "adgender");
            return (Criteria) this;
        }

        public Criteria andAdgenderGreaterThan(String value) {
            addCriterion("adgender >", value, "adgender");
            return (Criteria) this;
        }

        public Criteria andAdgenderGreaterThanOrEqualTo(String value) {
            addCriterion("adgender >=", value, "adgender");
            return (Criteria) this;
        }

        public Criteria andAdgenderLessThan(String value) {
            addCriterion("adgender <", value, "adgender");
            return (Criteria) this;
        }

        public Criteria andAdgenderLessThanOrEqualTo(String value) {
            addCriterion("adgender <=", value, "adgender");
            return (Criteria) this;
        }

        public Criteria andAdgenderLike(String value) {
            addCriterion("adgender like", value, "adgender");
            return (Criteria) this;
        }

        public Criteria andAdgenderNotLike(String value) {
            addCriterion("adgender not like", value, "adgender");
            return (Criteria) this;
        }

        public Criteria andAdgenderIn(List<String> values) {
            addCriterion("adgender in", values, "adgender");
            return (Criteria) this;
        }

        public Criteria andAdgenderNotIn(List<String> values) {
            addCriterion("adgender not in", values, "adgender");
            return (Criteria) this;
        }

        public Criteria andAdgenderBetween(String value1, String value2) {
            addCriterion("adgender between", value1, value2, "adgender");
            return (Criteria) this;
        }

        public Criteria andAdgenderNotBetween(String value1, String value2) {
            addCriterion("adgender not between", value1, value2, "adgender");
            return (Criteria) this;
        }

        public Criteria andAdphoneIsNull() {
            addCriterion("adphone is null");
            return (Criteria) this;
        }

        public Criteria andAdphoneIsNotNull() {
            addCriterion("adphone is not null");
            return (Criteria) this;
        }

        public Criteria andAdphoneEqualTo(String value) {
            addCriterion("adphone =", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotEqualTo(String value) {
            addCriterion("adphone <>", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneGreaterThan(String value) {
            addCriterion("adphone >", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneGreaterThanOrEqualTo(String value) {
            addCriterion("adphone >=", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLessThan(String value) {
            addCriterion("adphone <", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLessThanOrEqualTo(String value) {
            addCriterion("adphone <=", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLike(String value) {
            addCriterion("adphone like", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotLike(String value) {
            addCriterion("adphone not like", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneIn(List<String> values) {
            addCriterion("adphone in", values, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotIn(List<String> values) {
            addCriterion("adphone not in", values, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneBetween(String value1, String value2) {
            addCriterion("adphone between", value1, value2, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotBetween(String value1, String value2) {
            addCriterion("adphone not between", value1, value2, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdemailIsNull() {
            addCriterion("ademail is null");
            return (Criteria) this;
        }

        public Criteria andAdemailIsNotNull() {
            addCriterion("ademail is not null");
            return (Criteria) this;
        }

        public Criteria andAdemailEqualTo(String value) {
            addCriterion("ademail =", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotEqualTo(String value) {
            addCriterion("ademail <>", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailGreaterThan(String value) {
            addCriterion("ademail >", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailGreaterThanOrEqualTo(String value) {
            addCriterion("ademail >=", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailLessThan(String value) {
            addCriterion("ademail <", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailLessThanOrEqualTo(String value) {
            addCriterion("ademail <=", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailLike(String value) {
            addCriterion("ademail like", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotLike(String value) {
            addCriterion("ademail not like", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailIn(List<String> values) {
            addCriterion("ademail in", values, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotIn(List<String> values) {
            addCriterion("ademail not in", values, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailBetween(String value1, String value2) {
            addCriterion("ademail between", value1, value2, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotBetween(String value1, String value2) {
            addCriterion("ademail not between", value1, value2, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdaddressIsNull() {
            addCriterion("adaddress is null");
            return (Criteria) this;
        }

        public Criteria andAdaddressIsNotNull() {
            addCriterion("adaddress is not null");
            return (Criteria) this;
        }

        public Criteria andAdaddressEqualTo(String value) {
            addCriterion("adaddress =", value, "adaddress");
            return (Criteria) this;
        }

        public Criteria andAdaddressNotEqualTo(String value) {
            addCriterion("adaddress <>", value, "adaddress");
            return (Criteria) this;
        }

        public Criteria andAdaddressGreaterThan(String value) {
            addCriterion("adaddress >", value, "adaddress");
            return (Criteria) this;
        }

        public Criteria andAdaddressGreaterThanOrEqualTo(String value) {
            addCriterion("adaddress >=", value, "adaddress");
            return (Criteria) this;
        }

        public Criteria andAdaddressLessThan(String value) {
            addCriterion("adaddress <", value, "adaddress");
            return (Criteria) this;
        }

        public Criteria andAdaddressLessThanOrEqualTo(String value) {
            addCriterion("adaddress <=", value, "adaddress");
            return (Criteria) this;
        }

        public Criteria andAdaddressLike(String value) {
            addCriterion("adaddress like", value, "adaddress");
            return (Criteria) this;
        }

        public Criteria andAdaddressNotLike(String value) {
            addCriterion("adaddress not like", value, "adaddress");
            return (Criteria) this;
        }

        public Criteria andAdaddressIn(List<String> values) {
            addCriterion("adaddress in", values, "adaddress");
            return (Criteria) this;
        }

        public Criteria andAdaddressNotIn(List<String> values) {
            addCriterion("adaddress not in", values, "adaddress");
            return (Criteria) this;
        }

        public Criteria andAdaddressBetween(String value1, String value2) {
            addCriterion("adaddress between", value1, value2, "adaddress");
            return (Criteria) this;
        }

        public Criteria andAdaddressNotBetween(String value1, String value2) {
            addCriterion("adaddress not between", value1, value2, "adaddress");
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