public class Student {
    private String name;
    private String facNumber;

    public Student(String name, String facNumber) throws StudentException {
       setName(name);
       setFacNumber(facNumber);
    }
    public String getName() {
        return name;
    }
    public void setName(String name)throws StudentException {
        if(name == null || name.isEmpty()){
            throw new StudentException("Name cannot be null or empty");
        }
        this.name = name;
    }
    public String getFacNumber() {
        return facNumber;
    }
    public void setFacNumber(String facNumber) throws StudentException {
        if(facNumber.length() != 10){
            throw new StudentException("Faculty number must be exactly 10 characters long");
        }
        this.facNumber = facNumber;
    }

}
