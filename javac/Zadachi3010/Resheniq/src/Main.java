public class Main {
    public static void main(String[] args) throws StudentException {
        try{
            Student st1 = new Student("h","54");
            System.out.printf("Name: %s\nFaculty number: %s",st1.getName(),st1.getFacNumber());
        }catch(StudentException e){
            e.printStackTrace();
        }
    }
}