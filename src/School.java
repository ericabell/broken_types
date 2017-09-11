public class School {
    private int numStudents;
    private int numberOfTeachersInTheSchool;
    private double averageGPA;

    private String nameOfSchool;
    private String cityInWhichTheSchoolResides;
    private boolean isPublic;

    public School(int numStudents, int numberOfTeachersInTheSchool, double averageGPA, String nameOfSchool, String cityInWhichTheSchoolResides, boolean isPublic) {
        this.numStudents = numStudents;
        this.numberOfTeachersInTheSchool = numberOfTeachersInTheSchool;
        this.averageGPA = averageGPA;
        this.nameOfSchool = nameOfSchool;
        this.cityInWhichTheSchoolResides = cityInWhichTheSchoolResides;
        this.isPublic = isPublic;
    }

    @Override
    public String toString() {
        return "School{" +
                ", nameOfSchool='" + nameOfSchool + '\'' +
                ", numberOfTeachersInTheSchool=" + numberOfTeachersInTheSchool +
                '}';
    }

    public String report() {
        String reportOutput = "";
        if( numStudents >= 10 ) {
            reportOutput += "We have at least 10 students. ";
        }
        if( numberOfTeachersInTheSchool >= 5 ) {
            reportOutput += "We have at least 5 teachers. ";
        }

        return reportOutput;
    }
}
