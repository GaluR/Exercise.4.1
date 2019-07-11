public class Course {
    String courseName;
    int courseLength;
    String courseCategory;
    String courseDescription;
    double price;

    Course(String cN, int cL, String cC, String cD, double p){
        courseName = cN;
        courseLength = cL;
        courseCategory = cC;
        courseDescription = cD;
        price = p;
    }

    void showCourse(){
        System.out.println(courseName + ", category: " + courseCategory + ", length: " + courseLength + " min" + " price: " + price);
    }

    double totalPrice (){
        return price;
    }

    double discountPrice(double a){
        return totalPrice()*0.9;
    }
}
