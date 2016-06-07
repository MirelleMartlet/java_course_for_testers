package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickname;
    private final String title;
    private final String company;
    private final String companyAddress;
    private final String homePhone;
    private final String mobilePhone;
    private final String workPhone;
    private final String fax;
    private final String email1;
    private final String email2;
    private final String homepage;
    private final String address2;
    private final String home;
    private final String notes;
    private final String year;
    private final String year2;
    private final int date1;
    private final int month1;
    private final int date2;
    private final int month2;
    private int group;

    public ContactData(String firstName, String middleName, String lastName, String nickname, String title, String company, String companyAddress, String homePhone, String mobilePhone, String workPhone, String fax, String email1, String email2, String homepage, String address2, String home, String notes, String year, String year2, int date1, int month1, int date2, int month2, int group) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.companyAddress = companyAddress;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.fax = fax;
        this.email1 = email1;
        this.email2 = email2;
        this.homepage = homepage;
        this.address2 = address2;
        this.home = home;
        this.notes = notes;
        this.year = year;
        this.year2 = year2;
        this.date1 = date1;
        this.month1 = month1;
        this.date2 = date2;
        this.month2 = month2;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail1() {
        return email1;
    }

    public String getEmail2() {
        return email2;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getAddress2() {
        return address2;
    }

    public String getHome() {
        return home;
    }

    public String getNotes() {
        return notes;
    }

    public String getYear() {
        return year;
    }

    public String getYear2() {
        return year2;
    }

    public int getDate1() {
        return date1;
    }

    public int getMonth1() {
        return month1;
    }

    public int getDate2() {
        return date2;
    }

    public int getMonth2() {
        return month2;
    }

    public int getGroup() {
        return group;
    }
}
