package com.epam.model.subclasses;

//To show the behaviour if field is not initialized
public class SubClassNotUsedAtBuild {
    private String dataNotUsed;
    private String hashNotUsed;

//    public String getDataNotUsed() {
//        return dataNotUsed;
//    }

    public void setDataNotUsed(String dataNotUsed) {
        this.dataNotUsed = dataNotUsed;
    }

//    public String getHashNotUsed() {
//        return hashNotUsed;
//    }

    public void setHashNotUsed(String hashNotUsed) {
        this.hashNotUsed = hashNotUsed;
    }

    @Override
    public String toString() {
        return "SubClassNotUsedAtBuild{" +
                "dataNotUsed='" + dataNotUsed + '\'' +
                ", hashNotUsed='" + hashNotUsed + '\'' +
                '}';
    }

                            //TODO Null check
    public String toXml() {
        return "<SubClassNotUsedAtBuild>" + "\n" +
               "<dataNotUsed>" + dataNotUsed + "</dataNotUsed>" + "\n" +
               "<hashNotUsed>" + hashNotUsed + "</hashNotUsed>" + "\n" +
               "</SubClassNotUsedAtBuild>";
        }
}
