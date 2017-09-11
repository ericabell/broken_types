public class Main {

    public static String add(double x, double y) {
        return String.valueOf(x) + ", " + String.valueOf(y);
    }

    public static void main(String[] args) {
	// write your code here

        // let's test the add method first
        double d1 = 10.23456;
        double d2 = 20.1874635;

        System.out.println(add(d1, d2));


        // now we create the school
        School school = new School(403, 62, 2.98, "Grady High School", "Atlanta, GA", true);

        // what does toString give us?
        System.out.println(school);

        // what does report give us?
        System.out.println(school.report());
    }
}



// ORIGINAL CODE COPIED FROM NEWLINE
//public class School {public static void main(String[] args) {
//    int numStudents;
//    int NumberOfTeachersInTheSchool;
//    double average_gpa;
//
//
//
//
//
//
//    String n;
//    String CityInWhichTheSchoolResides;
//    boolean IS_PUBLIC;
//
//    numStudents = "403";
//    city = Atlanta, GA;
//    numTeachers = "62";
//    averageGPA = 2.98
//    name = Grady High School;
//    isPublic = yes;
//
//    println("School: " + name);
//    println("Teachers: " numberOfTeachers);
//
//    function(averageGPA, city);int var = null;
//
//    if (numStudents) {print "We have at least 10 students"}
//    while (numTeach) {
//        System.out.println(We have at least 5 teachers);
//    }
//}
//
//    public static function (double x, double y) {
//        System.out.println(x + ", ", + y.toString());
//    }
//}

