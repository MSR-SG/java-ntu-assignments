public class PersonalInfo
{
    private String name;
    private Integer age;
    private double height;
    private boolean isStudent;
    private char grade;

    public PersonalInfo(String name, Integer age, double height, boolean isStudent, char grade)
    {
        // This initializes the fields with the parameter values.
        this.name = name;
        this.age = age;
        this.height = height;
        this.isStudent = isStudent;
        this.grade = grade;
    }

    // Getters and Setters for the properties.
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public boolean isStudent()
    {
        return isStudent;
    }

    public void setStudent(boolean isStudent)
    {
        this.isStudent = isStudent;
    }

    public char getGrade()
    {
        return grade;
    }

    public void setGrade(char grade)
    {
        this.grade = grade;
    }

    /*
     * Thsi is a demo method to make PersonalInfo object with sample values
     * and prints out its fields.
     */
    public static void main(String[] args)
    {
        // This instantiates the Personal Info class with sample values.
        PersonalInfo person = new PersonalInfo("Alice", 20, 1.65, true, 'A');

        // Print out the properties.
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Height: " + person.getHeight() + " meters");
        System.out.println("Is Student: " + person.isStudent());
        System.out.println("Grade: " + person.getGrade());

        // This shows the boxing.
        System.out.println("\nAge is the Wrapper Integer class, used to illustrate boxing / unboxing");
        int intAge = 22;
        Integer boxedAge = intAge; // boxing from int to Integer
        person.setAge(boxedAge);
        System.out.println("Age after boxing int to Integer: " + person.getAge());

        // This shows the unboxing.
        int unboxedAge = person.getAge(); // unboxing from Integer to int
        System.out.println("Age after unboxing Integer to int: " + unboxedAge);
    }
}
