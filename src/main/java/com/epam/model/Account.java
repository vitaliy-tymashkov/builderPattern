package com.epam.model;

import com.epam.model.subclasses.Details;
import com.epam.model.subclasses.SubClassNotUsedAtBuild;
import com.epam.model.subclasses.SubData;

/**
 * https://habr.com/ru/post/244521/
 * Added with subclasses - Account > Details > SubData
 * */
public class Account {

    private String userId;
    private String token;
    private String details_bookingId;
    private String details_subData_data;
    private String details_subData_hash;

    private String details_subClassNotUsedAtBuild_dataNotUsed; //To show the behaviour if field is not initialized
    private String details_subClassNotUsedAtBuild_hashNotUsed; //To show the behaviour if field is not initialized

    private Details details;
    private SubData subData;
    private SubClassNotUsedAtBuild subClassNotUsedAtBuild;      //To show the behaviour if field is not initialized

    private Account() {
        // private constructor
    }

//    private String getUserId() {
//        return userId;
//    }

    private void setUserId(String userId) {
        this.userId = userId;
    }

//    private String getToken() {
//        return token;
//    }

    private void setToken(String token) {
        this.token = token;
    }

//    private String getDetails_bookingId() {
//        return details_bookingId;
//    }

    private void setDetails_bookingId(String details_bookingId) {
        this.details_bookingId = details_bookingId;
    }

//    private String getDetails_subData_data() {
//        return details_subData_data;
//    }

    private void setDetails_subData_data(String details_subData_data) {
        this.details_subData_data = details_subData_data;
    }

//    private String getDetails_subData_hash() {
//        return details_subData_hash;
//    }

    private void setDetails_subData_hash(String details_subData_hash) {
        this.details_subData_hash = details_subData_hash;
    }

//    private String getDetails_subClassNotUsedAtBuild_dataNotUsed() {
//        return details_subClassNotUsedAtBuild_dataNotUsed;
//    }

    private void setDetails_subClassNotUsedAtBuild_dataNotUsed(String details_subClassNotUsedAtBuild_dataNotUsed) {
        this.details_subClassNotUsedAtBuild_dataNotUsed = details_subClassNotUsedAtBuild_dataNotUsed;
    }

//    private String getDetails_subClassNotUsedAtBuild_hashNotUsed() {
//        return details_subClassNotUsedAtBuild_hashNotUsed;
//    }

    private void setDetails_subClassNotUsedAtBuild_hashNotUsed(String details_subClassNotUsedAtBuild_hashNotUsed) {
        this.details_subClassNotUsedAtBuild_hashNotUsed = details_subClassNotUsedAtBuild_hashNotUsed;
    }

    private Details getDetails() {
        return details;
    }

    private void setDetails(Details details) {
        this.details = details;
    }

    private SubData getSubData() {
        return subData;
    }

    private void setSubData(SubData subData) {
        this.subData = subData;
    }

    private SubClassNotUsedAtBuild getSubClassNotUsedAtBuild() {
        return subClassNotUsedAtBuild;
    }

    private void setSubClassNotUsedAtBuild(SubClassNotUsedAtBuild subClassNotUsedAtBuild) {
        this.subClassNotUsedAtBuild = subClassNotUsedAtBuild;
    }

    /** new Builder - creates new parent class = Account and runs Builder class */
    public static Builder newBuilder() {
        return new Account().new Builder();
    }

    /** Inner Builder to set fields */
    public class Builder {

        // private constructor
        private Builder() {
        }

        public Builder withUserId(String userId) {
            Account.this.setUserId(userId);     //            Account.this.userId = userId;
            return this;
        }

        public Builder withToken(String token) {
            Account.this.setToken(token);       //            Account.this.token = token;
            return this;
        }

        public Builder withDetails_bookingId(Long bookindId) {
            if (Account.this.getDetails() == null){
                Account.this.setDetails(new Details());
            }
            Account.this.getDetails().setBookingId(bookindId);
            return this;
        }

        public Builder withDetails_SubData_data(String data) {
            if (Account.this.details.getSubData() == null){
                Account.this.details.setSubData(new SubData());
            }
            Account.this.details.getSubData().setData(data);
            return this;
        }

        public Builder withDetails_SubData_hash(String hash) {
            if (Account.this.details.getSubData() == null){
                Account.this.details.setSubData(new SubData());
            }
            Account.this.details.getSubData().setHash(hash);
            return this;
        }


        /** Build method*/
        public Account build() {
            return Account.this;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId='" + userId + '\'' +
                ", token='" + token + '\'' +
                ", details=" + details +
                '}';
    }


    public String toXml() {
        return "<Account>" + "\n" +
                ((userId != null) ? ("<userId>" + userId + "</userId>" + "\n") : "") +
                ((token != null) ? ("<token>" + token + "</token>" + "\n") : "") +
                ((details != null)? details.toXml() : "") + "\n" +
                "</Account>";
    }
}