package pl.coderslab.FMS;

public class ContactsViewMode {

    private String mode;

    private long objectId;

    private String searchMode = "all";

    private String emailSearch;

    private String companyNameSearch;

    private String contactPersonSearch;

    //setter & getter


    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public long getObjectId() {
        return objectId;
    }

    public void setObjectId(long objectId) {
        this.objectId = objectId;
    }

    public String getSearchMode() {
        return searchMode;
    }

    public void setSearchMode(String searchMode) {
        this.searchMode = searchMode;
    }

    public String getEmailSearch() {
        return emailSearch;
    }

    public void setEmailSearch(String emailSearch) {
        this.emailSearch = emailSearch;
    }

    public String getCompanyNameSearch() {
        return companyNameSearch;
    }

    public void setCompanyNameSearch(String companyNameSearch) {
        this.companyNameSearch = companyNameSearch;
    }

    public String getContactPersonSearch() {
        return contactPersonSearch;
    }

    public void setContactPersonSearch(String contactPersonSearch) {
        this.contactPersonSearch = contactPersonSearch;
    }
}
