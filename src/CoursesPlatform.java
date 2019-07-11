public class CoursesPlatform {
    public static void main(String[] args) {
        Course course1 = new Course("Java", 5400, "Programming", "Best programming tutorials online", 199);
        Course course2 = new Course("Android", 3600, "Programming", "Best programming tutorials online", 149);
        Course course3 = new Course("Fast Reading", 2200, "Self development", "Learn How to become the best version of Yourself Today", 139);


        System.out.println("There are 3 courses in our database:");
        course1.showCourse();
        course2.showCourse();
        course3.showCourse();

        System.out.println("Special offer! Buy 3 courses and save 10%");
        double totalPrice = course1.price + course2.price + course3.price;
        double discountPrice = totalPrice * 0.9;
        System.out.printf("  > Price after discount: %.2fzl (before: %.2fzl)", discountPrice, totalPrice);
        int sumOfLengthCourseHours = (course1.courseLength + course2.courseLength + course3.courseLength)/60;
        int sumOfLengthCourseMinutes = (course1.courseLength + course2.courseLength + course3.courseLength)%60;
        System.out.printf("\nYou will need %s hours and %s min to finish all courses", sumOfLengthCourseHours, sumOfLengthCourseMinutes);
    }
}
