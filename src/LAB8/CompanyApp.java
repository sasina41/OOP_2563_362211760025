package LAB8;

public class CompanyApp {
    public static void main(String[] args) {

        Employee eme1 = new Employee();

        eme1.setPid("1930500229176");
        eme1.setName("Sasina Nimkhon");
        eme1.setAge(22);
        eme1.setGender("female");
        eme1.setTel("0980945964");

        eme1.setEmpID("emp001");
        eme1.setPosition("Student");
        eme1.setSalary(10000.00);

        //display object data
        System.out.println(eme1.toString());
    }



}//class


