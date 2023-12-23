package com.zbq.demo.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MobileFoodFacilityPermitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MobileFoodFacilityPermitExample() {
        oredCriteria = new ArrayList<>();
    }

    public boolean isDistinct() {
        return distinct;
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
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andLocationidIsNull() {
            addCriterion("locationid is null");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNotNull() {
            addCriterion("locationid is not null");
            return (Criteria) this;
        }

        public Criteria andLocationidEqualTo(String value) {
            addCriterion("locationid =", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotEqualTo(String value) {
            addCriterion("locationid <>", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThan(String value) {
            addCriterion("locationid >", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThanOrEqualTo(String value) {
            addCriterion("locationid >=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThan(String value) {
            addCriterion("locationid <", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThanOrEqualTo(String value) {
            addCriterion("locationid <=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLike(String value) {
            addCriterion("locationid like", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotLike(String value) {
            addCriterion("locationid not like", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidIn(List<String> values) {
            addCriterion("locationid in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotIn(List<String> values) {
            addCriterion("locationid not in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidBetween(String value1, String value2) {
            addCriterion("locationid between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotBetween(String value1, String value2) {
            addCriterion("locationid not between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("Applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("Applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(String value) {
            addCriterion("Applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(String value) {
            addCriterion("Applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(String value) {
            addCriterion("Applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(String value) {
            addCriterion("Applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(String value) {
            addCriterion("Applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(String value) {
            addCriterion("Applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLike(String value) {
            addCriterion("Applicant like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotLike(String value) {
            addCriterion("Applicant not like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<String> values) {
            addCriterion("Applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<String> values) {
            addCriterion("Applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(String value1, String value2) {
            addCriterion("Applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(String value1, String value2) {
            addCriterion("Applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeIsNull() {
            addCriterion("FacilityType is null");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeIsNotNull() {
            addCriterion("FacilityType is not null");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeEqualTo(String value) {
            addCriterion("FacilityType =", value, "facilitytype");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeNotEqualTo(String value) {
            addCriterion("FacilityType <>", value, "facilitytype");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeGreaterThan(String value) {
            addCriterion("FacilityType >", value, "facilitytype");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeGreaterThanOrEqualTo(String value) {
            addCriterion("FacilityType >=", value, "facilitytype");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeLessThan(String value) {
            addCriterion("FacilityType <", value, "facilitytype");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeLessThanOrEqualTo(String value) {
            addCriterion("FacilityType <=", value, "facilitytype");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeLike(String value) {
            addCriterion("FacilityType like", value, "facilitytype");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeNotLike(String value) {
            addCriterion("FacilityType not like", value, "facilitytype");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeIn(List<String> values) {
            addCriterion("FacilityType in", values, "facilitytype");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeNotIn(List<String> values) {
            addCriterion("FacilityType not in", values, "facilitytype");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeBetween(String value1, String value2) {
            addCriterion("FacilityType between", value1, value2, "facilitytype");
            return (Criteria) this;
        }

        public Criteria andFacilitytypeNotBetween(String value1, String value2) {
            addCriterion("FacilityType not between", value1, value2, "facilitytype");
            return (Criteria) this;
        }

        public Criteria andCnnIsNull() {
            addCriterion("cnn is null");
            return (Criteria) this;
        }

        public Criteria andCnnIsNotNull() {
            addCriterion("cnn is not null");
            return (Criteria) this;
        }

        public Criteria andCnnEqualTo(String value) {
            addCriterion("cnn =", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnNotEqualTo(String value) {
            addCriterion("cnn <>", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnGreaterThan(String value) {
            addCriterion("cnn >", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnGreaterThanOrEqualTo(String value) {
            addCriterion("cnn >=", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnLessThan(String value) {
            addCriterion("cnn <", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnLessThanOrEqualTo(String value) {
            addCriterion("cnn <=", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnLike(String value) {
            addCriterion("cnn like", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnNotLike(String value) {
            addCriterion("cnn not like", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnIn(List<String> values) {
            addCriterion("cnn in", values, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnNotIn(List<String> values) {
            addCriterion("cnn not in", values, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnBetween(String value1, String value2) {
            addCriterion("cnn between", value1, value2, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnNotBetween(String value1, String value2) {
            addCriterion("cnn not between", value1, value2, "cnn");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionIsNull() {
            addCriterion("LocationDescription is null");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionIsNotNull() {
            addCriterion("LocationDescription is not null");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionEqualTo(String value) {
            addCriterion("LocationDescription =", value, "locationdescription");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionNotEqualTo(String value) {
            addCriterion("LocationDescription <>", value, "locationdescription");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionGreaterThan(String value) {
            addCriterion("LocationDescription >", value, "locationdescription");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("LocationDescription >=", value, "locationdescription");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionLessThan(String value) {
            addCriterion("LocationDescription <", value, "locationdescription");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionLessThanOrEqualTo(String value) {
            addCriterion("LocationDescription <=", value, "locationdescription");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionLike(String value) {
            addCriterion("LocationDescription like", value, "locationdescription");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionNotLike(String value) {
            addCriterion("LocationDescription not like", value, "locationdescription");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionIn(List<String> values) {
            addCriterion("LocationDescription in", values, "locationdescription");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionNotIn(List<String> values) {
            addCriterion("LocationDescription not in", values, "locationdescription");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionBetween(String value1, String value2) {
            addCriterion("LocationDescription between", value1, value2, "locationdescription");
            return (Criteria) this;
        }

        public Criteria andLocationdescriptionNotBetween(String value1, String value2) {
            addCriterion("LocationDescription not between", value1, value2, "locationdescription");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBlocklotIsNull() {
            addCriterion("blocklot is null");
            return (Criteria) this;
        }

        public Criteria andBlocklotIsNotNull() {
            addCriterion("blocklot is not null");
            return (Criteria) this;
        }

        public Criteria andBlocklotEqualTo(String value) {
            addCriterion("blocklot =", value, "blocklot");
            return (Criteria) this;
        }

        public Criteria andBlocklotNotEqualTo(String value) {
            addCriterion("blocklot <>", value, "blocklot");
            return (Criteria) this;
        }

        public Criteria andBlocklotGreaterThan(String value) {
            addCriterion("blocklot >", value, "blocklot");
            return (Criteria) this;
        }

        public Criteria andBlocklotGreaterThanOrEqualTo(String value) {
            addCriterion("blocklot >=", value, "blocklot");
            return (Criteria) this;
        }

        public Criteria andBlocklotLessThan(String value) {
            addCriterion("blocklot <", value, "blocklot");
            return (Criteria) this;
        }

        public Criteria andBlocklotLessThanOrEqualTo(String value) {
            addCriterion("blocklot <=", value, "blocklot");
            return (Criteria) this;
        }

        public Criteria andBlocklotLike(String value) {
            addCriterion("blocklot like", value, "blocklot");
            return (Criteria) this;
        }

        public Criteria andBlocklotNotLike(String value) {
            addCriterion("blocklot not like", value, "blocklot");
            return (Criteria) this;
        }

        public Criteria andBlocklotIn(List<String> values) {
            addCriterion("blocklot in", values, "blocklot");
            return (Criteria) this;
        }

        public Criteria andBlocklotNotIn(List<String> values) {
            addCriterion("blocklot not in", values, "blocklot");
            return (Criteria) this;
        }

        public Criteria andBlocklotBetween(String value1, String value2) {
            addCriterion("blocklot between", value1, value2, "blocklot");
            return (Criteria) this;
        }

        public Criteria andBlocklotNotBetween(String value1, String value2) {
            addCriterion("blocklot not between", value1, value2, "blocklot");
            return (Criteria) this;
        }

        public Criteria andBlockIsNull() {
            addCriterion("block is null");
            return (Criteria) this;
        }

        public Criteria andBlockIsNotNull() {
            addCriterion("block is not null");
            return (Criteria) this;
        }

        public Criteria andBlockEqualTo(String value) {
            addCriterion("block =", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotEqualTo(String value) {
            addCriterion("block <>", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThan(String value) {
            addCriterion("block >", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThanOrEqualTo(String value) {
            addCriterion("block >=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThan(String value) {
            addCriterion("block <", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThanOrEqualTo(String value) {
            addCriterion("block <=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLike(String value) {
            addCriterion("block like", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotLike(String value) {
            addCriterion("block not like", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockIn(List<String> values) {
            addCriterion("block in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotIn(List<String> values) {
            addCriterion("block not in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockBetween(String value1, String value2) {
            addCriterion("block between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotBetween(String value1, String value2) {
            addCriterion("block not between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andLotIsNull() {
            addCriterion("lot is null");
            return (Criteria) this;
        }

        public Criteria andLotIsNotNull() {
            addCriterion("lot is not null");
            return (Criteria) this;
        }

        public Criteria andLotEqualTo(String value) {
            addCriterion("lot =", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotEqualTo(String value) {
            addCriterion("lot <>", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotGreaterThan(String value) {
            addCriterion("lot >", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotGreaterThanOrEqualTo(String value) {
            addCriterion("lot >=", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotLessThan(String value) {
            addCriterion("lot <", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotLessThanOrEqualTo(String value) {
            addCriterion("lot <=", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotLike(String value) {
            addCriterion("lot like", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotLike(String value) {
            addCriterion("lot not like", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotIn(List<String> values) {
            addCriterion("lot in", values, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotIn(List<String> values) {
            addCriterion("lot not in", values, "lot");
            return (Criteria) this;
        }

        public Criteria andLotBetween(String value1, String value2) {
            addCriterion("lot between", value1, value2, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotBetween(String value1, String value2) {
            addCriterion("lot not between", value1, value2, "lot");
            return (Criteria) this;
        }

        public Criteria andPermitIsNull() {
            addCriterion("permit is null");
            return (Criteria) this;
        }

        public Criteria andPermitIsNotNull() {
            addCriterion("permit is not null");
            return (Criteria) this;
        }

        public Criteria andPermitEqualTo(String value) {
            addCriterion("permit =", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitNotEqualTo(String value) {
            addCriterion("permit <>", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitGreaterThan(String value) {
            addCriterion("permit >", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitGreaterThanOrEqualTo(String value) {
            addCriterion("permit >=", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitLessThan(String value) {
            addCriterion("permit <", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitLessThanOrEqualTo(String value) {
            addCriterion("permit <=", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitLike(String value) {
            addCriterion("permit like", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitNotLike(String value) {
            addCriterion("permit not like", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitIn(List<String> values) {
            addCriterion("permit in", values, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitNotIn(List<String> values) {
            addCriterion("permit not in", values, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitBetween(String value1, String value2) {
            addCriterion("permit between", value1, value2, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitNotBetween(String value1, String value2) {
            addCriterion("permit not between", value1, value2, "permit");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFooditemsIsNull() {
            addCriterion("FoodItems is null");
            return (Criteria) this;
        }

        public Criteria andFooditemsIsNotNull() {
            addCriterion("FoodItems is not null");
            return (Criteria) this;
        }

        public Criteria andFooditemsEqualTo(String value) {
            addCriterion("FoodItems =", value, "fooditems");
            return (Criteria) this;
        }

        public Criteria andFooditemsNotEqualTo(String value) {
            addCriterion("FoodItems <>", value, "fooditems");
            return (Criteria) this;
        }

        public Criteria andFooditemsGreaterThan(String value) {
            addCriterion("FoodItems >", value, "fooditems");
            return (Criteria) this;
        }

        public Criteria andFooditemsGreaterThanOrEqualTo(String value) {
            addCriterion("FoodItems >=", value, "fooditems");
            return (Criteria) this;
        }

        public Criteria andFooditemsLessThan(String value) {
            addCriterion("FoodItems <", value, "fooditems");
            return (Criteria) this;
        }

        public Criteria andFooditemsLessThanOrEqualTo(String value) {
            addCriterion("FoodItems <=", value, "fooditems");
            return (Criteria) this;
        }

        public Criteria andFooditemsLike(String value) {
            addCriterion("FoodItems like", value, "fooditems");
            return (Criteria) this;
        }

        public Criteria andFooditemsNotLike(String value) {
            addCriterion("FoodItems not like", value, "fooditems");
            return (Criteria) this;
        }

        public Criteria andFooditemsIn(List<String> values) {
            addCriterion("FoodItems in", values, "fooditems");
            return (Criteria) this;
        }

        public Criteria andFooditemsNotIn(List<String> values) {
            addCriterion("FoodItems not in", values, "fooditems");
            return (Criteria) this;
        }

        public Criteria andFooditemsBetween(String value1, String value2) {
            addCriterion("FoodItems between", value1, value2, "fooditems");
            return (Criteria) this;
        }

        public Criteria andFooditemsNotBetween(String value1, String value2) {
            addCriterion("FoodItems not between", value1, value2, "fooditems");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("X is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("X is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(String value) {
            addCriterion("X =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(String value) {
            addCriterion("X <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(String value) {
            addCriterion("X >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(String value) {
            addCriterion("X >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(String value) {
            addCriterion("X <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(String value) {
            addCriterion("X <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLike(String value) {
            addCriterion("X like", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotLike(String value) {
            addCriterion("X not like", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<String> values) {
            addCriterion("X in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<String> values) {
            addCriterion("X not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(String value1, String value2) {
            addCriterion("X between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(String value1, String value2) {
            addCriterion("X not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("Y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("Y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(String value) {
            addCriterion("Y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(String value) {
            addCriterion("Y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(String value) {
            addCriterion("Y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(String value) {
            addCriterion("Y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(String value) {
            addCriterion("Y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(String value) {
            addCriterion("Y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLike(String value) {
            addCriterion("Y like", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotLike(String value) {
            addCriterion("Y not like", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<String> values) {
            addCriterion("Y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<String> values) {
            addCriterion("Y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(String value1, String value2) {
            addCriterion("Y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(String value1, String value2) {
            addCriterion("Y not between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("Latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("Latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("Latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("Latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("Latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("Latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("Latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("Latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("Latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("Latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("Latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("Latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("Latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("Latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("Longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("Longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("Longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("Longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("Longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("Longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("Longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("Longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("Longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("Longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("Longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("Longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("Longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("Longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNull() {
            addCriterion("Schedule is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNotNull() {
            addCriterion("Schedule is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleEqualTo(String value) {
            addCriterion("Schedule =", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotEqualTo(String value) {
            addCriterion("Schedule <>", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThan(String value) {
            addCriterion("Schedule >", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThanOrEqualTo(String value) {
            addCriterion("Schedule >=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThan(String value) {
            addCriterion("Schedule <", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThanOrEqualTo(String value) {
            addCriterion("Schedule <=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLike(String value) {
            addCriterion("Schedule like", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotLike(String value) {
            addCriterion("Schedule not like", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleIn(List<String> values) {
            addCriterion("Schedule in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotIn(List<String> values) {
            addCriterion("Schedule not in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleBetween(String value1, String value2) {
            addCriterion("Schedule between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotBetween(String value1, String value2) {
            addCriterion("Schedule not between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andDayshoursIsNull() {
            addCriterion("dayshours is null");
            return (Criteria) this;
        }

        public Criteria andDayshoursIsNotNull() {
            addCriterion("dayshours is not null");
            return (Criteria) this;
        }

        public Criteria andDayshoursEqualTo(String value) {
            addCriterion("dayshours =", value, "dayshours");
            return (Criteria) this;
        }

        public Criteria andDayshoursNotEqualTo(String value) {
            addCriterion("dayshours <>", value, "dayshours");
            return (Criteria) this;
        }

        public Criteria andDayshoursGreaterThan(String value) {
            addCriterion("dayshours >", value, "dayshours");
            return (Criteria) this;
        }

        public Criteria andDayshoursGreaterThanOrEqualTo(String value) {
            addCriterion("dayshours >=", value, "dayshours");
            return (Criteria) this;
        }

        public Criteria andDayshoursLessThan(String value) {
            addCriterion("dayshours <", value, "dayshours");
            return (Criteria) this;
        }

        public Criteria andDayshoursLessThanOrEqualTo(String value) {
            addCriterion("dayshours <=", value, "dayshours");
            return (Criteria) this;
        }

        public Criteria andDayshoursLike(String value) {
            addCriterion("dayshours like", value, "dayshours");
            return (Criteria) this;
        }

        public Criteria andDayshoursNotLike(String value) {
            addCriterion("dayshours not like", value, "dayshours");
            return (Criteria) this;
        }

        public Criteria andDayshoursIn(List<String> values) {
            addCriterion("dayshours in", values, "dayshours");
            return (Criteria) this;
        }

        public Criteria andDayshoursNotIn(List<String> values) {
            addCriterion("dayshours not in", values, "dayshours");
            return (Criteria) this;
        }

        public Criteria andDayshoursBetween(String value1, String value2) {
            addCriterion("dayshours between", value1, value2, "dayshours");
            return (Criteria) this;
        }

        public Criteria andDayshoursNotBetween(String value1, String value2) {
            addCriterion("dayshours not between", value1, value2, "dayshours");
            return (Criteria) this;
        }

        public Criteria andNoisentIsNull() {
            addCriterion("NOISent is null");
            return (Criteria) this;
        }

        public Criteria andNoisentIsNotNull() {
            addCriterion("NOISent is not null");
            return (Criteria) this;
        }

        public Criteria andNoisentEqualTo(String value) {
            addCriterion("NOISent =", value, "noisent");
            return (Criteria) this;
        }

        public Criteria andNoisentNotEqualTo(String value) {
            addCriterion("NOISent <>", value, "noisent");
            return (Criteria) this;
        }

        public Criteria andNoisentGreaterThan(String value) {
            addCriterion("NOISent >", value, "noisent");
            return (Criteria) this;
        }

        public Criteria andNoisentGreaterThanOrEqualTo(String value) {
            addCriterion("NOISent >=", value, "noisent");
            return (Criteria) this;
        }

        public Criteria andNoisentLessThan(String value) {
            addCriterion("NOISent <", value, "noisent");
            return (Criteria) this;
        }

        public Criteria andNoisentLessThanOrEqualTo(String value) {
            addCriterion("NOISent <=", value, "noisent");
            return (Criteria) this;
        }

        public Criteria andNoisentLike(String value) {
            addCriterion("NOISent like", value, "noisent");
            return (Criteria) this;
        }

        public Criteria andNoisentNotLike(String value) {
            addCriterion("NOISent not like", value, "noisent");
            return (Criteria) this;
        }

        public Criteria andNoisentIn(List<String> values) {
            addCriterion("NOISent in", values, "noisent");
            return (Criteria) this;
        }

        public Criteria andNoisentNotIn(List<String> values) {
            addCriterion("NOISent not in", values, "noisent");
            return (Criteria) this;
        }

        public Criteria andNoisentBetween(String value1, String value2) {
            addCriterion("NOISent between", value1, value2, "noisent");
            return (Criteria) this;
        }

        public Criteria andNoisentNotBetween(String value1, String value2) {
            addCriterion("NOISent not between", value1, value2, "noisent");
            return (Criteria) this;
        }

        public Criteria andApprovedIsNull() {
            addCriterion("Approved is null");
            return (Criteria) this;
        }

        public Criteria andApprovedIsNotNull() {
            addCriterion("Approved is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedEqualTo(String value) {
            addCriterion("Approved =", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotEqualTo(String value) {
            addCriterion("Approved <>", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedGreaterThan(String value) {
            addCriterion("Approved >", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedGreaterThanOrEqualTo(String value) {
            addCriterion("Approved >=", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedLessThan(String value) {
            addCriterion("Approved <", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedLessThanOrEqualTo(String value) {
            addCriterion("Approved <=", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedLike(String value) {
            addCriterion("Approved like", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotLike(String value) {
            addCriterion("Approved not like", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedIn(List<String> values) {
            addCriterion("Approved in", values, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotIn(List<String> values) {
            addCriterion("Approved not in", values, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedBetween(String value1, String value2) {
            addCriterion("Approved between", value1, value2, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotBetween(String value1, String value2) {
            addCriterion("Approved not between", value1, value2, "approved");
            return (Criteria) this;
        }

        public Criteria andReceivedIsNull() {
            addCriterion("Received is null");
            return (Criteria) this;
        }

        public Criteria andReceivedIsNotNull() {
            addCriterion("Received is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedEqualTo(String value) {
            addCriterion("Received =", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotEqualTo(String value) {
            addCriterion("Received <>", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedGreaterThan(String value) {
            addCriterion("Received >", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedGreaterThanOrEqualTo(String value) {
            addCriterion("Received >=", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedLessThan(String value) {
            addCriterion("Received <", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedLessThanOrEqualTo(String value) {
            addCriterion("Received <=", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedLike(String value) {
            addCriterion("Received like", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotLike(String value) {
            addCriterion("Received not like", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedIn(List<String> values) {
            addCriterion("Received in", values, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotIn(List<String> values) {
            addCriterion("Received not in", values, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedBetween(String value1, String value2) {
            addCriterion("Received between", value1, value2, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotBetween(String value1, String value2) {
            addCriterion("Received not between", value1, value2, "received");
            return (Criteria) this;
        }

        public Criteria andPriorpermitIsNull() {
            addCriterion("PriorPermit is null");
            return (Criteria) this;
        }

        public Criteria andPriorpermitIsNotNull() {
            addCriterion("PriorPermit is not null");
            return (Criteria) this;
        }

        public Criteria andPriorpermitEqualTo(String value) {
            addCriterion("PriorPermit =", value, "priorpermit");
            return (Criteria) this;
        }

        public Criteria andPriorpermitNotEqualTo(String value) {
            addCriterion("PriorPermit <>", value, "priorpermit");
            return (Criteria) this;
        }

        public Criteria andPriorpermitGreaterThan(String value) {
            addCriterion("PriorPermit >", value, "priorpermit");
            return (Criteria) this;
        }

        public Criteria andPriorpermitGreaterThanOrEqualTo(String value) {
            addCriterion("PriorPermit >=", value, "priorpermit");
            return (Criteria) this;
        }

        public Criteria andPriorpermitLessThan(String value) {
            addCriterion("PriorPermit <", value, "priorpermit");
            return (Criteria) this;
        }

        public Criteria andPriorpermitLessThanOrEqualTo(String value) {
            addCriterion("PriorPermit <=", value, "priorpermit");
            return (Criteria) this;
        }

        public Criteria andPriorpermitLike(String value) {
            addCriterion("PriorPermit like", value, "priorpermit");
            return (Criteria) this;
        }

        public Criteria andPriorpermitNotLike(String value) {
            addCriterion("PriorPermit not like", value, "priorpermit");
            return (Criteria) this;
        }

        public Criteria andPriorpermitIn(List<String> values) {
            addCriterion("PriorPermit in", values, "priorpermit");
            return (Criteria) this;
        }

        public Criteria andPriorpermitNotIn(List<String> values) {
            addCriterion("PriorPermit not in", values, "priorpermit");
            return (Criteria) this;
        }

        public Criteria andPriorpermitBetween(String value1, String value2) {
            addCriterion("PriorPermit between", value1, value2, "priorpermit");
            return (Criteria) this;
        }

        public Criteria andPriorpermitNotBetween(String value1, String value2) {
            addCriterion("PriorPermit not between", value1, value2, "priorpermit");
            return (Criteria) this;
        }

        public Criteria andExpirationdateIsNull() {
            addCriterion("ExpirationDate is null");
            return (Criteria) this;
        }

        public Criteria andExpirationdateIsNotNull() {
            addCriterion("ExpirationDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationdateEqualTo(String value) {
            addCriterion("ExpirationDate =", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateNotEqualTo(String value) {
            addCriterion("ExpirationDate <>", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateGreaterThan(String value) {
            addCriterion("ExpirationDate >", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateGreaterThanOrEqualTo(String value) {
            addCriterion("ExpirationDate >=", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateLessThan(String value) {
            addCriterion("ExpirationDate <", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateLessThanOrEqualTo(String value) {
            addCriterion("ExpirationDate <=", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateLike(String value) {
            addCriterion("ExpirationDate like", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateNotLike(String value) {
            addCriterion("ExpirationDate not like", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateIn(List<String> values) {
            addCriterion("ExpirationDate in", values, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateNotIn(List<String> values) {
            addCriterion("ExpirationDate not in", values, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateBetween(String value1, String value2) {
            addCriterion("ExpirationDate between", value1, value2, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateNotBetween(String value1, String value2) {
            addCriterion("ExpirationDate not between", value1, value2, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("Location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("Location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("Location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("Location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("Location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("Location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("Location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("Location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("Location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("Location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("Location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("Location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("Location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("Location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsIsNull() {
            addCriterion("\"FirePreventionDistricts\" is null");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsIsNotNull() {
            addCriterion("\"FirePreventionDistricts\" is not null");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsEqualTo(String value) {
            addCriterion("\"FirePreventionDistricts\" =", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsNotEqualTo(String value) {
            addCriterion("\"FirePreventionDistricts\" <>", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsGreaterThan(String value) {
            addCriterion("\"FirePreventionDistricts\" >", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsGreaterThanOrEqualTo(String value) {
            addCriterion("\"FirePreventionDistricts\" >=", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsLessThan(String value) {
            addCriterion("\"FirePreventionDistricts\" <", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsLessThanOrEqualTo(String value) {
            addCriterion("\"FirePreventionDistricts\" <=", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsLike(String value) {
            addCriterion("\"FirePreventionDistricts\" like", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsNotLike(String value) {
            addCriterion("\"FirePreventionDistricts\" not like", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsIn(List<String> values) {
            addCriterion("\"FirePreventionDistricts\" in", values, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsNotIn(List<String> values) {
            addCriterion("\"FirePreventionDistricts\" not in", values, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsBetween(String value1, String value2) {
            addCriterion("\"FirePreventionDistricts\" between", value1, value2, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsNotBetween(String value1, String value2) {
            addCriterion("\"FirePreventionDistricts\" not between", value1, value2, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsIsNull() {
            addCriterion("\"PoliceDistricts\" is null");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsIsNotNull() {
            addCriterion("\"PoliceDistricts\" is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsEqualTo(String value) {
            addCriterion("\"PoliceDistricts\" =", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsNotEqualTo(String value) {
            addCriterion("\"PoliceDistricts\" <>", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsGreaterThan(String value) {
            addCriterion("\"PoliceDistricts\" >", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsGreaterThanOrEqualTo(String value) {
            addCriterion("\"PoliceDistricts\" >=", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsLessThan(String value) {
            addCriterion("\"PoliceDistricts\" <", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsLessThanOrEqualTo(String value) {
            addCriterion("\"PoliceDistricts\" <=", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsLike(String value) {
            addCriterion("\"PoliceDistricts\" like", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsNotLike(String value) {
            addCriterion("\"PoliceDistricts\" not like", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsIn(List<String> values) {
            addCriterion("\"PoliceDistricts\" in", values, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsNotIn(List<String> values) {
            addCriterion("\"PoliceDistricts\" not in", values, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsBetween(String value1, String value2) {
            addCriterion("\"PoliceDistricts\" between", value1, value2, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsNotBetween(String value1, String value2) {
            addCriterion("\"PoliceDistricts\" not between", value1, value2, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsIsNull() {
            addCriterion("\"SupervisorDistricts\" is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsIsNotNull() {
            addCriterion("\"SupervisorDistricts\" is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsEqualTo(String value) {
            addCriterion("\"SupervisorDistricts\" =", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsNotEqualTo(String value) {
            addCriterion("\"SupervisorDistricts\" <>", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsGreaterThan(String value) {
            addCriterion("\"SupervisorDistricts\" >", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsGreaterThanOrEqualTo(String value) {
            addCriterion("\"SupervisorDistricts\" >=", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsLessThan(String value) {
            addCriterion("\"SupervisorDistricts\" <", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsLessThanOrEqualTo(String value) {
            addCriterion("\"SupervisorDistricts\" <=", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsLike(String value) {
            addCriterion("\"SupervisorDistricts\" like", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsNotLike(String value) {
            addCriterion("\"SupervisorDistricts\" not like", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsIn(List<String> values) {
            addCriterion("\"SupervisorDistricts\" in", values, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsNotIn(List<String> values) {
            addCriterion("\"SupervisorDistricts\" not in", values, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsBetween(String value1, String value2) {
            addCriterion("\"SupervisorDistricts\" between", value1, value2, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsNotBetween(String value1, String value2) {
            addCriterion("\"SupervisorDistricts\" not between", value1, value2, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andZipCodesIsNull() {
            addCriterion("\"ZipCodes\" is null");
            return (Criteria) this;
        }

        public Criteria andZipCodesIsNotNull() {
            addCriterion("\"ZipCodes\" is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodesEqualTo(String value) {
            addCriterion("\"ZipCodes\" =", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesNotEqualTo(String value) {
            addCriterion("\"ZipCodes\" <>", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesGreaterThan(String value) {
            addCriterion("\"ZipCodes\" >", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesGreaterThanOrEqualTo(String value) {
            addCriterion("\"ZipCodes\" >=", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesLessThan(String value) {
            addCriterion("\"ZipCodes\" <", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesLessThanOrEqualTo(String value) {
            addCriterion("\"ZipCodes\" <=", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesLike(String value) {
            addCriterion("\"ZipCodes\" like", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesNotLike(String value) {
            addCriterion("\"ZipCodes\" not like", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesIn(List<String> values) {
            addCriterion("\"ZipCodes\" in", values, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesNotIn(List<String> values) {
            addCriterion("\"ZipCodes\" not in", values, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesBetween(String value1, String value2) {
            addCriterion("\"ZipCodes\" between", value1, value2, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesNotBetween(String value1, String value2) {
            addCriterion("\"ZipCodes\" not between", value1, value2, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsIsNull() {
            addCriterion("\"Neighborhoods \" is null");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsIsNotNull() {
            addCriterion("\"Neighborhoods \" is not null");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsEqualTo(String value) {
            addCriterion("\"Neighborhoods \" =", value, "neighborhoods");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsNotEqualTo(String value) {
            addCriterion("\"Neighborhoods \" <>", value, "neighborhoods");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsGreaterThan(String value) {
            addCriterion("\"Neighborhoods \" >", value, "neighborhoods");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsGreaterThanOrEqualTo(String value) {
            addCriterion("\"Neighborhoods \" >=", value, "neighborhoods");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsLessThan(String value) {
            addCriterion("\"Neighborhoods \" <", value, "neighborhoods");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsLessThanOrEqualTo(String value) {
            addCriterion("\"Neighborhoods \" <=", value, "neighborhoods");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsLike(String value) {
            addCriterion("\"Neighborhoods \" like", value, "neighborhoods");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsNotLike(String value) {
            addCriterion("\"Neighborhoods \" not like", value, "neighborhoods");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsIn(List<String> values) {
            addCriterion("\"Neighborhoods \" in", values, "neighborhoods");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsNotIn(List<String> values) {
            addCriterion("\"Neighborhoods \" not in", values, "neighborhoods");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsBetween(String value1, String value2) {
            addCriterion("\"Neighborhoods \" between", value1, value2, "neighborhoods");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsNotBetween(String value1, String value2) {
            addCriterion("\"Neighborhoods \" not between", value1, value2, "neighborhoods");
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