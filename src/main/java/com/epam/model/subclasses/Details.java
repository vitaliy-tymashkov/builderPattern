package com.epam.model.subclasses;

public class Details {

    private Long bookingId;
    private SubData subData;
    private SubClassNotUsedAtBuild subClassNotUsedAtBuild; //To show the behaviour if field is not initialized

//    public long getBookingId() {
//        return bookingId;
//    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public SubData getSubData() {
        return subData;
    }

    public void setSubData(SubData subData) {
        this.subData = subData;
    }

    public SubClassNotUsedAtBuild getSubClassNotUsedAtBuild() {
        return subClassNotUsedAtBuild;
    }

    public void setSubClassNotUsedAtBuild(SubClassNotUsedAtBuild subClassNotUsedAtBuild) {
        this.subClassNotUsedAtBuild = subClassNotUsedAtBuild;
    }

    @Override
    public String toString() {
        return "Details{" +
                "bookingId=" + bookingId +
                ", subData=" + subData +
                ", subClassNotUsedAtBuild=" + subClassNotUsedAtBuild +
                '}';
    }

    public String toXml() {
        return "<Details>" + "\n" +
                ((bookingId != null) ? ("<bookingId>" + bookingId + "</bookingId>" + "\n") : "" ) +
                ((subData != null) ? subData.toXml() : "") + "\n" +
                ((subClassNotUsedAtBuild != null) ? subClassNotUsedAtBuild.toXml() : "") + "\n" +
                "</Details>";
    }
}
