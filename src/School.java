public class School {
    int schoolid;
    String name;
    int schoolcode;

    public School(int schoolid, String name, int schoolcode) {
        this.schoolid = schoolid;
        this.name = name;
        this.schoolcode = schoolcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchoolcode() {
        return schoolcode;
    }

    public void setSchoolcode(int schoolcode) {
        this.schoolcode = schoolcode;
    }

    public int getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(int schoolid) {
        this.schoolid = schoolid;
    }
}

